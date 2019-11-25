package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesIndexNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IndexNotFoundExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _IndexNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): _IndexNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IndexNotFoundExceptionDetails]
  }
}

