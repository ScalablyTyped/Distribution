package typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreconditionFailedExceptionDetails extends js.Object {
  /**
    * <p>The exception type.</p>
    */
  var Type: js.UndefOr[String] = js.undefined
  /**
    * <p>The exception message.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object PreconditionFailedExceptionDetails {
  @scala.inline
  def apply(Type: String = null, message: String = null): PreconditionFailedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconditionFailedExceptionDetails]
  }
}

