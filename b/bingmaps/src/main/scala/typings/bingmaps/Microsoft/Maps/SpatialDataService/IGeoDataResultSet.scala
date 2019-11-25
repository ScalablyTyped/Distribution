package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.Location
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
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGeoDataResultSet]
  }
}

