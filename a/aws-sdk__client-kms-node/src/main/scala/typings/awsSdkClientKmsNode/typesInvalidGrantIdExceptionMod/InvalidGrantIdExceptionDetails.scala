package typings.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidGrantIdExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidGrantIdExceptionDetails {
  @scala.inline
  def apply(message: String = null): InvalidGrantIdExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidGrantIdExceptionDetails]
  }
}

