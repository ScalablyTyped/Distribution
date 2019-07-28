package typings.bingmaps.MicrosoftNs.MapsNs.SearchNs

import typings.bingmaps.MicrosoftNs.MapsNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Search.SearchManager")
@js.native
class SearchManager protected () extends js.Object {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Search module.
    * @param map A Map object
    */
  def this(map: Map) = this()
  /**
    * Matches the address or place query in the specified request 
    * options to a location and returns the results to the request 
    * options callback function.
    * @param request Options for sending geocode request
    */
  def geocode(request: IGeocodeRequestOptions): Unit = js.native
  /**
    * Matches the specified location to an address and returns the 
    * address results to the specified request options callback function.
    * @param request Options for sending reverse geocode request
    */
  def reverseGeocode(request: ReverseGeocodeRequestOptions): Unit = js.native
}

