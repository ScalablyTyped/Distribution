package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`false`
import typings.chromeApps.chromeAppsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AutomationOptions extends StObject
object _AutomationOptions {
  
  @scala.inline
  def AutomationDesktop(desktop: `true`): typings.chromeApps.chrome.runtime.AutomationDesktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.chromeApps.chrome.runtime.AutomationDesktop]
  }
  
  @scala.inline
  def AutomationNonInteractive(interact: `false`): typings.chromeApps.chrome.runtime.AutomationNonInteractive = {
    val __obj = js.Dynamic.literal(interact = interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.chromeApps.chrome.runtime.AutomationNonInteractive]
  }
}
