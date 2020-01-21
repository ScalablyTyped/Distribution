package typings.awsSdkClientXrayNode.typesThrottledExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottledExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var Message: js.UndefOr[String] = js.undefined
}

object ThrottledExceptionDetails {
  @scala.inline
  def apply(Message: String = null): ThrottledExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottledExceptionDetails]
  }
}

