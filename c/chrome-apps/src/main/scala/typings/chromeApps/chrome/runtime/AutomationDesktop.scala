package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationDesktop
  extends StObject
     with _AutomationOptions {
  
  var desktop: `true`
  
  var interact: js.UndefOr[`true`] = js.undefined
}
object AutomationDesktop {
  
  @scala.inline
  def apply(): AutomationDesktop = {
    val __obj = js.Dynamic.literal(desktop = true)
    __obj.asInstanceOf[AutomationDesktop]
  }
  
  @scala.inline
  implicit class AutomationDesktopMutableBuilder[Self <: AutomationDesktop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesktop(value: `true`): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteract(value: `true`): Self = StObject.set(x, "interact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractUndefined: Self = StObject.set(x, "interact", js.undefined)
  }
}
