package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    *  Details of the failure.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    * A descriptive reason for the failure that may help in diagnostics.
    */
  var reason: js.UndefOr[FailureReason] = js.native
}

object FailWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(details: Data = null, reason: FailureReason = null): FailWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailWorkflowExecutionDecisionAttributes]
  }
}

