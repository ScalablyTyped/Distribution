package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentReadyOption extends js.Object {
  /**
    * Information about when to reroute traffic from an original environment to a replacement environment in a blue/green deployment.   CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision is installed on the instances in the replacement environment.   STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using ContinueDeployment. If traffic rerouting is not started before the end of the specified wait period, the deployment status is changed to Stopped.  
    */
  var actionOnTimeout: js.UndefOr[DeploymentReadyAction] = js.native
  /**
    * The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if rerouting is not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout.
    */
  var waitTimeInMinutes: js.UndefOr[Duration] = js.native
}

object DeploymentReadyOption {
  @scala.inline
  def apply(): DeploymentReadyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentReadyOption]
  }
  @scala.inline
  implicit class DeploymentReadyOptionOps[Self <: DeploymentReadyOption] (val x: Self) extends AnyVal {
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
    def setActionOnTimeout(value: DeploymentReadyAction): Self = this.set("actionOnTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionOnTimeout: Self = this.set("actionOnTimeout", js.undefined)
    @scala.inline
    def setWaitTimeInMinutes(value: Duration): Self = this.set("waitTimeInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitTimeInMinutes: Self = this.set("waitTimeInMinutes", js.undefined)
  }
  
}

