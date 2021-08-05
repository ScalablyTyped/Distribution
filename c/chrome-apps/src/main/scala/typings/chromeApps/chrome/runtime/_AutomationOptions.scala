package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AutomationOptions extends StObject
object _AutomationOptions {
  
  inline def AutomationDesktop(): typings.chromeApps.chrome.runtime.AutomationDesktop = {
    val __obj = js.Dynamic.literal(desktop = true)
    __obj.asInstanceOf[typings.chromeApps.chrome.runtime.AutomationDesktop]
  }
  
  inline def AutomationNonInteractive(): typings.chromeApps.chrome.runtime.AutomationNonInteractive = {
    val __obj = js.Dynamic.literal(interact = false)
    __obj.asInstanceOf[typings.chromeApps.chrome.runtime.AutomationNonInteractive]
  }
}
