package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteIpDetails extends js.Object {
  /**
    * The city information of the remote IP address.
    */
  var City: js.UndefOr[typings.awsSdk.guarddutyMod.City] = js.native
  /**
    * The country code of the remote IP address.
    */
  var Country: js.UndefOr[typings.awsSdk.guarddutyMod.Country] = js.native
  /**
    * The location information of the remote IP address.
    */
  var GeoLocation: js.UndefOr[typings.awsSdk.guarddutyMod.GeoLocation] = js.native
  /**
    * The IPv4 remote address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.native
  /**
    * The ISP organization information of the remote IP address.
    */
  var Organization: js.UndefOr[typings.awsSdk.guarddutyMod.Organization] = js.native
}

object RemoteIpDetails {
  @scala.inline
  def apply(): RemoteIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteIpDetails]
  }
  @scala.inline
  implicit class RemoteIpDetailsOps[Self <: RemoteIpDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCity(value: City): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    @scala.inline
    def setCountry(value: Country): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    @scala.inline
    def setGeoLocation(value: GeoLocation): Self = this.set("GeoLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoLocation: Self = this.set("GeoLocation", js.undefined)
    @scala.inline
    def setIpAddressV4(value: String): Self = this.set("IpAddressV4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressV4: Self = this.set("IpAddressV4", js.undefined)
    @scala.inline
    def setOrganization(value: Organization): Self = this.set("Organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("Organization", js.undefined)
  }
  
}

