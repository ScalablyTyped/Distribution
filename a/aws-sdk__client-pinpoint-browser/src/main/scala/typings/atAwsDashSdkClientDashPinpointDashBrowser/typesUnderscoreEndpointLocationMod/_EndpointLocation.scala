package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EndpointLocation extends js.Object {
  /**
    * The city where the endpoint is located.
    */
  var City: js.UndefOr[String] = js.undefined
  /**
    * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as "US" for the United States.
    */
  var Country: js.UndefOr[String] = js.undefined
  /**
    * The latitude of the endpoint location, rounded to one decimal place.
    */
  var Latitude: js.UndefOr[Double] = js.undefined
  /**
    * The longitude of the endpoint location, rounded to one decimal place.
    */
  var Longitude: js.UndefOr[Double] = js.undefined
  /**
    * The postal code or zip code of the endpoint.
    */
  var PostalCode: js.UndefOr[String] = js.undefined
  /**
    * The region of the endpoint location. For example, in the United States, this corresponds to a state.
    */
  var Region: js.UndefOr[String] = js.undefined
}

object _EndpointLocation {
  @scala.inline
  def apply(
    City: String = null,
    Country: String = null,
    Latitude: Int | Double = null,
    Longitude: Int | Double = null,
    PostalCode: String = null,
    Region: String = null
  ): _EndpointLocation = {
    val __obj = js.Dynamic.literal()
    if (City != null) __obj.updateDynamic("City")(City)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (Latitude != null) __obj.updateDynamic("Latitude")(Latitude.asInstanceOf[js.Any])
    if (Longitude != null) __obj.updateDynamic("Longitude")(Longitude.asInstanceOf[js.Any])
    if (PostalCode != null) __obj.updateDynamic("PostalCode")(PostalCode)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    __obj.asInstanceOf[_EndpointLocation]
  }
}

