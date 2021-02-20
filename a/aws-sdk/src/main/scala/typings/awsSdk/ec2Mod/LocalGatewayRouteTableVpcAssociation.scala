package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalGatewayRouteTableVpcAssociation extends StObject {
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the local gateway route table for the association.
    */
  var LocalGatewayRouteTableArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the association.
    */
  var LocalGatewayRouteTableVpcAssociationId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociationId] = js.native
  
  /**
    * The AWS account ID that owns the local gateway route table for the association.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * The tags assigned to the association.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object LocalGatewayRouteTableVpcAssociation {
  
  @scala.inline
  def apply(): LocalGatewayRouteTableVpcAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteTableVpcAssociation]
  }
  
  @scala.inline
  implicit class LocalGatewayRouteTableVpcAssociationMutableBuilder[Self <: LocalGatewayRouteTableVpcAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableArn(value: ResourceArn): Self = StObject.set(x, "LocalGatewayRouteTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableArnUndefined: Self = StObject.set(x, "LocalGatewayRouteTableArn", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociationId(value: LocalGatewayRouteTableVpcAssociationId): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociationIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociationId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
