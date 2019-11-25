package typings.atAwsDashSdkClientDashLambdaDashNode.typesPolicyLengthExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PolicyLengthExceededExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _PolicyLengthExceededExceptionDetails {
  @scala.inline
  def apply(Type: String = null, message: String = null): _PolicyLengthExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PolicyLengthExceededExceptionDetails]
  }
}

