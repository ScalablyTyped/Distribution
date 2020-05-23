package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorErrorDetails extends js.Object {
  /**
    * The error code.
    */
  var code: js.UndefOr[MonitorErrorCode] = js.native
  /**
    * The error message.
    */
  var message: js.UndefOr[MonitorErrorMessage] = js.native
}

object MonitorErrorDetails {
  @scala.inline
  def apply(code: MonitorErrorCode = null, message: MonitorErrorMessage = null): MonitorErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorErrorDetails]
  }
}

