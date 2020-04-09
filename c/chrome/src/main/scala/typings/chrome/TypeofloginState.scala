package typings.chrome

import typings.chrome.chrome.loginState.ProfileType
import typings.chrome.chrome.loginState.SessionState
import typings.chrome.chrome.loginState.SessionStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofloginState extends js.Object {
  val onSessionStateChanged: SessionStateChangedEvent
  def getProfileType(callback: js.Function1[/* profileType */ ProfileType, Unit]): Unit
  def getSessionState(callback: js.Function1[/* sessionState */ SessionState, Unit]): Unit
}

object TypeofloginState {
  @scala.inline
  def apply(
    getProfileType: js.Function1[/* profileType */ ProfileType, Unit] => Unit,
    getSessionState: js.Function1[/* sessionState */ SessionState, Unit] => Unit,
    onSessionStateChanged: SessionStateChangedEvent
  ): TypeofloginState = {
    val __obj = js.Dynamic.literal(getProfileType = js.Any.fromFunction1(getProfileType), getSessionState = js.Any.fromFunction1(getSessionState), onSessionStateChanged = onSessionStateChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofloginState]
  }
}

