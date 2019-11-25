package typings.atAwsDashSdkClientDashKmsDashNode.typesAlreadyExistsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AlreadyExistsExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _AlreadyExistsExceptionDetails {
  @scala.inline
  def apply(message: String = null): _AlreadyExistsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AlreadyExistsExceptionDetails]
  }
}

