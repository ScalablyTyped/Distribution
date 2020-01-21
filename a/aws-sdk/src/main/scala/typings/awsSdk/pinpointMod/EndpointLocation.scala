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
  def apply(
    City: string = null,
    Country: string = null,
    Latitude: Int | Double = null,
    Longitude: Int | Double = null,
    PostalCode: string = null,
    Region: string = null
  ): EndpointLocation = {
    val __obj = js.Dynamic.literal()
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (Latitude != null) __obj.updateDynamic("Latitude")(Latitude.asInstanceOf[js.Any])
    if (Longitude != null) __obj.updateDynamic("Longitude")(Longitude.asInstanceOf[js.Any])
    if (PostalCode != null) __obj.updateDynamic("PostalCode")(PostalCode.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointLocation]
  }
}

