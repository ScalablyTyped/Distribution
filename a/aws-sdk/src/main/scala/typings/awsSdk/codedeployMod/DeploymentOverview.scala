package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentOverview extends js.Object {
  
  /**
    * The number of instances in the deployment in a failed state.
    */
  var Failed: js.UndefOr[InstanceCount] = js.native
  
  /**
    * The number of instances in which the deployment is in progress.
    */
  var InProgress: js.UndefOr[InstanceCount] = js.native
  
  /**
    * The number of instances in the deployment in a pending state.
    */
  var Pending: js.UndefOr[InstanceCount] = js.native
  
  /**
    * The number of instances in a replacement environment ready to receive traffic in a blue/green deployment.
    */
  var Ready: js.UndefOr[InstanceCount] = js.native
  
  /**
    * The number of instances in the deployment in a skipped state.
    */
  var Skipped: js.UndefOr[InstanceCount] = js.native
  
  /**
    * The number of instances in the deployment to which revisions have been successfully deployed.
    */
  var Succeeded: js.UndefOr[InstanceCount] = js.native
}
object DeploymentOverview {
  
  @scala.inline
  def apply(): DeploymentOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOverview]
  }
  
  @scala.inline
  implicit class DeploymentOverviewOps[Self <: DeploymentOverview] (val x: Self) extends AnyVal {
    
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
    def setFailed(value: InstanceCount): Self = this.set("Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("Failed", js.undefined)
    
    @scala.inline
    def setInProgress(value: InstanceCount): Self = this.set("InProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInProgress: Self = this.set("InProgress", js.undefined)
    
    @scala.inline
    def setPending(value: InstanceCount): Self = this.set("Pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("Pending", js.undefined)
    
    @scala.inline
    def setReady(value: InstanceCount): Self = this.set("Ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("Ready", js.undefined)
    
    @scala.inline
    def setSkipped(value: InstanceCount): Self = this.set("Skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipped: Self = this.set("Skipped", js.undefined)
    
    @scala.inline
    def setSucceeded(value: InstanceCount): Self = this.set("Succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSucceeded: Self = this.set("Succeeded", js.undefined)
  }
}
