package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesTableInUseExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TableInUseExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _TableInUseExceptionDetails {
  @scala.inline
  def apply(message: String = null): _TableInUseExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TableInUseExceptionDetails]
  }
}

