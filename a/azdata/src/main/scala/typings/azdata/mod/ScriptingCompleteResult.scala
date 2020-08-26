package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptingCompleteResult extends js.Object {
  var canceled: Boolean = js.native
  var errorDetails: String = js.native
  var errorMessage: String = js.native
  var hasError: Boolean = js.native
  var operationId: String = js.native
  var success: Boolean = js.native
}

object ScriptingCompleteResult {
  @scala.inline
  def apply(
    canceled: Boolean,
    errorDetails: String,
    errorMessage: String,
    hasError: Boolean,
    operationId: String,
    success: Boolean
  ): ScriptingCompleteResult = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], errorDetails = errorDetails.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingCompleteResult]
  }
  @scala.inline
  implicit class ScriptingCompleteResultOps[Self <: ScriptingCompleteResult] (val x: Self) extends AnyVal {
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
    def setCanceled(value: Boolean): Self = this.set("canceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorDetails(value: String): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasError(value: Boolean): Self = this.set("hasError", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

