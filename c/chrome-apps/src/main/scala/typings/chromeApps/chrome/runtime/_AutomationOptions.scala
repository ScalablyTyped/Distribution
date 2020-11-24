package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`false`
import typings.chromeApps.chromeAppsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AutomationOptions extends js.Object
object _AutomationOptions {
  
  @scala.inline
  def AutomationDesktop(desktop: `true`): _AutomationOptions = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AutomationOptions]
  }
  
  @scala.inline
  def AutomationNonInteractive(interact: `false`): _AutomationOptions = {
    val __obj = js.Dynamic.literal(interact = interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AutomationOptions]
  }
}
