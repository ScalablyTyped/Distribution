package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTransitGatewayOptions extends js.Object {
  
  /**
    * The ID of the default association route table.
    */
  var AssociationDefaultRouteTableId: js.UndefOr[TransitGatewayRouteTableId] = js.native
  
  /**
    * Enable or disable automatic acceptance of attachment requests.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.native
  
  /**
    * Enable or disable automatic association with the default association route table.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.native
  
  /**
    * Enable or disable automatic propagation of routes to the default propagation route table.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.native
  
  /**
    * Enable or disable DNS support.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  
  /**
    * The ID of the default propagation route table.
    */
  var PropagationDefaultRouteTableId: js.UndefOr[TransitGatewayRouteTableId] = js.native
  
  /**
    * Enable or disable Equal Cost Multipath Protocol support.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.native
}
object ModifyTransitGatewayOptions {
  
  @scala.inline
  def apply(): ModifyTransitGatewayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayOptions]
  }
  
  @scala.inline
  implicit class ModifyTransitGatewayOptionsOps[Self <: ModifyTransitGatewayOptions] (val x: Self) extends AnyVal {
    
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
    def setAssociationDefaultRouteTableId(value: TransitGatewayRouteTableId): Self = this.set("AssociationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationDefaultRouteTableId: Self = this.set("AssociationDefaultRouteTableId", js.undefined)
    
    @scala.inline
    def setAutoAcceptSharedAttachments(value: AutoAcceptSharedAttachmentsValue): Self = this.set("AutoAcceptSharedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAcceptSharedAttachments: Self = this.set("AutoAcceptSharedAttachments", js.undefined)
    
    @scala.inline
    def setDefaultRouteTableAssociation(value: DefaultRouteTableAssociationValue): Self = this.set("DefaultRouteTableAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteTableAssociation: Self = this.set("DefaultRouteTableAssociation", js.undefined)
    
    @scala.inline
    def setDefaultRouteTablePropagation(value: DefaultRouteTablePropagationValue): Self = this.set("DefaultRouteTablePropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteTablePropagation: Self = this.set("DefaultRouteTablePropagation", js.undefined)
    
    @scala.inline
    def setDnsSupport(value: DnsSupportValue): Self = this.set("DnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSupport: Self = this.set("DnsSupport", js.undefined)
    
    @scala.inline
    def setPropagationDefaultRouteTableId(value: TransitGatewayRouteTableId): Self = this.set("PropagationDefaultRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagationDefaultRouteTableId: Self = this.set("PropagationDefaultRouteTableId", js.undefined)
    
    @scala.inline
    def setVpnEcmpSupport(value: VpnEcmpSupportValue): Self = this.set("VpnEcmpSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnEcmpSupport: Self = this.set("VpnEcmpSupport", js.undefined)
  }
}
