package typings.chrome.global.chrome

import typings.chrome.chrome.loginState.ProfileType
import typings.chrome.chrome.loginState.SessionState
import typings.chrome.chrome.loginState.SessionStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.loginState.getProfileType")
  @js.native
  def getProfileType(callback: js.Function1[/* profileType */ ProfileType, Unit]): Unit = js.native
  
  @JSGlobal("chrome.loginState.getSessionState")
  @js.native
  def getSessionState(callback: js.Function1[/* sessionState */ SessionState, Unit]): Unit = js.native
  
  @JSGlobal("chrome.loginState.onSessionStateChanged")
  @js.native
  val onSessionStateChanged: SessionStateChangedEvent = js.native
}
