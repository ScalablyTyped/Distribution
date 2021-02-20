package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomationDesktop extends _AutomationOptions {
  
  var desktop: `true` = js.native
  
  var interact: js.UndefOr[`true`] = js.native
}
object AutomationDesktop {
  
  @scala.inline
  def apply(desktop: `true`): AutomationDesktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any])
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
