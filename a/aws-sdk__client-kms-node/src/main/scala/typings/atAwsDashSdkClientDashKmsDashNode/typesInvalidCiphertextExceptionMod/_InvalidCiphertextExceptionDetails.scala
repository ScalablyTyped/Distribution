package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidCiphertextExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidCiphertextExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidCiphertextExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidCiphertextExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InvalidCiphertextExceptionDetails]
  }
}

