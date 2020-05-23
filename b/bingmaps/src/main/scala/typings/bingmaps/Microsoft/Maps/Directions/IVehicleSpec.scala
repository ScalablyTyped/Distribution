package typings.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVehicleSpec extends js.Object {
  /**
    * The unit of measurement of width, height, length. Can be one of the following values:
    * •	meter or m [default]
    * •	foot or ft
    */
  var dimensionUnit: js.UndefOr[String] = js.undefined
  /** Indicates if the vehicle shall avoid crosswinds. */
  var vehicleAvoidCrossWind: js.UndefOr[Boolean] = js.undefined
  /** Indicates if the route shall avoid the risk of grounding. */
  var vehicleAvoidGroundingRisk: js.UndefOr[Boolean] = js.undefined
  /** The number of axles. */
  var vehicleAxles: js.UndefOr[Double] = js.undefined
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
  var vehicleHazardousMaterials: js.UndefOr[String] = js.undefined
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
  var vehicleHazardousPermits: js.UndefOr[String] = js.undefined
  /** The height of the vehicle in the specified dimension units. */
  var vehicleHeight: js.UndefOr[Double] = js.undefined
  /** The length of the vehicle in the specified dimension units. */
  var vehicleLength: js.UndefOr[Double] = js.undefined
  /** The maximum gradient the vehicle can drive measured in degrees. */
  var vehicleMaxGradient: js.UndefOr[Boolean] = js.undefined
  /** The minimum required radius for the vehicle to turn in the specified dimension units. */
  var vehicleMinTurnRadius: js.UndefOr[Double] = js.undefined
  /** Indicates if the truck is pulling a semi-trailer. Semi-trailer restrictions are mostly used in North America. */
  var vehicleSemi: js.UndefOr[Boolean] = js.undefined
  /** The number of trailers. */
  var vehicleTrailers: js.UndefOr[Double] = js.undefined
  /** The weight of the vehicle in the specified weight units. */
  var vehicleWeight: js.UndefOr[Double] = js.undefined
  /** The width of the vehicle in the specified dimension units. */
  var vehicleWidth: js.UndefOr[Double] = js.undefined
  /**
    * The unit of measurement of weight. Can be one of the following values:
    * •	kilogram or kg [default]
    * •	pound or lb
    */
  var weightUnit: js.UndefOr[String] = js.undefined
}

object IVehicleSpec {
  @scala.inline
  def apply(
    dimensionUnit: String = null,
    vehicleAvoidCrossWind: js.UndefOr[Boolean] = js.undefined,
    vehicleAvoidGroundingRisk: js.UndefOr[Boolean] = js.undefined,
    vehicleAxles: js.UndefOr[Double] = js.undefined,
    vehicleHazardousMaterials: String = null,
    vehicleHazardousPermits: String = null,
    vehicleHeight: js.UndefOr[Double] = js.undefined,
    vehicleLength: js.UndefOr[Double] = js.undefined,
    vehicleMaxGradient: js.UndefOr[Boolean] = js.undefined,
    vehicleMinTurnRadius: js.UndefOr[Double] = js.undefined,
    vehicleSemi: js.UndefOr[Boolean] = js.undefined,
    vehicleTrailers: js.UndefOr[Double] = js.undefined,
    vehicleWeight: js.UndefOr[Double] = js.undefined,
    vehicleWidth: js.UndefOr[Double] = js.undefined,
    weightUnit: String = null
  ): IVehicleSpec = {
    val __obj = js.Dynamic.literal()
    if (dimensionUnit != null) __obj.updateDynamic("dimensionUnit")(dimensionUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleAvoidCrossWind)) __obj.updateDynamic("vehicleAvoidCrossWind")(vehicleAvoidCrossWind.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleAvoidGroundingRisk)) __obj.updateDynamic("vehicleAvoidGroundingRisk")(vehicleAvoidGroundingRisk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleAxles)) __obj.updateDynamic("vehicleAxles")(vehicleAxles.get.asInstanceOf[js.Any])
    if (vehicleHazardousMaterials != null) __obj.updateDynamic("vehicleHazardousMaterials")(vehicleHazardousMaterials.asInstanceOf[js.Any])
    if (vehicleHazardousPermits != null) __obj.updateDynamic("vehicleHazardousPermits")(vehicleHazardousPermits.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleHeight)) __obj.updateDynamic("vehicleHeight")(vehicleHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleLength)) __obj.updateDynamic("vehicleLength")(vehicleLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleMaxGradient)) __obj.updateDynamic("vehicleMaxGradient")(vehicleMaxGradient.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleMinTurnRadius)) __obj.updateDynamic("vehicleMinTurnRadius")(vehicleMinTurnRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleSemi)) __obj.updateDynamic("vehicleSemi")(vehicleSemi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleTrailers)) __obj.updateDynamic("vehicleTrailers")(vehicleTrailers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleWeight)) __obj.updateDynamic("vehicleWeight")(vehicleWeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleWidth)) __obj.updateDynamic("vehicleWidth")(vehicleWidth.get.asInstanceOf[js.Any])
    if (weightUnit != null) __obj.updateDynamic("weightUnit")(weightUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVehicleSpec]
  }
}

