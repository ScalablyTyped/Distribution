package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeSessionRequest extends js.Object {
  /**
    * The ID of the disconnected session to resume.
    */
  var SessionId: typings.awsSdk.ssmMod.SessionId = js.native
}

object ResumeSessionRequest {
  @scala.inline
  def apply(SessionId: SessionId): ResumeSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeSessionRequest]
  }
  @scala.inline
  implicit class ResumeSessionRequestOps[Self <: ResumeSessionRequest] (val x: Self) extends AnyVal {
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

