package ProjectAuto;

    class CarBody {

        String name, model, drive_type;
        private final double wheel_diameter, tank_volume;
        private final int doors, seats;


        public CarBody(String name, String model, String drive_type, double wheel_diameter, double tank_volume, int doors, int seats){
            this.model=model;
            this.name=name;
            this.drive_type=drive_type;
            this.wheel_diameter=wheel_diameter;
            this.tank_volume=tank_volume;
            this.doors=doors;
            this.seats=seats;
        }

        public String getName() {return name;}

        public String getModel() {
            return model;
        }

        public String getDrive_type() {
            return drive_type;
        }

        public double getWheel_diameter() {
            return wheel_diameter;
        }

        public double getTank_volume() {
            return tank_volume;
        }

        public int getDoors() {
            return doors;
        }

        public int getSeats() {
            return seats;
        }

    }


    class Transmission{
        String transmission_type;
        double transmission_max_torque;
        int gear_number;

        Transmission (String transmission_type, int gear_number, double transmission_max_torque) {
            this.transmission_type = transmission_type;
            this.gear_number = gear_number;
            this.transmission_max_torque=transmission_max_torque;
        }

        public String getTransmission_type() {
            return transmission_type;
        }

        public int getGear_number() {
            return gear_number;
        }

        public double getTransmission_max_torque() {return transmission_max_torque; }

    }


     class Engine {
        String fuel_type;
        double engine_volume, engine_max_torque;

        public Engine(String fuel_type, double engine_volume, double engine_max_torque) {
            this.engine_max_torque = engine_max_torque;
            this.engine_volume = engine_volume;
            this.fuel_type = fuel_type;
        }


        public String getFuel_type() {
            return fuel_type;
        }

        public double getEngine_volume() {
            return engine_volume;
        }

        public double getEngine_max_torque() {
            return engine_max_torque;
        }

    }
