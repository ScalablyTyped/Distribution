package typings.atAwsDashSdkClientDashXrayDashNode.typesThrottledExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ThrottledExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var Message: js.UndefOr[String] = js.undefined
}

object _ThrottledExceptionDetails {
  @scala.inline
  def apply(Message: String = null): _ThrottledExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[_ThrottledExceptionDetails]
  }
}

