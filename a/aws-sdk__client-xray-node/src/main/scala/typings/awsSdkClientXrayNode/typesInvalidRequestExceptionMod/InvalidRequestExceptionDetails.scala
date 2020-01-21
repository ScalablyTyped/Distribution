package typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRequestExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var Message: js.UndefOr[String] = js.undefined
}

object InvalidRequestExceptionDetails {
  @scala.inline
  def apply(Message: String = null): InvalidRequestExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRequestExceptionDetails]
  }
}

