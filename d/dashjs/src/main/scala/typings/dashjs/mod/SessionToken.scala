package typings.dashjs.mod

import typings.std.MediaKeySession
import typings.std.MediaKeyStatusMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionToken extends StObject {
  
  def getExpirationTime(): Double = js.native
  
  def getKeyStatuses(): MediaKeyStatusMap = js.native
  
  def getSessionID(): String = js.native
  
  def getSessionType(): String = js.native
  
  var initData: js.Any = js.native
  
  var session: MediaKeySession = js.native
}
object SessionToken {
  
  @scala.inline
  def apply(
    getExpirationTime: () => Double,
    getKeyStatuses: () => MediaKeyStatusMap,
    getSessionID: () => String,
    getSessionType: () => String,
    initData: js.Any,
    session: MediaKeySession
  ): SessionToken = {
    val __obj = js.Dynamic.literal(getExpirationTime = js.Any.fromFunction0(getExpirationTime), getKeyStatuses = js.Any.fromFunction0(getKeyStatuses), getSessionID = js.Any.fromFunction0(getSessionID), getSessionType = js.Any.fromFunction0(getSessionType), initData = initData.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionToken]
  }
  
  @scala.inline
  implicit class SessionTokenMutableBuilder[Self <: SessionToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetExpirationTime(value: () => Double): Self = StObject.set(x, "getExpirationTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKeyStatuses(value: () => MediaKeyStatusMap): Self = StObject.set(x, "getKeyStatuses", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSessionID(value: () => String): Self = StObject.set(x, "getSessionID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSessionType(value: () => String): Self = StObject.set(x, "getSessionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitData(value: js.Any): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: MediaKeySession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
