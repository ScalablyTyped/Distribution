package typings.atAwsDashSdkClientDashKmsDashBrowser.typesIncorrectKeyMaterialExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IncorrectKeyMaterialExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _IncorrectKeyMaterialExceptionDetails {
  @scala.inline
  def apply(message: String = null): _IncorrectKeyMaterialExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IncorrectKeyMaterialExceptionDetails]
  }
}

