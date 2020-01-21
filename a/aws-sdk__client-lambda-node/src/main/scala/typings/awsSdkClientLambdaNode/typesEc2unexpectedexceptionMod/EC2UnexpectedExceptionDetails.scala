package typings.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2UnexpectedExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var EC2ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
}

object EC2UnexpectedExceptionDetails {
  @scala.inline
  def apply(EC2ErrorCode: String = null, Message: String = null, Type: String = null): EC2UnexpectedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (EC2ErrorCode != null) __obj.updateDynamic("EC2ErrorCode")(EC2ErrorCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2UnexpectedExceptionDetails]
  }
}

