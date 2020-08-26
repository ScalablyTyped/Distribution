package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateSessionRequest extends js.Object {
  /**
    * The ID of the session to terminate.
    */
  var SessionId: typings.awsSdk.ssmMod.SessionId = js.native
}

object TerminateSessionRequest {
  @scala.inline
  def apply(SessionId: SessionId): TerminateSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateSessionRequest]
  }
  @scala.inline
  implicit class TerminateSessionRequestOps[Self <: TerminateSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSessionId(value: SessionId): Self = this.set("SessionId", value.asInstanceOf[js.Any])
  }
  
}

