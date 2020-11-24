package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.fullscreen_
import typings.chromeApps.chromeAppsStrings.maximized_
import typings.chromeApps.chromeAppsStrings.minimized_
import typings.chromeApps.chromeAppsStrings.normal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FULLSCREEN extends js.Object {
  
  var FULLSCREEN: fullscreen_ = js.native
  
  var MAXIMIZED: maximized_ = js.native
  
  var MINIMIZED: minimized_ = js.native
  
  var NORMAL: normal_ = js.native
}
object FULLSCREEN {
  
  @scala.inline
  def apply(FULLSCREEN: fullscreen_, MAXIMIZED: maximized_, MINIMIZED: minimized_, NORMAL: normal_): FULLSCREEN = {
    val __obj = js.Dynamic.literal(FULLSCREEN = FULLSCREEN.asInstanceOf[js.Any], MAXIMIZED = MAXIMIZED.asInstanceOf[js.Any], MINIMIZED = MINIMIZED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FULLSCREEN]
  }
  
  @scala.inline
  implicit class FULLSCREENOps[Self <: FULLSCREEN] (val x: Self) extends AnyVal {
    
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
    def setFULLSCREEN(value: fullscreen_): Self = this.set("FULLSCREEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAXIMIZED(value: maximized_): Self = this.set("MAXIMIZED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMINIMIZED(value: minimized_): Self = this.set("MINIMIZED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNORMAL(value: normal_): Self = this.set("NORMAL", value.asInstanceOf[js.Any])
  }
}
