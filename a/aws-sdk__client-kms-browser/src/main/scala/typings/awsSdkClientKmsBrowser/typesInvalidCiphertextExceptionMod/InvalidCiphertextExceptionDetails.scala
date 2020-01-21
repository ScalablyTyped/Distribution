package typings.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCiphertextExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidCiphertextExceptionDetails {
  @scala.inline
  def apply(message: String = null): InvalidCiphertextExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCiphertextExceptionDetails]
  }
}

