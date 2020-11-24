package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceSummary extends js.Object {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  
  /**
    * The instance ID.
    */
  var instanceId: js.UndefOr[InstanceId] = js.native
  
  /**
    * Information about which environment an instance belongs to in a blue/green deployment.   BLUE: The instance is part of the original environment.   GREEN: The instance is part of the replacement environment.  
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  
  /**
    * A timestamp that indicates when the instance information was last updated.
    */
  var lastUpdatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * A list of lifecycle events for this instance.
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  
  /**
    * The deployment status for this instance:    Pending: The deployment is pending for this instance.    In Progress: The deployment is in progress for this instance.    Succeeded: The deployment has succeeded for this instance.    Failed: The deployment has failed for this instance.    Skipped: The deployment has been skipped for this instance.    Unknown: The deployment status is unknown for this instance.  
    */
  var status: js.UndefOr[InstanceStatus] = js.native
}
object InstanceSummary {
  
  @scala.inline
  def apply(): InstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSummary]
  }
  
  @scala.inline
  implicit class InstanceSummaryOps[Self <: InstanceSummary] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: InstanceId): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Timestamp): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLifecycleEventsVarargs(value: LifecycleEvent*): Self = this.set("lifecycleEvents", js.Array(value :_*))
    
    @scala.inline
    def setLifecycleEvents(value: LifecycleEventList): Self = this.set("lifecycleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleEvents: Self = this.set("lifecycleEvents", js.undefined)
    
    @scala.inline
    def setStatus(value: InstanceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
