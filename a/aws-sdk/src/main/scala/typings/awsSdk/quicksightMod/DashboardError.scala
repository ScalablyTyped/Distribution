package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardError extends js.Object {
  /**
    * Message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
  /**
    * Type.
    */
  var Type: js.UndefOr[DashboardErrorType] = js.native
}

object DashboardError {
  @scala.inline
  def apply(Message: NonEmptyString = null, Type: DashboardErrorType = null): DashboardError = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardError]
  }
}

