package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGroupPairInfo extends StObject {
  
  /**
    *  The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete. 
    */
  var prodTrafficRoute: js.UndefOr[TrafficRoute] = js.native
  
  /**
    *  One pair of target groups. One is associated with the original task set. The second is associated with the task set that serves traffic after the deployment is complete. 
    */
  var targetGroups: js.UndefOr[TargetGroupInfoList] = js.native
  
  /**
    *  An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can occur while test traffic is served during a deployment. 
    */
  var testTrafficRoute: js.UndefOr[TrafficRoute] = js.native
}
object TargetGroupPairInfo {
  
  @scala.inline
  def apply(): TargetGroupPairInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupPairInfo]
  }
  
  @scala.inline
  implicit class TargetGroupPairInfoMutableBuilder[Self <: TargetGroupPairInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProdTrafficRoute(value: TrafficRoute): Self = StObject.set(x, "prodTrafficRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProdTrafficRouteUndefined: Self = StObject.set(x, "prodTrafficRoute", js.undefined)
    
    @scala.inline
    def setTargetGroups(value: TargetGroupInfoList): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsUndefined: Self = StObject.set(x, "targetGroups", js.undefined)
    
    @scala.inline
    def setTargetGroupsVarargs(value: TargetGroupInfo*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
    
    @scala.inline
    def setTestTrafficRoute(value: TrafficRoute): Self = StObject.set(x, "testTrafficRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTrafficRouteUndefined: Self = StObject.set(x, "testTrafficRoute", js.undefined)
  }
}
