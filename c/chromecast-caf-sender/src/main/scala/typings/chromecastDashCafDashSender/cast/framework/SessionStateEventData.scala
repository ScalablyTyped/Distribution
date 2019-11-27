package typings.chromecastDashCafDashSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.SessionStateEventData")
@js.native
class SessionStateEventData protected () extends EventData {
  def this(
    session: CastSession,
    sessionState: SessionState,
    opt_errorCode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.ErrorCode */ js.Any
  ) = this()
  var errorCode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.ErrorCode */ js.Any = js.native
  var session: CastSession = js.native
  var sessionState: SessionState = js.native
}

