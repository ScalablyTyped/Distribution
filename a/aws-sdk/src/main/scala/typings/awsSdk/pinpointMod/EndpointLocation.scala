package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointLocation extends js.Object {
  /**
    * The name of the city where the endpoint is located.
    */
  var City: js.UndefOr[string] = js.native
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is located. For example, US for the United States.
    */
  var Country: js.UndefOr[string] = js.native
  /**
    * The latitude coordinate of the endpoint location, rounded to one decimal place.
    */
  var Latitude: js.UndefOr[double] = js.native
  /**
    * The longitude coordinate of the endpoint location, rounded to one decimal place.
    */
  var Longitude: js.UndefOr[double] = js.native
  /**
    * The postal or ZIP code for the area where the endpoint is located.
    */
  var PostalCode: js.UndefOr[string] = js.native
  /**
    * The name of the region where the endpoint is located. For locations in the United States, this value is the name of a state.
    */
  var Region: js.UndefOr[string] = js.native
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
    def setCity(value: string): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    @scala.inline
    def setCountry(value: string): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    @scala.inline
    def setLatitude(value: double): Self = this.set("Latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("Latitude", js.undefined)
    @scala.inline
    def setLongitude(value: double): Self = this.set("Longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("Longitude", js.undefined)
    @scala.inline
    def setPostalCode(value: string): Self = this.set("PostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("PostalCode", js.undefined)
    @scala.inline
    def setRegion(value: string): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
  }
  
}

