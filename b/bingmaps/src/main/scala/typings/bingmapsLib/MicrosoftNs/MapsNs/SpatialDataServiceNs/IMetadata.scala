package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadata extends js.Object {
  /** The approximate total surface area (in square kilometers) covered by all the polygons that comprise this entity. */
  var AreaSqKm: java.lang.String
  /**
    * An area on the Earth that provides the best map view for this entity. This area is defined as a bounding box in the format of a
    * “MULTIPOINT ((WestLongitude SouthLatitude), (EastLongitude NorthLatitude))”.
    */
  var BestMapViewBox: java.lang.String
  /** The culture associated with this entity. Example: en */
  var OfficialCulture: java.lang.String
  /** The approximate population within this entity. Example: PopClass20000to99999 */
  var PopulationClass: java.lang.String
  /** The regional culture associated with this entity. */
  var RegionalCulture: java.lang.String
}

object IMetadata {
  @scala.inline
  def apply(
    AreaSqKm: java.lang.String,
    BestMapViewBox: java.lang.String,
    OfficialCulture: java.lang.String,
    PopulationClass: java.lang.String,
    RegionalCulture: java.lang.String
  ): IMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AreaSqKm")(AreaSqKm)
    __obj.updateDynamic("BestMapViewBox")(BestMapViewBox)
    __obj.updateDynamic("OfficialCulture")(OfficialCulture)
    __obj.updateDynamic("PopulationClass")(PopulationClass)
    __obj.updateDynamic("RegionalCulture")(RegionalCulture)
    __obj.asInstanceOf[IMetadata]
  }
}

