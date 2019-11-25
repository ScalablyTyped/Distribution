package typings.atAwsDashSdkClientDashLambdaDashNode.typesKMSAccessDeniedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KMSAccessDeniedExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
}

object _KMSAccessDeniedExceptionDetails {
  @scala.inline
  def apply(Message: String = null, Type: String = null): _KMSAccessDeniedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KMSAccessDeniedExceptionDetails]
  }
}

