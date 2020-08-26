package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentGroupsOutput extends js.Object {
  /**
    * Information about the deployment groups.
    */
  var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList] = js.native
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
}

object BatchGetDeploymentGroupsOutput {
  @scala.inline
  def apply(): BatchGetDeploymentGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentGroupsOutput]
  }
  @scala.inline
  implicit class BatchGetDeploymentGroupsOutputOps[Self <: BatchGetDeploymentGroupsOutput] (val x: Self) extends AnyVal {
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
    def setDeploymentGroupsInfoVarargs(value: DeploymentGroupInfo*): Self = this.set("deploymentGroupsInfo", js.Array(value :_*))
    @scala.inline
    def setDeploymentGroupsInfo(value: DeploymentGroupInfoList): Self = this.set("deploymentGroupsInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentGroupsInfo: Self = this.set("deploymentGroupsInfo", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
  }
  
}

