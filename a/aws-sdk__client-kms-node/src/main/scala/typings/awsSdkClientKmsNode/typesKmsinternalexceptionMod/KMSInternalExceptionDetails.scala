package typings.awsSdkClientKmsNode.typesKmsinternalexceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSInternalExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object KMSInternalExceptionDetails {
  @scala.inline
  def apply(message: String = null): KMSInternalExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSInternalExceptionDetails]
  }
}

