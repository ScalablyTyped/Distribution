package typings.chromeApps.chrome.displaySource

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSessionInfo extends js.Object {
  
  var audioTrack: js.UndefOr[js.Object] = js.native
  
  var authenticationInfo: js.UndefOr[AuthenticationInfo] = js.native
  
  var sinkId: integer = js.native
  
  var videoTrack: js.UndefOr[js.Object] = js.native
}
object StartSessionInfo {
  
  @scala.inline
  def apply(sinkId: integer): StartSessionInfo = {
    val __obj = js.Dynamic.literal(sinkId = sinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionInfo]
  }
  
  @scala.inline
  implicit class StartSessionInfoOps[Self <: StartSessionInfo] (val x: Self) extends AnyVal {
    
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
    def setSinkId(value: integer): Self = this.set("sinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTrack(value: js.Object): Self = this.set("audioTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioTrack: Self = this.set("audioTrack", js.undefined)
    
    @scala.inline
    def setAuthenticationInfo(value: AuthenticationInfo): Self = this.set("authenticationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationInfo: Self = this.set("authenticationInfo", js.undefined)
    
    @scala.inline
    def setVideoTrack(value: js.Object): Self = this.set("videoTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoTrack: Self = this.set("videoTrack", js.undefined)
  }
}
