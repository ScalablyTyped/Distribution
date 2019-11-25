package typings.atAwsDashSdkClientDashKmsDashBrowser.typesNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NotFoundExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _NotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): _NotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NotFoundExceptionDetails]
  }
}

