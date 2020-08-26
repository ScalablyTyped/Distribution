package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
  /**
    *  The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the hooks section of the AppSpec file. 
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.native
  /**
    * The result of a Lambda function that validates a deployment lifecycle event (Succeeded or Failed).
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.native
}

object PutLifecycleEventHookExecutionStatusInput {
  @scala.inline
  def apply(): PutLifecycleEventHookExecutionStatusInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
  }
  @scala.inline
  implicit class PutLifecycleEventHookExecutionStatusInputOps[Self <: PutLifecycleEventHookExecutionStatusInput] (val x: Self) extends AnyVal {
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
    def setLifecycleEventHookExecutionId(value: LifecycleEventHookExecutionId): Self = this.set("lifecycleEventHookExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleEventHookExecutionId: Self = this.set("lifecycleEventHookExecutionId", js.undefined)
    @scala.inline
    def setStatus(value: LifecycleEventStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

