package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedTargetGroup extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the target group.
    */
  var targetGroupIdentifier: TargetGroupIdentifier
  
  /**
    * Only required if you specify multiple target groups for a forward action. The "weight" determines how requests are distributed to the target group. For example, if you specify two target groups, each with a weight of 10, each target group receives half the requests. If you specify two target groups, one with a weight of 10 and the other with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target group. If there's only one target group specified, then the default value is 100.
    */
  var weight: js.UndefOr[TargetGroupWeight] = js.undefined
}
object WeightedTargetGroup {
  
  inline def apply(targetGroupIdentifier: TargetGroupIdentifier): WeightedTargetGroup = {
    val __obj = js.Dynamic.literal(targetGroupIdentifier = targetGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTargetGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeightedTargetGroup] (val x: Self) extends AnyVal {
    
    inline def setTargetGroupIdentifier(value: TargetGroupIdentifier): Self = StObject.set(x, "targetGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: TargetGroupWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
