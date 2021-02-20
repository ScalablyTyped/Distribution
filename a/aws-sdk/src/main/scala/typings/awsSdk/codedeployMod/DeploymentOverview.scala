package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentOverview extends StObject {
  
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
  implicit class DeploymentOverviewMutableBuilder[Self <: DeploymentOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: InstanceCount): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    @scala.inline
    def setInProgress(value: InstanceCount): Self = StObject.set(x, "InProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgressUndefined: Self = StObject.set(x, "InProgress", js.undefined)
    
    @scala.inline
    def setPending(value: InstanceCount): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
    
    @scala.inline
    def setReady(value: InstanceCount): Self = StObject.set(x, "Ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "Ready", js.undefined)
    
    @scala.inline
    def setSkipped(value: InstanceCount): Self = StObject.set(x, "Skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedUndefined: Self = StObject.set(x, "Skipped", js.undefined)
    
    @scala.inline
    def setSucceeded(value: InstanceCount): Self = StObject.set(x, "Succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededUndefined: Self = StObject.set(x, "Succeeded", js.undefined)
  }
}
