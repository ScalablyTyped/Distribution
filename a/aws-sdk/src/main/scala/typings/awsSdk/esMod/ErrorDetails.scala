package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetails extends js.Object {
  var ErrorMessage: js.UndefOr[typings.awsSdk.esMod.ErrorMessage] = js.native
  var ErrorType: js.UndefOr[typings.awsSdk.esMod.ErrorType] = js.native
}

object ErrorDetails {
  @scala.inline
  def apply(ErrorMessage: ErrorMessage = null, ErrorType: ErrorType = null): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (ErrorType != null) __obj.updateDynamic("ErrorType")(ErrorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
}

