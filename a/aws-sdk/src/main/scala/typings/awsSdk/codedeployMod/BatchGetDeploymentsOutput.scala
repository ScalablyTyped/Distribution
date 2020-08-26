package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentsOutput extends js.Object {
  /**
    *  Information about the deployments. 
    */
  var deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.native
}

object BatchGetDeploymentsOutput {
  @scala.inline
  def apply(): BatchGetDeploymentsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentsOutput]
  }
  @scala.inline
  implicit class BatchGetDeploymentsOutputOps[Self <: BatchGetDeploymentsOutput] (val x: Self) extends AnyVal {
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
    def setDeploymentsInfoVarargs(value: DeploymentInfo*): Self = this.set("deploymentsInfo", js.Array(value :_*))
    @scala.inline
    def setDeploymentsInfo(value: DeploymentsInfoList): Self = this.set("deploymentsInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentsInfo: Self = this.set("deploymentsInfo", js.undefined)
  }
  
}

