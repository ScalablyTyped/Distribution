package typings.dashjs.mod

import typings.std.MediaKeySession
import typings.std.MediaKeyStatusMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionToken extends StObject {
  
  def getExpirationTime(): Double
  
  def getKeyStatuses(): MediaKeyStatusMap
  
  def getSessionID(): String
  
  def getSessionType(): String
  
  var initData: js.Any
  
  var session: MediaKeySession
}
object SessionToken {
  
  inline def apply(
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
  
  extension [Self <: SessionToken](x: Self) {
    
    inline def setGetExpirationTime(value: () => Double): Self = StObject.set(x, "getExpirationTime", js.Any.fromFunction0(value))
    
    inline def setGetKeyStatuses(value: () => MediaKeyStatusMap): Self = StObject.set(x, "getKeyStatuses", js.Any.fromFunction0(value))
    
    inline def setGetSessionID(value: () => String): Self = StObject.set(x, "getSessionID", js.Any.fromFunction0(value))
    
    inline def setGetSessionType(value: () => String): Self = StObject.set(x, "getSessionType", js.Any.fromFunction0(value))
    
    inline def setInitData(value: js.Any): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    inline def setSession(value: MediaKeySession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
