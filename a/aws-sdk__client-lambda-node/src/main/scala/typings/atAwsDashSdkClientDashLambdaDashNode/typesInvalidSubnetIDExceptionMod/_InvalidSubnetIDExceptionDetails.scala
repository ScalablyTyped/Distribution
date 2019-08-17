package typings.atAwsDashSdkClientDashLambdaDashNode.typesInvalidSubnetIDExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidSubnetIDExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
}

object _InvalidSubnetIDExceptionDetails {
  @scala.inline
  def apply(Message: String = null, Type: String = null): _InvalidSubnetIDExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[_InvalidSubnetIDExceptionDetails]
  }
}

