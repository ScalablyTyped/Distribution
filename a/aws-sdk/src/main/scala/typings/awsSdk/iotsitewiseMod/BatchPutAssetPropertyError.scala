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
}

