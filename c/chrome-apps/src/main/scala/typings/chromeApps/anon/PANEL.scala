package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.panel
import typings.chromeApps.chromeAppsStrings.shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PANEL extends StObject {
  
  var PANEL: panel
  
  var SHELL: shell
}
object PANEL {
  
  inline def apply(): PANEL = {
    val __obj = js.Dynamic.literal(PANEL = "panel", SHELL = "shell")
    __obj.asInstanceOf[PANEL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PANEL] (val x: Self) extends AnyVal {
    
    inline def setPANEL(value: panel): Self = StObject.set(x, "PANEL", value.asInstanceOf[js.Any])
    
    inline def setSHELL(value: shell): Self = StObject.set(x, "SHELL", value.asInstanceOf[js.Any])
  }
}
