package typings.dashjs.mod

import typings.std.MediaKeySession
import typings.std.MediaKeyStatusMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionToken extends js.Object {
  
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
  implicit class SessionTokenOps[Self <: SessionToken] (val x: Self) extends AnyVal {
    
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
    def setGetExpirationTime(value: () => Double): Self = this.set("getExpirationTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKeyStatuses(value: () => MediaKeyStatusMap): Self = this.set("getKeyStatuses", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSessionID(value: () => String): Self = this.set("getSessionID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSessionType(value: () => String): Self = this.set("getSessionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitData(value: js.Any): Self = this.set("initData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: MediaKeySession): Self = this.set("session", value.asInstanceOf[js.Any])
  }
}
