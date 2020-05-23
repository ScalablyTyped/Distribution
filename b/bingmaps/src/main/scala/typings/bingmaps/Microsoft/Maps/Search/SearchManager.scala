package typings.bingmaps.Microsoft.Maps.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchManager extends js.Object {
  /**
    * Matches the address or place query in the specified request 
    * options to a location and returns the results to the request 
    * options callback function.
    * @param request Options for sending geocode request
    */
  def geocode(request: IGeocodeRequestOptions): Unit
  /**
    * Matches the specified location to an address and returns the 
    * address results to the specified request options callback function.
    * @param request Options for sending reverse geocode request
    */
  def reverseGeocode(request: ReverseGeocodeRequestOptions): Unit
}

object SearchManager {
  @scala.inline
  def apply(geocode: IGeocodeRequestOptions => Unit, reverseGeocode: ReverseGeocodeRequestOptions => Unit): SearchManager = {
    val __obj = js.Dynamic.literal(geocode = js.Any.fromFunction1(geocode), reverseGeocode = js.Any.fromFunction1(reverseGeocode))
    __obj.asInstanceOf[SearchManager]
  }
}

