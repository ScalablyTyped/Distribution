package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentConfigsOutput extends js.Object {
  /**
    * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
    */
  var deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment configurations call to return the next set of deployment configurations in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentConfigsOutput {
  @scala.inline
  def apply(): ListDeploymentConfigsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentConfigsOutput]
  }
  @scala.inline
  implicit class ListDeploymentConfigsOutputOps[Self <: ListDeploymentConfigsOutput] (val x: Self) extends AnyVal {
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
    def setDeploymentConfigsListVarargs(value: DeploymentConfigName*): Self = this.set("deploymentConfigsList", js.Array(value :_*))
    @scala.inline
    def setDeploymentConfigsList(value: DeploymentConfigsList): Self = this.set("deploymentConfigsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfigsList: Self = this.set("deploymentConfigsList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

