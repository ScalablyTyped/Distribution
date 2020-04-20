package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptingCompleteResult extends js.Object {
  var canceled: Boolean
  var errorDetails: String
  var errorMessage: String
  var hasError: Boolean
  var operationId: String
  var success: Boolean
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
}

