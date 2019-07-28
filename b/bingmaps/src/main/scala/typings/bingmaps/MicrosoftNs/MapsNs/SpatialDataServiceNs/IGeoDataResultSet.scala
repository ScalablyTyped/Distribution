package typings.bingmaps.MicrosoftNs.MapsNs.SpatialDataServiceNs

import typings.bingmaps.MicrosoftNs.MapsNs.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoDataResultSet extends js.Object {
  /** Copyright information for the GeoData API. */
  var Copyright: String
  /** The location provided in the query that generated this result. */
  var location: String | Location
  /** Results of the boundary data. */
  var results: js.Array[IGeoDataResult]
}

object IGeoDataResultSet {
  @scala.inline
  def apply(Copyright: String, location: String | Location, results: js.Array[IGeoDataResult]): IGeoDataResultSet = {
    val __obj = js.Dynamic.literal(Copyright = Copyright, location = location.asInstanceOf[js.Any], results = results)
  
    __obj.asInstanceOf[IGeoDataResultSet]
  }
}

