package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionStateEventData extends EventData {
  var errorCode: ErrorCode = js.native
  var session: CastSession = js.native
  var sessionState: SessionState = js.native
}

object SessionStateEventData {
  @scala.inline
  def apply(errorCode: ErrorCode, session: CastSession, sessionState: SessionState, `type`: String): SessionStateEventData = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], sessionState = sessionState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStateEventData]
  }
  @scala.inline
  implicit class SessionStateEventDataOps[Self <: SessionStateEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: CastSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionState(value: SessionState): Self = this.set("sessionState", value.asInstanceOf[js.Any])
  }
  
}

