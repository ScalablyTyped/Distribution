package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayVpcAttachmentOptions extends StObject {
  
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
  implicit class TransitGatewayVpcAttachmentOptionsMutableBuilder[Self <: TransitGatewayVpcAttachmentOptions] (val x: Self) extends AnyVal {
    
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
