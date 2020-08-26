package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoDataResultSet extends js.Object {
  /** Copyright information for the GeoData API. */
  var Copyright: String = js.native
  /** The location provided in the query that generated this result. */
  var location: String | Location = js.native
  /** Results of the boundary data. */
  var results: js.Array[IGeoDataResult] = js.native
}

object IGeoDataResultSet {
  @scala.inline
  def apply(Copyright: String, location: String | Location, results: js.Array[IGeoDataResult]): IGeoDataResultSet = {
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoDataResultSet]
  }
  @scala.inline
  implicit class IGeoDataResultSetOps[Self <: IGeoDataResultSet] (val x: Self) extends AnyVal {
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
    def setCopyright(value: String): Self = this.set("Copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String | Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: IGeoDataResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[IGeoDataResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

