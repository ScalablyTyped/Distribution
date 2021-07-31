package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chromeAppsStrings.Disabled_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The current state of the device. */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.Uninitialized
  - typings.chromeApps.chromeAppsStrings.Disabled_
  - typings.chromeApps.chromeAppsStrings.Enabling
  - typings.chromeApps.chromeAppsStrings.Enabled
  - typings.chromeApps.chromeAppsStrings.Prohibited
*/
trait DeviceState extends StObject
object DeviceState {
  
  @scala.inline
  def Disabled: Disabled_ = "Disabled".asInstanceOf[Disabled_]
  
  @scala.inline
  def Enabled: typings.chromeApps.chromeAppsStrings.Enabled = "Enabled".asInstanceOf[typings.chromeApps.chromeAppsStrings.Enabled]
  
  @scala.inline
  def Enabling: typings.chromeApps.chromeAppsStrings.Enabling = "Enabling".asInstanceOf[typings.chromeApps.chromeAppsStrings.Enabling]
  
  @scala.inline
  def Prohibited: typings.chromeApps.chromeAppsStrings.Prohibited = "Prohibited".asInstanceOf[typings.chromeApps.chromeAppsStrings.Prohibited]
  
  @scala.inline
  def Uninitialized: typings.chromeApps.chromeAppsStrings.Uninitialized = "Uninitialized".asInstanceOf[typings.chromeApps.chromeAppsStrings.Uninitialized]
}
