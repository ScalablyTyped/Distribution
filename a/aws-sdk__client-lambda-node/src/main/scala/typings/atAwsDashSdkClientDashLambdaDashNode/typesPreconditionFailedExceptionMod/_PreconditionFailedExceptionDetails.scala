package typings.atAwsDashSdkClientDashLambdaDashNode.typesPreconditionFailedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PreconditionFailedExceptionDetails extends js.Object {
  /**
    * <p>The exception type.</p>
    */
  var Type: js.UndefOr[String] = js.undefined
  /**
    * <p>The exception message.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _PreconditionFailedExceptionDetails {
  @scala.inline
  def apply(Type: String = null, message: String = null): _PreconditionFailedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_PreconditionFailedExceptionDetails]
  }
}

