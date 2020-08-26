package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationSummary extends js.Object {
  /**
    * The ID for an operation.
    */
  var Id: js.UndefOr[OperationId] = js.native
  /**
    * The status of the operation. Values include the following:    SUBMITTED: This is the initial state immediately after you submit a request.    PENDING: AWS Cloud Map is performing the operation.    SUCCESS: The operation succeeded.    FAIL: The operation failed. For the failure reason, see ErrorMessage.  
    */
  var Status: js.UndefOr[OperationStatus] = js.native
}

object OperationSummary {
  @scala.inline
  def apply(): OperationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationSummary]
  }
  @scala.inline
  implicit class OperationSummaryOps[Self <: OperationSummary] (val x: Self) extends AnyVal {
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
    def setId(value: OperationId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setStatus(value: OperationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

