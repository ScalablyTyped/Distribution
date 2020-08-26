package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentInstancesOutput extends js.Object {
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  /**
    * Information about the instance.
    */
  var instancesSummary: js.UndefOr[InstanceSummaryList] = js.native
}

object BatchGetDeploymentInstancesOutput {
  @scala.inline
  def apply(): BatchGetDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentInstancesOutput]
  }
  @scala.inline
  implicit class BatchGetDeploymentInstancesOutputOps[Self <: BatchGetDeploymentInstancesOutput] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: ErrorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setInstancesSummaryVarargs(value: InstanceSummary*): Self = this.set("instancesSummary", js.Array(value :_*))
    @scala.inline
    def setInstancesSummary(value: InstanceSummaryList): Self = this.set("instancesSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesSummary: Self = this.set("instancesSummary", js.undefined)
  }
  
}

