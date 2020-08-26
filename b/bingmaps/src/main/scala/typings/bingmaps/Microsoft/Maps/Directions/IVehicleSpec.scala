package typings.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVehicleSpec extends js.Object {
  /**
    * The unit of measurement of width, height, length. Can be one of the following values:
    * •	meter or m [default]
    * •	foot or ft
    */
  var dimensionUnit: js.UndefOr[String] = js.native
  /** Indicates if the vehicle shall avoid crosswinds. */
  var vehicleAvoidCrossWind: js.UndefOr[Boolean] = js.native
  /** Indicates if the route shall avoid the risk of grounding. */
  var vehicleAvoidGroundingRisk: js.UndefOr[Boolean] = js.native
  /** The number of axles. */
  var vehicleAxles: js.UndefOr[Double] = js.native
  /**
    * A comma separated and case-sensitive list of one or more hazardous materials for which the vehicle is transporting. Possible values and their aliases are:
    *
    * •	Combustable or C
    * •	Corrosive or Cr
    * •	Explosive or E
    * •	Flammable or F
    * •	FlammableSolid or FS
    * •	Gas or G
    * •	GoodsHarmfulToWater or WH
    * •	Organic or O
    * •	Other
    * •	Poison or P
    * •	PoisonousInhalation or PI
    * •	Radioactive or R
    * •	None
    * 
    * Example: "WH,R,Poison"
    */
  var vehicleHazardousMaterials: js.UndefOr[String] = js.native
  /** 
    * A comma separated and case-sensitive list of one or more hazardous materials for which the vehicle has a permit. Possible values and their aliases are: 
    * 
    * •	AllAppropriateForLoad
    * •	Combustible or C 
    * •	Corrosive or Cr 
    * •	Explosive or E 
    * •	Flammable or F 
    * •	FlammableSolid or FS 
    * •	Gas or G 
    * •	Organic or O 
    * •	Poison or P 
    * •	PoisonousInhalation or PI 
    * •	Radioactive or R 
    * •	None
    * 
    * Example: "C,Explosive,Corrosive" 
    */
  var vehicleHazardousPermits: js.UndefOr[String] = js.native
  /** The height of the vehicle in the specified dimension units. */
  var vehicleHeight: js.UndefOr[Double] = js.native
  /** The length of the vehicle in the specified dimension units. */
  var vehicleLength: js.UndefOr[Double] = js.native
  /** The maximum gradient the vehicle can drive measured in degrees. */
  var vehicleMaxGradient: js.UndefOr[Boolean] = js.native
  /** The minimum required radius for the vehicle to turn in the specified dimension units. */
  var vehicleMinTurnRadius: js.UndefOr[Double] = js.native
  /** Indicates if the truck is pulling a semi-trailer. Semi-trailer restrictions are mostly used in North America. */
  var vehicleSemi: js.UndefOr[Boolean] = js.native
  /** The number of trailers. */
  var vehicleTrailers: js.UndefOr[Double] = js.native
  /** The weight of the vehicle in the specified weight units. */
  var vehicleWeight: js.UndefOr[Double] = js.native
  /** The width of the vehicle in the specified dimension units. */
  var vehicleWidth: js.UndefOr[Double] = js.native
  /**
    * The unit of measurement of weight. Can be one of the following values:
    * •	kilogram or kg [default]
    * •	pound or lb
    */
  var weightUnit: js.UndefOr[String] = js.native
}

object IVehicleSpec {
  @scala.inline
  def apply(): IVehicleSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVehicleSpec]
  }
  @scala.inline
  implicit class IVehicleSpecOps[Self <: IVehicleSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDimensionUnit(value: String): Self = this.set("dimensionUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionUnit: Self = this.set("dimensionUnit", js.undefined)
    @scala.inline
    def setVehicleAvoidCrossWind(value: Boolean): Self = this.set("vehicleAvoidCrossWind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleAvoidCrossWind: Self = this.set("vehicleAvoidCrossWind", js.undefined)
    @scala.inline
    def setVehicleAvoidGroundingRisk(value: Boolean): Self = this.set("vehicleAvoidGroundingRisk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleAvoidGroundingRisk: Self = this.set("vehicleAvoidGroundingRisk", js.undefined)
    @scala.inline
    def setVehicleAxles(value: Double): Self = this.set("vehicleAxles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleAxles: Self = this.set("vehicleAxles", js.undefined)
    @scala.inline
    def setVehicleHazardousMaterials(value: String): Self = this.set("vehicleHazardousMaterials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleHazardousMaterials: Self = this.set("vehicleHazardousMaterials", js.undefined)
    @scala.inline
    def setVehicleHazardousPermits(value: String): Self = this.set("vehicleHazardousPermits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleHazardousPermits: Self = this.set("vehicleHazardousPermits", js.undefined)
    @scala.inline
    def setVehicleHeight(value: Double): Self = this.set("vehicleHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleHeight: Self = this.set("vehicleHeight", js.undefined)
    @scala.inline
    def setVehicleLength(value: Double): Self = this.set("vehicleLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleLength: Self = this.set("vehicleLength", js.undefined)
    @scala.inline
    def setVehicleMaxGradient(value: Boolean): Self = this.set("vehicleMaxGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleMaxGradient: Self = this.set("vehicleMaxGradient", js.undefined)
    @scala.inline
    def setVehicleMinTurnRadius(value: Double): Self = this.set("vehicleMinTurnRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleMinTurnRadius: Self = this.set("vehicleMinTurnRadius", js.undefined)
    @scala.inline
    def setVehicleSemi(value: Boolean): Self = this.set("vehicleSemi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleSemi: Self = this.set("vehicleSemi", js.undefined)
    @scala.inline
    def setVehicleTrailers(value: Double): Self = this.set("vehicleTrailers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleTrailers: Self = this.set("vehicleTrailers", js.undefined)
    @scala.inline
    def setVehicleWeight(value: Double): Self = this.set("vehicleWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleWeight: Self = this.set("vehicleWeight", js.undefined)
    @scala.inline
    def setVehicleWidth(value: Double): Self = this.set("vehicleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVehicleWidth: Self = this.set("vehicleWidth", js.undefined)
    @scala.inline
    def setWeightUnit(value: String): Self = this.set("weightUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightUnit: Self = this.set("weightUnit", js.undefined)
  }
  
}

