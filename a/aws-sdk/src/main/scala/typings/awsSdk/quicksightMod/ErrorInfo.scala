package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorInfo extends js.Object {
  /**
    * Error message.
    */
  var Message: js.UndefOr[java.lang.String] = js.native
  /**
    * Error type.
    */
  var Type: js.UndefOr[IngestionErrorType] = js.native
}

object ErrorInfo {
  @scala.inline
  def apply(Message: java.lang.String = null, Type: IngestionErrorType = null): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

