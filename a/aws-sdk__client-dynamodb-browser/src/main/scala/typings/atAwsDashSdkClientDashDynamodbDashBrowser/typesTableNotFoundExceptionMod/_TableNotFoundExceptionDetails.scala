package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesTableNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TableNotFoundExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _TableNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): _TableNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TableNotFoundExceptionDetails]
  }
}

