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
  def apply(OperationId: ClientRequestToken = null): DetectStackSetDriftOutput = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackSetDriftOutput]
  }
}

