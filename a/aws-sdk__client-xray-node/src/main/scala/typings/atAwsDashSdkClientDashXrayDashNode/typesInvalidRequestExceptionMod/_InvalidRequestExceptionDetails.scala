package typings.atAwsDashSdkClientDashXrayDashNode.typesInvalidRequestExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidRequestExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var Message: js.UndefOr[String] = js.undefined
}

object _InvalidRequestExceptionDetails {
  @scala.inline
  def apply(Message: String = null): _InvalidRequestExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[_InvalidRequestExceptionDetails]
  }
}

