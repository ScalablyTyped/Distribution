package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayVpcAttachmentRequestOptions extends StObject {
  
  /**
    * Enable or disable support for appliance mode. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. The default is disable.
    */
  var ApplianceModeSupport: js.UndefOr[ApplianceModeSupportValue] = js.undefined
  
  /**
    * Enable or disable DNS support. The default is enable.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.undefined
  
  /**
    * Enable or disable IPv6 support.
    */
  var Ipv6Support: js.UndefOr[Ipv6SupportValue] = js.undefined
}
object CreateTransitGatewayVpcAttachmentRequestOptions {
  
  @scala.inline
  def apply(): CreateTransitGatewayVpcAttachmentRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayVpcAttachmentRequestOptions]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayVpcAttachmentRequestOptionsMutableBuilder[Self <: CreateTransitGatewayVpcAttachmentRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplianceModeSupport(value: ApplianceModeSupportValue): Self = StObject.set(x, "ApplianceModeSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplianceModeSupportUndefined: Self = StObject.set(x, "ApplianceModeSupport", js.undefined)
    
    @scala.inline
    def setDnsSupport(value: DnsSupportValue): Self = StObject.set(x, "DnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSupportUndefined: Self = StObject.set(x, "DnsSupport", js.undefined)
    
    @scala.inline
    def setIpv6Support(value: Ipv6SupportValue): Self = StObject.set(x, "Ipv6Support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6SupportUndefined: Self = StObject.set(x, "Ipv6Support", js.undefined)
  }
}
