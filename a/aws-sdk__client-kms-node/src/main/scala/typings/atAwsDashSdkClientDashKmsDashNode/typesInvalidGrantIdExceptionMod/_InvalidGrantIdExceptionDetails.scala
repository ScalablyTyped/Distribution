package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidGrantIdExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidGrantIdExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidGrantIdExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidGrantIdExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InvalidGrantIdExceptionDetails]
  }
}

