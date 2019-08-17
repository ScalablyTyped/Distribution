package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidArnExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidArnExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidArnExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidArnExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_InvalidArnExceptionDetails]
  }
}

