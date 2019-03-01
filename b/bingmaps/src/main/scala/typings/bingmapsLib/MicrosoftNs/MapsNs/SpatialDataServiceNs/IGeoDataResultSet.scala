package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoDataResultSet extends js.Object {
  /** Copyright information for the GeoData API. */
  var Copyright: java.lang.String
  /** The location provided in the query that generated this result. */
  var location: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location
  /** Results of the boundary data. */
  var results: js.Array[IGeoDataResult]
}

object IGeoDataResultSet {
  @scala.inline
  def apply(
    Copyright: java.lang.String,
    location: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location,
    results: js.Array[IGeoDataResult]
  ): IGeoDataResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Copyright")(Copyright)
    __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[IGeoDataResultSet]
  }
}

