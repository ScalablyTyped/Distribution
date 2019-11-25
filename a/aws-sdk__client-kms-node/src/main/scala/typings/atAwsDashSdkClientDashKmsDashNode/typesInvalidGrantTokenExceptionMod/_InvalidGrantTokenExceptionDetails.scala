package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidGrantTokenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidGrantTokenExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidGrantTokenExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidGrantTokenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InvalidGrantTokenExceptionDetails]
  }
}

