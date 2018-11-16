package typings
package bingmapsLib.MicrosoftNs.MapsNs.SearchNs

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
  def this(map: bingmapsLib.MicrosoftNs.MapsNs.Map) = this()
  /**
           * Matches the address or place query in the specified request 
           * options to a location and returns the results to the request 
           * options callback function.
           * @param request Options for sending geocode request
           */
  def geocode(request: IGeocodeRequestOptions): scala.Unit = js.native
  /**
           * Matches the specified location to an address and returns the 
           * address results to the specified request options callback function.
           * @param request Options for sending reverse geocode request
           */
  def reverseGeocode(request: ReverseGeocodeRequestOptions): scala.Unit = js.native
}

