package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionStateEventData extends EventData {
  var errorCode: ErrorCode
  var session: CastSession
  var sessionState: SessionState
}

object SessionStateEventData {
  @scala.inline
  def apply(errorCode: ErrorCode, session: CastSession, sessionState: SessionState, `type`: String): SessionStateEventData = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], sessionState = sessionState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStateEventData]
  }
}

