package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpAddressDetails extends js.Object {
  
  /**
    * The Internet Protocol version 4 (IPv4) address of the device.
    */
  var ipAddressV4: js.UndefOr[string] = js.native
  
  /**
    * The city that the IP address originated from.
    */
  var ipCity: js.UndefOr[IpCity] = js.native
  
  /**
    * The country that the IP address originated from.
    */
  var ipCountry: js.UndefOr[IpCountry] = js.native
  
  /**
    * The geographic coordinates of the location that the IP address originated from.
    */
  var ipGeoLocation: js.UndefOr[IpGeoLocation] = js.native
  
  /**
    * The registered owner of the IP address.
    */
  var ipOwner: js.UndefOr[IpOwner] = js.native
}
object IpAddressDetails {
  
  @scala.inline
  def apply(): IpAddressDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressDetails]
  }
  
  @scala.inline
  implicit class IpAddressDetailsOps[Self <: IpAddressDetails] (val x: Self) extends AnyVal {
    
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
    def setIpAddressV4(value: string): Self = this.set("ipAddressV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddressV4: Self = this.set("ipAddressV4", js.undefined)
    
    @scala.inline
    def setIpCity(value: IpCity): Self = this.set("ipCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpCity: Self = this.set("ipCity", js.undefined)
    
    @scala.inline
    def setIpCountry(value: IpCountry): Self = this.set("ipCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpCountry: Self = this.set("ipCountry", js.undefined)
    
    @scala.inline
    def setIpGeoLocation(value: IpGeoLocation): Self = this.set("ipGeoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpGeoLocation: Self = this.set("ipGeoLocation", js.undefined)
    
    @scala.inline
    def setIpOwner(value: IpOwner): Self = this.set("ipOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpOwner: Self = this.set("ipOwner", js.undefined)
  }
}
