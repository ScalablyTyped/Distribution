package typings.awsSdkClientLambdaNode.typesInvalidSecurityGroupIDExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSecurityGroupIDExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
}

object InvalidSecurityGroupIDExceptionDetails {
  @scala.inline
  def apply(Message: String = null, Type: String = null): InvalidSecurityGroupIDExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSecurityGroupIDExceptionDetails]
  }
}

