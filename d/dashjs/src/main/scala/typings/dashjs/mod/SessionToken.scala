package typings.dashjs.mod

import typings.std.MediaKeySession
import typings.std.MediaKeyStatusMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionToken extends StObject {
  
  def getExpirationTime(): Double
  
  def getKeyStatuses(): MediaKeyStatusMap
  
  def getSessionId(): String
  
  def getSessionType(): String
  
  def getUsable(): Boolean
  
  var initData: Any
  
  var session: MediaKeySession
}
object SessionToken {
  
  inline def apply(
    getExpirationTime: () => Double,
    getKeyStatuses: () => MediaKeyStatusMap,
    getSessionId: () => String,
    getSessionType: () => String,
    getUsable: () => Boolean,
    initData: Any,
    session: MediaKeySession
  ): SessionToken = {
    val __obj = js.Dynamic.literal(getExpirationTime = js.Any.fromFunction0(getExpirationTime), getKeyStatuses = js.Any.fromFunction0(getKeyStatuses), getSessionId = js.Any.fromFunction0(getSessionId), getSessionType = js.Any.fromFunction0(getSessionType), getUsable = js.Any.fromFunction0(getUsable), initData = initData.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionToken]
  }
  
  extension [Self <: SessionToken](x: Self) {
    
    inline def setGetExpirationTime(value: () => Double): Self = StObject.set(x, "getExpirationTime", js.Any.fromFunction0(value))
    
    inline def setGetKeyStatuses(value: () => MediaKeyStatusMap): Self = StObject.set(x, "getKeyStatuses", js.Any.fromFunction0(value))
    
    inline def setGetSessionId(value: () => String): Self = StObject.set(x, "getSessionId", js.Any.fromFunction0(value))
    
    inline def setGetSessionType(value: () => String): Self = StObject.set(x, "getSessionType", js.Any.fromFunction0(value))
    
    inline def setGetUsable(value: () => Boolean): Self = StObject.set(x, "getUsable", js.Any.fromFunction0(value))
    
    inline def setInitData(value: Any): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    inline def setSession(value: MediaKeySession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
