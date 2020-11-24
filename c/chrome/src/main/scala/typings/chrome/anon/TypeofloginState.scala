package typings.chrome.anon

import typings.chrome.chrome.loginState.ProfileType
import typings.chrome.chrome.loginState.SessionState
import typings.chrome.chrome.loginState.SessionStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofloginState extends js.Object {
  
  def getProfileType(callback: js.Function1[/* profileType */ ProfileType, Unit]): Unit = js.native
  
  def getSessionState(callback: js.Function1[/* sessionState */ SessionState, Unit]): Unit = js.native
  
  val onSessionStateChanged: SessionStateChangedEvent = js.native
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
  
  @scala.inline
  implicit class TypeofloginStateOps[Self <: TypeofloginState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetProfileType(value: js.Function1[/* profileType */ ProfileType, Unit] => Unit): Self = this.set("getProfileType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSessionState(value: js.Function1[/* sessionState */ SessionState, Unit] => Unit): Self = this.set("getSessionState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSessionStateChanged(value: SessionStateChangedEvent): Self = this.set("onSessionStateChanged", value.asInstanceOf[js.Any])
  }
}
