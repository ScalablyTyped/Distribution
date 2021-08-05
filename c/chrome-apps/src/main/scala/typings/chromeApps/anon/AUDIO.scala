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
  
  inline def apply(): AUDIO = {
    val __obj = js.Dynamic.literal(AUDIO = "audio", SCREEN = "screen", TAB = "tab", WINDOW = "window")
    __obj.asInstanceOf[AUDIO]
  }
  
  extension [Self <: AUDIO](x: Self) {
    
    inline def setAUDIO(value: audio_): Self = StObject.set(x, "AUDIO", value.asInstanceOf[js.Any])
    
    inline def setSCREEN(value: screen_): Self = StObject.set(x, "SCREEN", value.asInstanceOf[js.Any])
    
    inline def setTAB(value: tab_): Self = StObject.set(x, "TAB", value.asInstanceOf[js.Any])
    
    inline def setWINDOW(value: window_): Self = StObject.set(x, "WINDOW", value.asInstanceOf[js.Any])
  }
}
