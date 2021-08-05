package typings.chrome.anon

import typings.chrome.chrome.loginState.ProfileType
import typings.chrome.chrome.loginState.SessionState
import typings.chrome.chrome.loginState.SessionStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofloginState extends StObject {
  
  def getProfileType(callback: js.Function1[/* profileType */ ProfileType, Unit]): Unit
  
  def getSessionState(callback: js.Function1[/* sessionState */ SessionState, Unit]): Unit
  
  val onSessionStateChanged: SessionStateChangedEvent
}
object TypeofloginState {
  
  inline def apply(
    getProfileType: js.Function1[/* profileType */ ProfileType, Unit] => Unit,
    getSessionState: js.Function1[/* sessionState */ SessionState, Unit] => Unit,
    onSessionStateChanged: SessionStateChangedEvent
  ): TypeofloginState = {
    val __obj = js.Dynamic.literal(getProfileType = js.Any.fromFunction1(getProfileType), getSessionState = js.Any.fromFunction1(getSessionState), onSessionStateChanged = onSessionStateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofloginState]
  }
  
  extension [Self <: TypeofloginState](x: Self) {
    
    inline def setGetProfileType(value: js.Function1[/* profileType */ ProfileType, Unit] => Unit): Self = StObject.set(x, "getProfileType", js.Any.fromFunction1(value))
    
    inline def setGetSessionState(value: js.Function1[/* sessionState */ SessionState, Unit] => Unit): Self = StObject.set(x, "getSessionState", js.Any.fromFunction1(value))
    
    inline def setOnSessionStateChanged(value: SessionStateChangedEvent): Self = StObject.set(x, "onSessionStateChanged", value.asInstanceOf[js.Any])
  }
}
