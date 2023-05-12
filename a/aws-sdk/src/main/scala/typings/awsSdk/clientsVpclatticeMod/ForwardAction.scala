package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardAction extends StObject {
  
  /**
    * The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward actions, you can assign a weight that controls the prioritization and selection of each target group. This means that requests are distributed to individual target groups based on their weights. For example, if two target groups have the same weight, each target group receives half of the traffic. The default value is 1. This means that if only one target group is provided, there is no need to set the weight; 100% of traffic will go to that target group.
    */
  var targetGroups: WeightedTargetGroupList
}
object ForwardAction {
  
  inline def apply(targetGroups: WeightedTargetGroupList): ForwardAction = {
    val __obj = js.Dynamic.literal(targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForwardAction] (val x: Self) extends AnyVal {
    
    inline def setTargetGroups(value: WeightedTargetGroupList): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsVarargs(value: WeightedTargetGroup*): Self = StObject.set(x, "targetGroups", js.Array(value*))
  }
}
