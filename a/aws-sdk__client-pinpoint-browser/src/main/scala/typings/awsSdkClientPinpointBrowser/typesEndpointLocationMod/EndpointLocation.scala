package typings.awsSdkClientPinpointBrowser.typesEndpointLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointLocation extends js.Object {
  
  /**
    * The city where the endpoint is located.
    */
  var City: js.UndefOr[String] = js.native
  
  /**
    * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as "US" for the United States.
    */
  var Country: js.UndefOr[String] = js.native
  
  /**
    * The latitude of the endpoint location, rounded to one decimal place.
    */
  var Latitude: js.UndefOr[Double] = js.native
  
  /**
    * The longitude of the endpoint location, rounded to one decimal place.
    */
  var Longitude: js.UndefOr[Double] = js.native
  
  /**
    * The postal code or zip code of the endpoint.
    */
  var PostalCode: js.UndefOr[String] = js.native
  
  /**
    * The region of the endpoint location. For example, in the United States, this corresponds to a state.
    */
  var Region: js.UndefOr[String] = js.native
}
object EndpointLocation {
  
  @scala.inline
  def apply(): EndpointLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointLocation]
  }
  
  @scala.inline
  implicit class EndpointLocationOps[Self <: EndpointLocation] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("Latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("Latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("Longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("Longitude", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("PostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("PostalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
  }
}
