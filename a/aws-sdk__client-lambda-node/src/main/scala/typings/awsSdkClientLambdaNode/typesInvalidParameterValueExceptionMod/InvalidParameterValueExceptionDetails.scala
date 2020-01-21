package typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidParameterValueExceptionDetails extends js.Object {
  /**
    * <p>The exception type.</p>
    */
  var Type: js.UndefOr[String] = js.undefined
  /**
    * <p>The exception message.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidParameterValueExceptionDetails {
  @scala.inline
  def apply(Type: String = null, message: String = null): InvalidParameterValueExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidParameterValueExceptionDetails]
  }
}

