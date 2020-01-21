package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateSessionResponse extends js.Object {
  /**
    * The ID of the session that has been terminated.
    */
  var SessionId: js.UndefOr[typings.awsSdk.ssmMod.SessionId] = js.native
}

object TerminateSessionResponse {
  @scala.inline
  def apply(SessionId: SessionId = null): TerminateSessionResponse = {
    val __obj = js.Dynamic.literal()
    if (SessionId != null) __obj.updateDynamic("SessionId")(SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateSessionResponse]
  }
}

