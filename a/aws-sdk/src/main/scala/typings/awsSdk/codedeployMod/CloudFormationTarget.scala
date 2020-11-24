package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFormationTarget extends js.Object {
  
  /**
    * The unique ID of an AWS CloudFormation blue/green deployment.
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  
  /**
    *  The date and time when the target application was updated by an AWS CloudFormation blue/green deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.native
  
  /**
    *  The lifecycle events of the AWS CloudFormation blue/green deployment to this target application. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  
  /**
    * The resource type for the AWS CloudFormation blue/green deployment.
    */
  var resourceType: js.UndefOr[CloudFormationResourceType] = js.native
  
  /**
    *  The status of an AWS CloudFormation blue/green deployment's target application. 
    */
  var status: js.UndefOr[TargetStatus] = js.native
  
  /**
    *  The unique ID of a deployment target that has a type of CloudFormationTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
  
  /**
    * The percentage of production traffic that the target version of an AWS CloudFormation blue/green deployment receives.
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.native
}
object CloudFormationTarget {
  
  @scala.inline
  def apply(): CloudFormationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationTarget]
  }
  
  @scala.inline
  implicit class CloudFormationTargetOps[Self <: CloudFormationTarget] (val x: Self) extends AnyVal {
    
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
    def setDeploymentId(value: DeploymentId): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Time): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLifecycleEventsVarargs(value: LifecycleEvent*): Self = this.set("lifecycleEvents", js.Array(value :_*))
    
    @scala.inline
    def setLifecycleEvents(value: LifecycleEventList): Self = this.set("lifecycleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleEvents: Self = this.set("lifecycleEvents", js.undefined)
    
    @scala.inline
    def setResourceType(value: CloudFormationResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: TargetStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetId): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
    
    @scala.inline
    def setTargetVersionWeight(value: TrafficWeight): Self = this.set("targetVersionWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVersionWeight: Self = this.set("targetVersionWeight", js.undefined)
  }
}
