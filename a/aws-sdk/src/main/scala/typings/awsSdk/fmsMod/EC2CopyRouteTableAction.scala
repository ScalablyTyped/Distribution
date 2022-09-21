package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2CopyRouteTableAction extends StObject {
  
  /**
    * A description of the copied EC2 route table that is associated with the remediation action.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The ID of the copied EC2 route table that is associated with the remediation action.
    */
  var RouteTableId: ActionTarget
  
  /**
    * The VPC ID of the copied EC2 route table that is associated with the remediation action.
    */
  var VpcId: ActionTarget
}
object EC2CopyRouteTableAction {
  
  inline def apply(RouteTableId: ActionTarget, VpcId: ActionTarget): EC2CopyRouteTableAction = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2CopyRouteTableAction]
  }
  
  extension [Self <: EC2CopyRouteTableAction](x: Self) {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRouteTableId(value: ActionTarget): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setVpcId(value: ActionTarget): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
