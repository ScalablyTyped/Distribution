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

