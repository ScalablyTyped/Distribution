package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.ErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class SessionStateEventDataMutableBuilder[Self <: SessionStateEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: CastSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionState(value: SessionState): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
  }
}
