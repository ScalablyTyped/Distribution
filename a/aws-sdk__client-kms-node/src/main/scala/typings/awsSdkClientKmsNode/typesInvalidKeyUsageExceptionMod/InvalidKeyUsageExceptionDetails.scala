package typings.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidKeyUsageExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidKeyUsageExceptionDetails {
  @scala.inline
  def apply(message: String = null): InvalidKeyUsageExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidKeyUsageExceptionDetails]
  }
}

