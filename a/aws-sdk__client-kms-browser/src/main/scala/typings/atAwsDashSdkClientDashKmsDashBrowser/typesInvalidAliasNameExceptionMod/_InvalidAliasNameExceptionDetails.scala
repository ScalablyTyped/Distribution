package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidAliasNameExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidAliasNameExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidAliasNameExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidAliasNameExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InvalidAliasNameExceptionDetails]
  }
}

