package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpAddressDetails extends js.Object {
  /**
    * Reserved for future use.
    */
  var ipAddressV4: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var ipCity: js.UndefOr[IpCity] = js.native
  /**
    * Reserved for future use.
    */
  var ipCountry: js.UndefOr[IpCountry] = js.native
  /**
    * Reserved for future use.
    */
  var ipGeoLocation: js.UndefOr[IpGeoLocation] = js.native
  /**
    * Reserved for future use.
    */
  var ipOwner: js.UndefOr[IpOwner] = js.native
}

object IpAddressDetails {
  @scala.inline
  def apply(
    ipAddressV4: string = null,
    ipCity: IpCity = null,
    ipCountry: IpCountry = null,
    ipGeoLocation: IpGeoLocation = null,
    ipOwner: IpOwner = null
  ): IpAddressDetails = {
    val __obj = js.Dynamic.literal()
    if (ipAddressV4 != null) __obj.updateDynamic("ipAddressV4")(ipAddressV4.asInstanceOf[js.Any])
    if (ipCity != null) __obj.updateDynamic("ipCity")(ipCity.asInstanceOf[js.Any])
    if (ipCountry != null) __obj.updateDynamic("ipCountry")(ipCountry.asInstanceOf[js.Any])
    if (ipGeoLocation != null) __obj.updateDynamic("ipGeoLocation")(ipGeoLocation.asInstanceOf[js.Any])
    if (ipOwner != null) __obj.updateDynamic("ipOwner")(ipOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddressDetails]
  }
}

