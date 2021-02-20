package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteTableAssociation extends StObject {
  
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.native
  
  /**
    * The ID of the internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether this is the main route table.
    */
  var Main: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the association.
    */
  var RouteTableAssociationId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the subnet. A subnet ID is not returned for an implicit association.
    */
  var SubnetId: js.UndefOr[String] = js.native
}
object RouteTableAssociation {
  
  @scala.inline
  def apply(): RouteTableAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableAssociation]
  }
  
  @scala.inline
  implicit class RouteTableAssociationMutableBuilder[Self <: RouteTableAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationState(value: RouteTableAssociationState): Self = StObject.set(x, "AssociationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationStateUndefined: Self = StObject.set(x, "AssociationState", js.undefined)
    
    @scala.inline
    def setGatewayId(value: String): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    @scala.inline
    def setMain(value: Boolean): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainUndefined: Self = StObject.set(x, "Main", js.undefined)
    
    @scala.inline
    def setRouteTableAssociationId(value: String): Self = StObject.set(x, "RouteTableAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableAssociationIdUndefined: Self = StObject.set(x, "RouteTableAssociationId", js.undefined)
    
    @scala.inline
    def setRouteTableId(value: String): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
