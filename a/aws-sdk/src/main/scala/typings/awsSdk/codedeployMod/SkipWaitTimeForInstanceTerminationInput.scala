package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipWaitTimeForInstanceTerminationInput extends js.Object {
  /**
    *  The unique ID of a blue/green deployment for which you want to skip the instance termination wait time. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
}

object SkipWaitTimeForInstanceTerminationInput {
  @scala.inline
  def apply(): SkipWaitTimeForInstanceTerminationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipWaitTimeForInstanceTerminationInput]
  }
  @scala.inline
  implicit class SkipWaitTimeForInstanceTerminationInputOps[Self <: SkipWaitTimeForInstanceTerminationInput] (val x: Self) extends AnyVal {
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
  }
  
}

