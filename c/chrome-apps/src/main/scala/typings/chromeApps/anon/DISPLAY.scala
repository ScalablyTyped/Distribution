package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.display_
import typings.chromeApps.chromeAppsStrings.system_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DISPLAY extends StObject {
  
  var DISPLAY: display_
  
  var SYSTEM: system_
}
object DISPLAY {
  
  @scala.inline
  def apply(): DISPLAY = {
    val __obj = js.Dynamic.literal(DISPLAY = "display", SYSTEM = "system")
    __obj.asInstanceOf[DISPLAY]
  }
  
  @scala.inline
  implicit class DISPLAYMutableBuilder[Self <: DISPLAY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDISPLAY(value: display_): Self = StObject.set(x, "DISPLAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSYSTEM(value: system_): Self = StObject.set(x, "SYSTEM", value.asInstanceOf[js.Any])
  }
}
