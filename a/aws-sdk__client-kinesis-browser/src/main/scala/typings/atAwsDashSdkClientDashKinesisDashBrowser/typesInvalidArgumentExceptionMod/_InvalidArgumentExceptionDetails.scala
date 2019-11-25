package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInvalidArgumentExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidArgumentExceptionDetails extends js.Object {
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidArgumentExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidArgumentExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InvalidArgumentExceptionDetails]
  }
}

