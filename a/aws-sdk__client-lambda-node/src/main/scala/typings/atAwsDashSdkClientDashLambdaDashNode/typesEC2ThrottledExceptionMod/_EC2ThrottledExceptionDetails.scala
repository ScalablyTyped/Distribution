package typings.atAwsDashSdkClientDashLambdaDashNode.typesEC2ThrottledExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EC2ThrottledExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
}

object _EC2ThrottledExceptionDetails {
  @scala.inline
  def apply(Message: String = null, Type: String = null): _EC2ThrottledExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EC2ThrottledExceptionDetails]
  }
}

