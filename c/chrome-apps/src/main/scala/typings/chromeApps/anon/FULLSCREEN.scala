package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.fullscreen_
import typings.chromeApps.chromeAppsStrings.maximized_
import typings.chromeApps.chromeAppsStrings.minimized_
import typings.chromeApps.chromeAppsStrings.normal_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FULLSCREEN extends StObject {
  
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
  implicit class FULLSCREENMutableBuilder[Self <: FULLSCREEN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFULLSCREEN(value: fullscreen_): Self = StObject.set(x, "FULLSCREEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAXIMIZED(value: maximized_): Self = StObject.set(x, "MAXIMIZED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMINIMIZED(value: minimized_): Self = StObject.set(x, "MINIMIZED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNORMAL(value: normal_): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
  }
}
