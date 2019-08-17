package typings.atAwsDashSdkClientDashLambdaDashNode.typesResourceInUseExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ResourceInUseExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
}

object _ResourceInUseExceptionDetails {
  @scala.inline
  def apply(Message: String = null, Type: String = null): _ResourceInUseExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[_ResourceInUseExceptionDetails]
  }
}

