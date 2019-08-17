package typings.atAwsDashSdkClientDashLambdaDashNode.typesResourceNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ResourceNotFoundExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
}

object _ResourceNotFoundExceptionDetails {
  @scala.inline
  def apply(Message: String = null, Type: String = null): _ResourceNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[_ResourceNotFoundExceptionDetails]
  }
}

