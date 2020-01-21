package typings.awsSdkClientKmsBrowser.typesIncorrectKeyMaterialExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncorrectKeyMaterialExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object IncorrectKeyMaterialExceptionDetails {
  @scala.inline
  def apply(message: String = null): IncorrectKeyMaterialExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncorrectKeyMaterialExceptionDetails]
  }
}

