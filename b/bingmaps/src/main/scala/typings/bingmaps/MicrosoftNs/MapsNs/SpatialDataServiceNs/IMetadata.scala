package typings.bingmaps.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadata extends js.Object {
  /** The approximate total surface area (in square kilometers) covered by all the polygons that comprise this entity. */
  var AreaSqKm: String
  /**
    * An area on the Earth that provides the best map view for this entity. This area is defined as a bounding box in the format of a
    * “MULTIPOINT ((WestLongitude SouthLatitude), (EastLongitude NorthLatitude))”.
    */
  var BestMapViewBox: String
  /** The culture associated with this entity. Example: en */
  var OfficialCulture: String
  /** The approximate population within this entity. Example: PopClass20000to99999 */
  var PopulationClass: String
  /** The regional culture associated with this entity. */
  var RegionalCulture: String
}

object IMetadata {
  @scala.inline
  def apply(
    AreaSqKm: String,
    BestMapViewBox: String,
    OfficialCulture: String,
    PopulationClass: String,
    RegionalCulture: String
  ): IMetadata = {
    val __obj = js.Dynamic.literal(AreaSqKm = AreaSqKm, BestMapViewBox = BestMapViewBox, OfficialCulture = OfficialCulture, PopulationClass = PopulationClass, RegionalCulture = RegionalCulture)
  
    __obj.asInstanceOf[IMetadata]
  }
}

