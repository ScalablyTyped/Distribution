package typings.atAwsDashSdkClientDashKmsDashNode.typesExpiredImportTokenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ExpiredImportTokenExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ExpiredImportTokenExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ExpiredImportTokenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExpiredImportTokenExceptionDetails]
  }
}

