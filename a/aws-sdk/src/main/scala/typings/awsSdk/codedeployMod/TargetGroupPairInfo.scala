package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGroupPairInfo extends js.Object {
  
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
  implicit class TargetGroupPairInfoOps[Self <: TargetGroupPairInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProdTrafficRoute(value: TrafficRoute): Self = this.set("prodTrafficRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProdTrafficRoute: Self = this.set("prodTrafficRoute", js.undefined)
    
    @scala.inline
    def setTargetGroupsVarargs(value: TargetGroupInfo*): Self = this.set("targetGroups", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroups(value: TargetGroupInfoList): Self = this.set("targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroups: Self = this.set("targetGroups", js.undefined)
    
    @scala.inline
    def setTestTrafficRoute(value: TrafficRoute): Self = this.set("testTrafficRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTrafficRoute: Self = this.set("testTrafficRoute", js.undefined)
  }
}
