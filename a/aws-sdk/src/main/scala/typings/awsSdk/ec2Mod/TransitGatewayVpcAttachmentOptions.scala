package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayVpcAttachmentOptions extends js.Object {
  
  /**
    * Indicates whether appliance mode support is enabled.
    */
  var ApplianceModeSupport: js.UndefOr[ApplianceModeSupportValue] = js.native
  
  /**
    * Indicates whether DNS support is enabled.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  
  /**
    * Indicates whether IPv6 support is disabled.
    */
  var Ipv6Support: js.UndefOr[Ipv6SupportValue] = js.native
}
object TransitGatewayVpcAttachmentOptions {
  
  @scala.inline
  def apply(): TransitGatewayVpcAttachmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayVpcAttachmentOptions]
  }
  
  @scala.inline
  implicit class TransitGatewayVpcAttachmentOptionsOps[Self <: TransitGatewayVpcAttachmentOptions] (val x: Self) extends AnyVal {
    
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
    def setApplianceModeSupport(value: ApplianceModeSupportValue): Self = this.set("ApplianceModeSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplianceModeSupport: Self = this.set("ApplianceModeSupport", js.undefined)
    
    @scala.inline
    def setDnsSupport(value: DnsSupportValue): Self = this.set("DnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSupport: Self = this.set("DnsSupport", js.undefined)
    
    @scala.inline
    def setIpv6Support(value: Ipv6SupportValue): Self = this.set("Ipv6Support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Support: Self = this.set("Ipv6Support", js.undefined)
  }
}
