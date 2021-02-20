package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.screen_
import typings.chromeApps.chromeAppsStrings.tab_
import typings.chromeApps.chromeAppsStrings.window_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUDIO extends StObject {
  
  var AUDIO: audio_ = js.native
  
  var SCREEN: screen_ = js.native
  
  var TAB: tab_ = js.native
  
  var WINDOW: window_ = js.native
}
object AUDIO {
  
  @scala.inline
  def apply(AUDIO: audio_, SCREEN: screen_, TAB: tab_, WINDOW: window_): AUDIO = {
    val __obj = js.Dynamic.literal(AUDIO = AUDIO.asInstanceOf[js.Any], SCREEN = SCREEN.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], WINDOW = WINDOW.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDIO]
  }
  
  @scala.inline
  implicit class AUDIOMutableBuilder[Self <: AUDIO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUDIO(value: audio_): Self = StObject.set(x, "AUDIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCREEN(value: screen_): Self = StObject.set(x, "SCREEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTAB(value: tab_): Self = StObject.set(x, "TAB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWINDOW(value: window_): Self = StObject.set(x, "WINDOW", value.asInstanceOf[js.Any])
  }
}
