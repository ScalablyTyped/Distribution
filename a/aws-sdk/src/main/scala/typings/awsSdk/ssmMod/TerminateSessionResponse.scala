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
  def apply(): TerminateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateSessionResponse]
  }
  @scala.inline
  implicit class TerminateSessionResponseOps[Self <: TerminateSessionResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteSessionId: Self = this.set("SessionId", js.undefined)
  }
  
}

