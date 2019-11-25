package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesKMSThrottlingExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KMSThrottlingExceptionDetails extends js.Object {
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _KMSThrottlingExceptionDetails {
  @scala.inline
  def apply(message: String = null): _KMSThrottlingExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KMSThrottlingExceptionDetails]
  }
}

