package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRouteTableAssociation extends StObject {
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type. Note that the tgw-peering resource type has been deprecated.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[TransitGatewayAssociationState] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.undefined
}
object TransitGatewayRouteTableAssociation {
  
  @scala.inline
  def apply(): TransitGatewayRouteTableAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRouteTableAssociation]
  }
  
  @scala.inline
  implicit class TransitGatewayRouteTableAssociationMutableBuilder[Self <: TransitGatewayRouteTableAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: TransitGatewayAttachmentResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
  }
}
