package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTransitGatewayVpcAttachmentRequestOptions extends StObject {
  
  /**
    * Enable or disable support for appliance mode. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. The default is disable.
    */
  var ApplianceModeSupport: js.UndefOr[ApplianceModeSupportValue] = js.undefined
  
  /**
    * Enable or disable DNS support. The default is enable.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.undefined
  
  /**
    * Enable or disable IPv6 support. The default is enable.
    */
  var Ipv6Support: js.UndefOr[Ipv6SupportValue] = js.undefined
}
object ModifyTransitGatewayVpcAttachmentRequestOptions {
  
  inline def apply(): ModifyTransitGatewayVpcAttachmentRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentRequestOptions]
  }
  
  extension [Self <: ModifyTransitGatewayVpcAttachmentRequestOptions](x: Self) {
    
    inline def setApplianceModeSupport(value: ApplianceModeSupportValue): Self = StObject.set(x, "ApplianceModeSupport", value.asInstanceOf[js.Any])
    
    inline def setApplianceModeSupportUndefined: Self = StObject.set(x, "ApplianceModeSupport", js.undefined)
    
    inline def setDnsSupport(value: DnsSupportValue): Self = StObject.set(x, "DnsSupport", value.asInstanceOf[js.Any])
    
    inline def setDnsSupportUndefined: Self = StObject.set(x, "DnsSupport", js.undefined)
    
    inline def setIpv6Support(value: Ipv6SupportValue): Self = StObject.set(x, "Ipv6Support", value.asInstanceOf[js.Any])
    
    inline def setIpv6SupportUndefined: Self = StObject.set(x, "Ipv6Support", js.undefined)
  }
}
