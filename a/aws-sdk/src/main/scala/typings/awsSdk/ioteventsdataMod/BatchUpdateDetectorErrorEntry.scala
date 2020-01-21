package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateDetectorErrorEntry extends js.Object {
  /**
    * The code of the error.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * A message describing the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  /**
    * The "messageId" of the update request that caused the error. (The value of the "messageId" in the update request "Detector" object.)
    */
  var messageId: js.UndefOr[MessageId] = js.native
}

object BatchUpdateDetectorErrorEntry {
  @scala.inline
  def apply(errorCode: ErrorCode = null, errorMessage: ErrorMessage = null, messageId: MessageId = null): BatchUpdateDetectorErrorEntry = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDetectorErrorEntry]
  }
}

