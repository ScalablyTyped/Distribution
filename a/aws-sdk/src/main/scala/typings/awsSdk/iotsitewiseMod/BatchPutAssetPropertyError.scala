package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutAssetPropertyError extends js.Object {
  /**
    * The error code.
    */
  var errorCode: BatchPutAssetPropertyValueErrorCode = js.native
  /**
    * The associated error message.
    */
  var errorMessage: ErrorMessage = js.native
  /**
    * A list of timestamps for each error, if any.
    */
  var timestamps: Timestamps = js.native
}

object BatchPutAssetPropertyError {
  @scala.inline
  def apply(errorCode: BatchPutAssetPropertyValueErrorCode, errorMessage: ErrorMessage, timestamps: Timestamps): BatchPutAssetPropertyError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], timestamps = timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyError]
  }
  @scala.inline
  implicit class BatchPutAssetPropertyErrorOps[Self <: BatchPutAssetPropertyError] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: BatchPutAssetPropertyValueErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestampsVarargs(value: TimeInNanos*): Self = this.set("timestamps", js.Array(value :_*))
    @scala.inline
    def setTimestamps(value: Timestamps): Self = this.set("timestamps", value.asInstanceOf[js.Any])
  }
  
}

