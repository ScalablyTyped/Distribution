package typings.chromecastDashCafDashSender.cast.framework

import typings.chrome.chrome.cast.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.SessionStateEventData")
@js.native
class SessionStateEventData protected () extends EventData {
  def this(session: CastSession, sessionState: SessionState, opt_errorCode: ErrorCode) = this()
  var errorCode: ErrorCode = js.native
  var session: CastSession = js.native
  var sessionState: SessionState = js.native
}

