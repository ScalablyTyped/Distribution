package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStateChangeReason extends js.Object {
  /**
    * The programmatic code for the state change reason.
    */
  var Code: js.UndefOr[ClusterStateChangeReasonCode] = js.native
  /**
    * The descriptive message for the state change reason.
    */
  var Message: js.UndefOr[String] = js.native
}

object ClusterStateChangeReason {
  @scala.inline
  def apply(Code: ClusterStateChangeReasonCode = null, Message: String = null): ClusterStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStateChangeReason]
  }
}

