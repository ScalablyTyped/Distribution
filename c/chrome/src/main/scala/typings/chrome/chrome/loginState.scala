package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// LoginState
////////////////////
/**
  * Use the chrome.loginState API to read and monitor the login state.
  * Permissions: "loginState"
  * @since Chrome 78.
  * Important: This API works only on Chrome OS.
  */
object loginState {
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.SIGNIN_PROFILE
    - typings.chrome.chromeStrings.USER_PROFILE
  */
  trait ProfileType extends StObject
  object ProfileType {
    
    @scala.inline
    def SIGNIN_PROFILE: typings.chrome.chromeStrings.SIGNIN_PROFILE = "SIGNIN_PROFILE".asInstanceOf[typings.chrome.chromeStrings.SIGNIN_PROFILE]
    
    @scala.inline
    def USER_PROFILE: typings.chrome.chromeStrings.USER_PROFILE = "USER_PROFILE".asInstanceOf[typings.chrome.chromeStrings.USER_PROFILE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.UNKNOWN
    - typings.chrome.chromeStrings.IN_OOBE_SCREEN
    - typings.chrome.chromeStrings.IN_LOGIN_SCREEN
    - typings.chrome.chromeStrings.IN_SESSION
    - typings.chrome.chromeStrings.IN_LOCK_SCREEN
  */
  trait SessionState extends StObject
  object SessionState {
    
    @scala.inline
    def IN_LOCK_SCREEN: typings.chrome.chromeStrings.IN_LOCK_SCREEN = "IN_LOCK_SCREEN".asInstanceOf[typings.chrome.chromeStrings.IN_LOCK_SCREEN]
    
    @scala.inline
    def IN_LOGIN_SCREEN: typings.chrome.chromeStrings.IN_LOGIN_SCREEN = "IN_LOGIN_SCREEN".asInstanceOf[typings.chrome.chromeStrings.IN_LOGIN_SCREEN]
    
    @scala.inline
    def IN_OOBE_SCREEN: typings.chrome.chromeStrings.IN_OOBE_SCREEN = "IN_OOBE_SCREEN".asInstanceOf[typings.chrome.chromeStrings.IN_OOBE_SCREEN]
    
    @scala.inline
    def IN_SESSION: typings.chrome.chromeStrings.IN_SESSION = "IN_SESSION".asInstanceOf[typings.chrome.chromeStrings.IN_SESSION]
    
    @scala.inline
    def UNKNOWN: typings.chrome.chromeStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.chrome.chromeStrings.UNKNOWN]
  }
  
  type SessionStateChangedEvent = Event[js.Function1[/* sessionState */ SessionState, Unit]]
}
