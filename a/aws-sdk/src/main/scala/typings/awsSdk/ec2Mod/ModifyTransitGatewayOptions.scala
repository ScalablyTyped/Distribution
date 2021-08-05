package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTransitGatewayOptions extends StObject {
  
  /**
    * The ID of the default association route table.
    */
  var AssociationDefaultRouteTableId: js.UndefOr[TransitGatewayRouteTableId] = js.undefined
  
  /**
    * Enable or disable automatic acceptance of attachment requests.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.undefined
  
  /**
    * Enable or disable automatic association with the default association route table.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.undefined
  
  /**
    * Enable or disable automatic propagation of routes to the default propagation route table.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.undefined
  
  /**
    * Enable or disable DNS support.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.undefined
  
  /**
    * The ID of the default propagation route table.
    */
  var PropagationDefaultRouteTableId: js.UndefOr[TransitGatewayRouteTableId] = js.undefined
  
  /**
    * Enable or disable Equal Cost Multipath Protocol support.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.undefined
}
object ModifyTransitGatewayOptions {
  
  inline def apply(): ModifyTransitGatewayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayOptions]
  }
  
  extension [Self <: ModifyTransitGatewayOptions](x: Self) {
    
    inline def setAssociationDefaultRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "AssociationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setAssociationDefaultRouteTableIdUndefined: Self = StObject.set(x, "AssociationDefaultRouteTableId", js.undefined)
    
    inline def setAutoAcceptSharedAttachments(value: AutoAcceptSharedAttachmentsValue): Self = StObject.set(x, "AutoAcceptSharedAttachments", value.asInstanceOf[js.Any])
    
    inline def setAutoAcceptSharedAttachmentsUndefined: Self = StObject.set(x, "AutoAcceptSharedAttachments", js.undefined)
    
    inline def setDefaultRouteTableAssociation(value: DefaultRouteTableAssociationValue): Self = StObject.set(x, "DefaultRouteTableAssociation", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "DefaultRouteTableAssociation", js.undefined)
    
    inline def setDefaultRouteTablePropagation(value: DefaultRouteTablePropagationValue): Self = StObject.set(x, "DefaultRouteTablePropagation", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "DefaultRouteTablePropagation", js.undefined)
    
    inline def setDnsSupport(value: DnsSupportValue): Self = StObject.set(x, "DnsSupport", value.asInstanceOf[js.Any])
    
    inline def setDnsSupportUndefined: Self = StObject.set(x, "DnsSupport", js.undefined)
    
    inline def setPropagationDefaultRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "PropagationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setPropagationDefaultRouteTableIdUndefined: Self = StObject.set(x, "PropagationDefaultRouteTableId", js.undefined)
    
    inline def setVpnEcmpSupport(value: VpnEcmpSupportValue): Self = StObject.set(x, "VpnEcmpSupport", value.asInstanceOf[js.Any])
    
    inline def setVpnEcmpSupportUndefined: Self = StObject.set(x, "VpnEcmpSupport", js.undefined)
  }
}
