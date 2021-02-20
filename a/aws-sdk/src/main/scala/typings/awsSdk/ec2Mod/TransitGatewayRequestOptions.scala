package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayRequestOptions extends StObject {
  
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs. The default is 64512.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  
  /**
    * Enable or disable automatic acceptance of attachment requests. Disabled by default.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.native
  
  /**
    * Enable or disable automatic association with the default association route table. Enabled by default.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.native
  
  /**
    * Enable or disable automatic propagation of routes to the default propagation route table. Enabled by default.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.native
  
  /**
    * Enable or disable DNS support. Enabled by default.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  
  /**
    * Indicates whether multicast is enabled on the transit gateway
    */
  var MulticastSupport: js.UndefOr[MulticastSupportValue] = js.native
  
  /**
    * Enable or disable Equal Cost Multipath Protocol support. Enabled by default.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.native
}
object TransitGatewayRequestOptions {
  
  @scala.inline
  def apply(): TransitGatewayRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRequestOptions]
  }
  
  @scala.inline
  implicit class TransitGatewayRequestOptionsMutableBuilder[Self <: TransitGatewayRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmazonSideAsn(value: Long): Self = StObject.set(x, "AmazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonSideAsnUndefined: Self = StObject.set(x, "AmazonSideAsn", js.undefined)
    
    @scala.inline
    def setAutoAcceptSharedAttachments(value: AutoAcceptSharedAttachmentsValue): Self = StObject.set(x, "AutoAcceptSharedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAcceptSharedAttachmentsUndefined: Self = StObject.set(x, "AutoAcceptSharedAttachments", js.undefined)
    
    @scala.inline
    def setDefaultRouteTableAssociation(value: DefaultRouteTableAssociationValue): Self = StObject.set(x, "DefaultRouteTableAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "DefaultRouteTableAssociation", js.undefined)
    
    @scala.inline
    def setDefaultRouteTablePropagation(value: DefaultRouteTablePropagationValue): Self = StObject.set(x, "DefaultRouteTablePropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "DefaultRouteTablePropagation", js.undefined)
    
    @scala.inline
    def setDnsSupport(value: DnsSupportValue): Self = StObject.set(x, "DnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSupportUndefined: Self = StObject.set(x, "DnsSupport", js.undefined)
    
    @scala.inline
    def setMulticastSupport(value: MulticastSupportValue): Self = StObject.set(x, "MulticastSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticastSupportUndefined: Self = StObject.set(x, "MulticastSupport", js.undefined)
    
    @scala.inline
    def setVpnEcmpSupport(value: VpnEcmpSupportValue): Self = StObject.set(x, "VpnEcmpSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnEcmpSupportUndefined: Self = StObject.set(x, "VpnEcmpSupport", js.undefined)
  }
}
