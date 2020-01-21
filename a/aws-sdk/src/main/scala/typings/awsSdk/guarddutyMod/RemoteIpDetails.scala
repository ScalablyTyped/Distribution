package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteIpDetails extends js.Object {
  /**
    * City information of the remote IP address.
    */
  var City: js.UndefOr[typings.awsSdk.guarddutyMod.City] = js.native
  /**
    * Country code of the remote IP address.
    */
  var Country: js.UndefOr[typings.awsSdk.guarddutyMod.Country] = js.native
  /**
    * Location information of the remote IP address.
    */
  var GeoLocation: js.UndefOr[typings.awsSdk.guarddutyMod.GeoLocation] = js.native
  /**
    * IPV4 remote address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.native
  /**
    * ISP Organization information of the remote IP address.
    */
  var Organization: js.UndefOr[typings.awsSdk.guarddutyMod.Organization] = js.native
}

object RemoteIpDetails {
  @scala.inline
  def apply(
    City: City = null,
    Country: Country = null,
    GeoLocation: GeoLocation = null,
    IpAddressV4: String = null,
    Organization: Organization = null
  ): RemoteIpDetails = {
    val __obj = js.Dynamic.literal()
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (GeoLocation != null) __obj.updateDynamic("GeoLocation")(GeoLocation.asInstanceOf[js.Any])
    if (IpAddressV4 != null) __obj.updateDynamic("IpAddressV4")(IpAddressV4.asInstanceOf[js.Any])
    if (Organization != null) __obj.updateDynamic("Organization")(Organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteIpDetails]
  }
}

