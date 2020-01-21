package typings.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMarkerExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidMarkerExceptionDetails {
  @scala.inline
  def apply(message: String = null): InvalidMarkerExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMarkerExceptionDetails]
  }
}

