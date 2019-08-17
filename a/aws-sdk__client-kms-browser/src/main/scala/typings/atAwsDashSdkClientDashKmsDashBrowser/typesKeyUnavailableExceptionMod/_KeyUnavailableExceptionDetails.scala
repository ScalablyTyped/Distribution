package typings.atAwsDashSdkClientDashKmsDashBrowser.typesKeyUnavailableExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KeyUnavailableExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _KeyUnavailableExceptionDetails {
  @scala.inline
  def apply(message: String = null): _KeyUnavailableExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_KeyUnavailableExceptionDetails]
  }
}

