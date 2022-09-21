package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroupPairInfo extends StObject {
  
  /**
    *  The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete. 
    */
  var prodTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined
  
  /**
    *  One pair of target groups. One is associated with the original task set. The second is associated with the task set that serves traffic after the deployment is complete. 
    */
  var targetGroups: js.UndefOr[TargetGroupInfoList] = js.undefined
  
  /**
    *  An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can occur while test traffic is served during a deployment. 
    */
  var testTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined
}
object TargetGroupPairInfo {
  
  inline def apply(): TargetGroupPairInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupPairInfo]
  }
  
  extension [Self <: TargetGroupPairInfo](x: Self) {
    
    inline def setProdTrafficRoute(value: TrafficRoute): Self = StObject.set(x, "prodTrafficRoute", value.asInstanceOf[js.Any])
    
    inline def setProdTrafficRouteUndefined: Self = StObject.set(x, "prodTrafficRoute", js.undefined)
    
    inline def setTargetGroups(value: TargetGroupInfoList): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsUndefined: Self = StObject.set(x, "targetGroups", js.undefined)
    
    inline def setTargetGroupsVarargs(value: TargetGroupInfo*): Self = StObject.set(x, "targetGroups", js.Array(value*))
    
    inline def setTestTrafficRoute(value: TrafficRoute): Self = StObject.set(x, "testTrafficRoute", value.asInstanceOf[js.Any])
    
    inline def setTestTrafficRouteUndefined: Self = StObject.set(x, "testTrafficRoute", js.undefined)
  }
}
