package typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedOperationExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object UnsupportedOperationExceptionDetails {
  @scala.inline
  def apply(message: String = null): UnsupportedOperationExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOperationExceptionDetails]
  }
}

