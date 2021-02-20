package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteTable extends StObject {
  
  /**
    * The associations between the route table and one or more subnets or a gateway.
    */
  var Associations: js.UndefOr[RouteTableAssociationList] = js.native
  
  /**
    * The ID of the AWS account that owns the route table.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * Any virtual private gateway (VGW) propagating routes.
    */
  var PropagatingVgws: js.UndefOr[PropagatingVgwList] = js.native
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[String] = js.native
  
  /**
    * The routes in the route table.
    */
  var Routes: js.UndefOr[RouteList] = js.native
  
  /**
    * Any tags assigned to the route table.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object RouteTable {
  
  @scala.inline
  def apply(): RouteTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTable]
  }
  
  @scala.inline
  implicit class RouteTableMutableBuilder[Self <: RouteTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: RouteTableAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: RouteTableAssociation*): Self = StObject.set(x, "Associations", js.Array(value :_*))
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPropagatingVgws(value: PropagatingVgwList): Self = StObject.set(x, "PropagatingVgws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagatingVgwsUndefined: Self = StObject.set(x, "PropagatingVgws", js.undefined)
    
    @scala.inline
    def setPropagatingVgwsVarargs(value: PropagatingVgw*): Self = StObject.set(x, "PropagatingVgws", js.Array(value :_*))
    
    @scala.inline
    def setRouteTableId(value: String): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    @scala.inline
    def setRoutes(value: RouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: Route*): Self = StObject.set(x, "Routes", js.Array(value :_*))
    
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
