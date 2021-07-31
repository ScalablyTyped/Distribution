package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.screen_
import typings.chromeApps.chromeAppsStrings.tab_
import typings.chromeApps.chromeAppsStrings.window_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUDIO extends StObject {
  
  var AUDIO: audio_
  
  var SCREEN: screen_
  
  var TAB: tab_
  
  var WINDOW: window_
}
object AUDIO {
  
  @scala.inline
  def apply(): AUDIO = {
    val __obj = js.Dynamic.literal(AUDIO = "audio", SCREEN = "screen", TAB = "tab", WINDOW = "window")
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
