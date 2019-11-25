package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidKeyUsageExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidKeyUsageExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidKeyUsageExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidKeyUsageExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InvalidKeyUsageExceptionDetails]
  }
}

