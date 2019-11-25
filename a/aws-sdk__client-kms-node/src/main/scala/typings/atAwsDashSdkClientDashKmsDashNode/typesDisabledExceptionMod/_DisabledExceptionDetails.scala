package typings.atAwsDashSdkClientDashKmsDashNode.typesDisabledExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DisabledExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _DisabledExceptionDetails {
  @scala.inline
  def apply(message: String = null): _DisabledExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DisabledExceptionDetails]
  }
}

