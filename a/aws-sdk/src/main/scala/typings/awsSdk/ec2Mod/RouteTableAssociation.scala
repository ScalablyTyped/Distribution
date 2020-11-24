package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteTableAssociation extends js.Object {
  
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
  implicit class RouteTableAssociationOps[Self <: RouteTableAssociation] (val x: Self) extends AnyVal {
    
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
    def setAssociationState(value: RouteTableAssociationState): Self = this.set("AssociationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationState: Self = this.set("AssociationState", js.undefined)
    
    @scala.inline
    def setGatewayId(value: String): Self = this.set("GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayId: Self = this.set("GatewayId", js.undefined)
    
    @scala.inline
    def setMain(value: Boolean): Self = this.set("Main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("Main", js.undefined)
    
    @scala.inline
    def setRouteTableAssociationId(value: String): Self = this.set("RouteTableAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteTableAssociationId: Self = this.set("RouteTableAssociationId", js.undefined)
    
    @scala.inline
    def setRouteTableId(value: String): Self = this.set("RouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteTableId: Self = this.set("RouteTableId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
}
