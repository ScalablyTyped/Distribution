package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackSetDriftOutput extends js.Object {
  /**
    * The ID of the drift detection stack set operation.  you can use this operation id with  DescribeStackSetOperation  to monitor the progress of the drift detection operation. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
}

object DetectStackSetDriftOutput {
  @scala.inline
  def apply(): DetectStackSetDriftOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectStackSetDriftOutput]
  }
  @scala.inline
  implicit class DetectStackSetDriftOutputOps[Self <: DetectStackSetDriftOutput] (val x: Self) extends AnyVal {
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
    def setOperationId(value: ClientRequestToken): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
  }
  
}

