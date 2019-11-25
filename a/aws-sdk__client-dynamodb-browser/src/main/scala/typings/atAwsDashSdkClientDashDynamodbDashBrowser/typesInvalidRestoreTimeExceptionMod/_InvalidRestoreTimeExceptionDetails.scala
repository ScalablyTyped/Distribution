package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInvalidRestoreTimeExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidRestoreTimeExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidRestoreTimeExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidRestoreTimeExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InvalidRestoreTimeExceptionDetails]
  }
}

