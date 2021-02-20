package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayOptions extends StObject {
  
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  
  /**
    * The ID of the default association route table.
    */
  var AssociationDefaultRouteTableId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether attachment requests are automatically accepted.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.native
  
  /**
    * Indicates whether resource attachments are automatically associated with the default association route table.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.native
  
  /**
    * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.native
  
  /**
    * Indicates whether DNS support is enabled.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  
  /**
    * Indicates whether multicast is enabled on the transit gateway
    */
  var MulticastSupport: js.UndefOr[MulticastSupportValue] = js.native
  
  /**
    * The ID of the default propagation route table.
    */
  var PropagationDefaultRouteTableId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether Equal Cost Multipath Protocol support is enabled.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.native
}
object TransitGatewayOptions {
  
  @scala.inline
  def apply(): TransitGatewayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayOptions]
  }
  
  @scala.inline
  implicit class TransitGatewayOptionsMutableBuilder[Self <: TransitGatewayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmazonSideAsn(value: Long): Self = StObject.set(x, "AmazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonSideAsnUndefined: Self = StObject.set(x, "AmazonSideAsn", js.undefined)
    
    @scala.inline
    def setAssociationDefaultRouteTableId(value: String): Self = StObject.set(x, "AssociationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationDefaultRouteTableIdUndefined: Self = StObject.set(x, "AssociationDefaultRouteTableId", js.undefined)
    
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
    def setPropagationDefaultRouteTableId(value: String): Self = StObject.set(x, "PropagationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagationDefaultRouteTableIdUndefined: Self = StObject.set(x, "PropagationDefaultRouteTableId", js.undefined)
    
    @scala.inline
    def setVpnEcmpSupport(value: VpnEcmpSupportValue): Self = StObject.set(x, "VpnEcmpSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnEcmpSupportUndefined: Self = StObject.set(x, "VpnEcmpSupport", js.undefined)
  }
}
