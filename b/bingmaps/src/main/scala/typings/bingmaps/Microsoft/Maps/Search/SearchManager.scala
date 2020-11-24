package typings.bingmaps.Microsoft.Maps.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchManager extends js.Object {
  
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
object SearchManager {
  
  @scala.inline
  def apply(geocode: IGeocodeRequestOptions => Unit, reverseGeocode: ReverseGeocodeRequestOptions => Unit): SearchManager = {
    val __obj = js.Dynamic.literal(geocode = js.Any.fromFunction1(geocode), reverseGeocode = js.Any.fromFunction1(reverseGeocode))
    __obj.asInstanceOf[SearchManager]
  }
  
  @scala.inline
  implicit class SearchManagerOps[Self <: SearchManager] (val x: Self) extends AnyVal {
    
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
    def setGeocode(value: IGeocodeRequestOptions => Unit): Self = this.set("geocode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverseGeocode(value: ReverseGeocodeRequestOptions => Unit): Self = this.set("reverseGeocode", js.Any.fromFunction1(value))
  }
}
