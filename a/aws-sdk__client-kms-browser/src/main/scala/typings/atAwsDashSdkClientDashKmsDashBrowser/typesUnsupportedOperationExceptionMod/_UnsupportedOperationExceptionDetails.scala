package typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnsupportedOperationExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnsupportedOperationExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _UnsupportedOperationExceptionDetails {
  @scala.inline
  def apply(message: String = null): _UnsupportedOperationExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_UnsupportedOperationExceptionDetails]
  }
}

