package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVehicleSpec extends js.Object {
  /**
    * The unit of measurement of width, height, length. Can be one of the following values:
    * •	meter or m [default]
    * •	foot or ft
    */
  var dimensionUnit: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates if the vehicle shall avoid crosswinds. */
  var vehicleAvoidCrossWind: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates if the route shall avoid the risk of grounding. */
  var vehicleAvoidGroundingRisk: js.UndefOr[scala.Boolean] = js.undefined
  /** The number of axles. */
  var vehicleAxles: js.UndefOr[scala.Double] = js.undefined
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
  var vehicleHazardousMaterials: js.UndefOr[java.lang.String] = js.undefined
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
  var vehicleHazardousPermits: js.UndefOr[java.lang.String] = js.undefined
  /** The height of the vehicle in the specified dimension units. */
  var vehicleHeight: js.UndefOr[scala.Double] = js.undefined
  /** The length of the vehicle in the specified dimension units. */
  var vehicleLength: js.UndefOr[scala.Double] = js.undefined
  /** The maximum gradient the vehicle can drive measured in degrees. */
  var vehicleMaxGradient: js.UndefOr[scala.Boolean] = js.undefined
  /** The minimum required radius for the vehicle to turn in the specified dimension units. */
  var vehicleMinTurnRadius: js.UndefOr[scala.Double] = js.undefined
  /** Indicates if the truck is pulling a semi-trailer. Semi-trailer restrictions are mostly used in North America. */
  var vehicleSemi: js.UndefOr[scala.Boolean] = js.undefined
  /** The number of trailers. */
  var vehicleTrailers: js.UndefOr[scala.Double] = js.undefined
  /** The weight of the vehicle in the specified weight units. */
  var vehicleWeight: js.UndefOr[scala.Double] = js.undefined
  /** The width of the vehicle in the specified dimension units. */
  var vehicleWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The unit of measurement of weight. Can be one of the following values:
    * •	kilogram or kg [default]
    * •	pound or lb
    */
  var weightUnit: js.UndefOr[java.lang.String] = js.undefined
}

object IVehicleSpec {
  @scala.inline
  def apply(
    dimensionUnit: java.lang.String = null,
    vehicleAvoidCrossWind: js.UndefOr[scala.Boolean] = js.undefined,
    vehicleAvoidGroundingRisk: js.UndefOr[scala.Boolean] = js.undefined,
    vehicleAxles: scala.Int | scala.Double = null,
    vehicleHazardousMaterials: java.lang.String = null,
    vehicleHazardousPermits: java.lang.String = null,
    vehicleHeight: scala.Int | scala.Double = null,
    vehicleLength: scala.Int | scala.Double = null,
    vehicleMaxGradient: js.UndefOr[scala.Boolean] = js.undefined,
    vehicleMinTurnRadius: scala.Int | scala.Double = null,
    vehicleSemi: js.UndefOr[scala.Boolean] = js.undefined,
    vehicleTrailers: scala.Int | scala.Double = null,
    vehicleWeight: scala.Int | scala.Double = null,
    vehicleWidth: scala.Int | scala.Double = null,
    weightUnit: java.lang.String = null
  ): IVehicleSpec = {
    val __obj = js.Dynamic.literal()
    if (dimensionUnit != null) __obj.updateDynamic("dimensionUnit")(dimensionUnit)
    if (!js.isUndefined(vehicleAvoidCrossWind)) __obj.updateDynamic("vehicleAvoidCrossWind")(vehicleAvoidCrossWind)
    if (!js.isUndefined(vehicleAvoidGroundingRisk)) __obj.updateDynamic("vehicleAvoidGroundingRisk")(vehicleAvoidGroundingRisk)
    if (vehicleAxles != null) __obj.updateDynamic("vehicleAxles")(vehicleAxles.asInstanceOf[js.Any])
    if (vehicleHazardousMaterials != null) __obj.updateDynamic("vehicleHazardousMaterials")(vehicleHazardousMaterials)
    if (vehicleHazardousPermits != null) __obj.updateDynamic("vehicleHazardousPermits")(vehicleHazardousPermits)
    if (vehicleHeight != null) __obj.updateDynamic("vehicleHeight")(vehicleHeight.asInstanceOf[js.Any])
    if (vehicleLength != null) __obj.updateDynamic("vehicleLength")(vehicleLength.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleMaxGradient)) __obj.updateDynamic("vehicleMaxGradient")(vehicleMaxGradient)
    if (vehicleMinTurnRadius != null) __obj.updateDynamic("vehicleMinTurnRadius")(vehicleMinTurnRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(vehicleSemi)) __obj.updateDynamic("vehicleSemi")(vehicleSemi)
    if (vehicleTrailers != null) __obj.updateDynamic("vehicleTrailers")(vehicleTrailers.asInstanceOf[js.Any])
    if (vehicleWeight != null) __obj.updateDynamic("vehicleWeight")(vehicleWeight.asInstanceOf[js.Any])
    if (vehicleWidth != null) __obj.updateDynamic("vehicleWidth")(vehicleWidth.asInstanceOf[js.Any])
    if (weightUnit != null) __obj.updateDynamic("weightUnit")(weightUnit)
    __obj.asInstanceOf[IVehicleSpec]
  }
}

