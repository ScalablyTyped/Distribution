package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentInstanceOutput extends js.Object {
  /**
    *  Information about the instance. 
    */
  var instanceSummary: js.UndefOr[InstanceSummary] = js.native
}

object GetDeploymentInstanceOutput {
  @scala.inline
  def apply(): GetDeploymentInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentInstanceOutput]
  }
  @scala.inline
  implicit class GetDeploymentInstanceOutputOps[Self <: GetDeploymentInstanceOutput] (val x: Self) extends AnyVal {
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
    def setInstanceSummary(value: InstanceSummary): Self = this.set("instanceSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceSummary: Self = this.set("instanceSummary", js.undefined)
  }
  
}

