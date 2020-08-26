package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentInstancesOutput extends js.Object {
  /**
    * A list of instance IDs.
    */
  var instancesList: js.UndefOr[InstancesList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment instances call to return the next set of deployment instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentInstancesOutput {
  @scala.inline
  def apply(): ListDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentInstancesOutput]
  }
  @scala.inline
  implicit class ListDeploymentInstancesOutputOps[Self <: ListDeploymentInstancesOutput] (val x: Self) extends AnyVal {
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
    def setInstancesListVarargs(value: InstanceId*): Self = this.set("instancesList", js.Array(value :_*))
    @scala.inline
    def setInstancesList(value: InstancesList): Self = this.set("instancesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesList: Self = this.set("instancesList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

