package typings.atAwsDashSdkClientDashLambdaDashNode.typesEC2UnexpectedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EC2UnexpectedExceptionDetails extends js.Object {
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

object _EC2UnexpectedExceptionDetails {
  @scala.inline
  def apply(EC2ErrorCode: String = null, Message: String = null, Type: String = null): _EC2UnexpectedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (EC2ErrorCode != null) __obj.updateDynamic("EC2ErrorCode")(EC2ErrorCode)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[_EC2UnexpectedExceptionDetails]
  }
}

