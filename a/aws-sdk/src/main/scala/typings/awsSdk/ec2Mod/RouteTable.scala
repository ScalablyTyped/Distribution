package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteTable extends StObject {
  
  /**
    * The associations between the route table and one or more subnets or a gateway.
    */
  var Associations: js.UndefOr[RouteTableAssociationList] = js.undefined
  
  /**
    * The ID of the AWS account that owns the route table.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Any virtual private gateway (VGW) propagating routes.
    */
  var PropagatingVgws: js.UndefOr[PropagatingVgwList] = js.undefined
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[String] = js.undefined
  
  /**
    * The routes in the route table.
    */
  var Routes: js.UndefOr[RouteList] = js.undefined
  
  /**
    * Any tags assigned to the route table.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object RouteTable {
  
  inline def apply(): RouteTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTable]
  }
  
  extension [Self <: RouteTable](x: Self) {
    
    inline def setAssociations(value: RouteTableAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    inline def setAssociationsVarargs(value: RouteTableAssociation*): Self = StObject.set(x, "Associations", js.Array(value :_*))
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPropagatingVgws(value: PropagatingVgwList): Self = StObject.set(x, "PropagatingVgws", value.asInstanceOf[js.Any])
    
    inline def setPropagatingVgwsUndefined: Self = StObject.set(x, "PropagatingVgws", js.undefined)
    
    inline def setPropagatingVgwsVarargs(value: PropagatingVgw*): Self = StObject.set(x, "PropagatingVgws", js.Array(value :_*))
    
    inline def setRouteTableId(value: String): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdUndefined: Self = StObject.set(x, "RouteTableId", js.undefined)
    
    inline def setRoutes(value: RouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "Routes", js.Array(value :_*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
