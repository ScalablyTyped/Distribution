package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.SessionStateEventData")
@js.native
class SessionStateEventData protected () extends EventData {
  def this(session: CastSession, sessionState: SessionState, opt_errorCode: chromeLib.chromeNs.castNs.ErrorCode) = this()
  var errorCode: chromeLib.chromeNs.castNs.ErrorCode = js.native
  var session: CastSession = js.native
  var sessionState: SessionState = js.native
}

