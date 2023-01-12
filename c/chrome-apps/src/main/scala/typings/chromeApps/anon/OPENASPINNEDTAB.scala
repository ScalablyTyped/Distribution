package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
import typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OPENASPINNEDTAB extends StObject {
  
  var OPEN_AS_PINNED_TAB: typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
  
  var OPEN_AS_REGULAR_TAB: typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
  
  var OPEN_AS_WINDOW: typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
  
  var OPEN_FULL_SCREEN: typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
}
object OPENASPINNEDTAB {
  
  inline def apply(): OPENASPINNEDTAB = {
    val __obj = js.Dynamic.literal(OPEN_AS_PINNED_TAB = "OPEN_AS_PINNED_TAB", OPEN_AS_REGULAR_TAB = "OPEN_AS_REGULAR_TAB", OPEN_AS_WINDOW = "OPEN_AS_WINDOW", OPEN_FULL_SCREEN = "OPEN_FULL_SCREEN")
    __obj.asInstanceOf[OPENASPINNEDTAB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OPENASPINNEDTAB] (val x: Self) extends AnyVal {
    
    inline def setOPEN_AS_PINNED_TAB(value: OPEN_AS_PINNED_TAB): Self = StObject.set(x, "OPEN_AS_PINNED_TAB", value.asInstanceOf[js.Any])
    
    inline def setOPEN_AS_REGULAR_TAB(value: OPEN_AS_REGULAR_TAB): Self = StObject.set(x, "OPEN_AS_REGULAR_TAB", value.asInstanceOf[js.Any])
    
    inline def setOPEN_AS_WINDOW(value: OPEN_AS_WINDOW): Self = StObject.set(x, "OPEN_AS_WINDOW", value.asInstanceOf[js.Any])
    
    inline def setOPEN_FULL_SCREEN(value: OPEN_FULL_SCREEN): Self = StObject.set(x, "OPEN_FULL_SCREEN", value.asInstanceOf[js.Any])
  }
}
