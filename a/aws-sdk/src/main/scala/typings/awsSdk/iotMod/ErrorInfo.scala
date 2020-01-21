package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorInfo extends js.Object {
  /**
    * The error code.
    */
  var code: js.UndefOr[Code] = js.native
  /**
    * The error message.
    */
  var message: js.UndefOr[OTAUpdateErrorMessage] = js.native
}

object ErrorInfo {
  @scala.inline
  def apply(code: Code = null, message: OTAUpdateErrorMessage = null): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

