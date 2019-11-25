package typings.atAwsDashSdkClientDashKmsDashBrowser.typesLimitExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LimitExceededExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _LimitExceededExceptionDetails {
  @scala.inline
  def apply(message: String = null): _LimitExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LimitExceededExceptionDetails]
  }
}

