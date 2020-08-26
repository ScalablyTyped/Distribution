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
  def apply(): FailWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailWorkflowExecutionDecisionAttributes]
  }
  @scala.inline
  implicit class FailWorkflowExecutionDecisionAttributesOps[Self <: FailWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
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
    def setDetails(value: Data): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setReason(value: FailureReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

