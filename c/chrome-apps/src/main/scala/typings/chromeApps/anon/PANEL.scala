package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.panel
import typings.chromeApps.chromeAppsStrings.shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PANEL extends StObject {
  
  var PANEL: panel = js.native
  
  var SHELL: shell = js.native
}
object PANEL {
  
  @scala.inline
  def apply(PANEL: panel, SHELL: shell): PANEL = {
    val __obj = js.Dynamic.literal(PANEL = PANEL.asInstanceOf[js.Any], SHELL = SHELL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PANEL]
  }
  
  @scala.inline
  implicit class PANELMutableBuilder[Self <: PANEL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPANEL(value: panel): Self = StObject.set(x, "PANEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHELL(value: shell): Self = StObject.set(x, "SHELL", value.asInstanceOf[js.Any])
  }
}
