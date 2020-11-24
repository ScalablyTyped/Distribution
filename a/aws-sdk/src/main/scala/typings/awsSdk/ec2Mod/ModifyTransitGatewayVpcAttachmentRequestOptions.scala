package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTransitGatewayVpcAttachmentRequestOptions extends js.Object {
  
  /**
    * Enable or disable support for appliance mode. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. The default is disable.
    */
  var ApplianceModeSupport: js.UndefOr[ApplianceModeSupportValue] = js.native
  
  /**
    * Enable or disable DNS support. The default is enable.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  
  /**
    * Enable or disable IPv6 support. The default is enable.
    */
  var Ipv6Support: js.UndefOr[Ipv6SupportValue] = js.native
}
object ModifyTransitGatewayVpcAttachmentRequestOptions {
  
  @scala.inline
  def apply(): ModifyTransitGatewayVpcAttachmentRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentRequestOptions]
  }
  
  @scala.inline
  implicit class ModifyTransitGatewayVpcAttachmentRequestOptionsOps[Self <: ModifyTransitGatewayVpcAttachmentRequestOptions] (val x: Self) extends AnyVal {
    
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
