package typings.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The requested disposition of the new window. */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.ignore
  - typings.chromeApps.chromeAppsStrings.save_to_disk
  - typings.chromeApps.chromeAppsStrings.current_tab
  - typings.chromeApps.chromeAppsStrings.new_background_tab
  - typings.chromeApps.chromeAppsStrings.new_foreground_tab
  - typings.chromeApps.chromeAppsStrings.new_window
  - typings.chromeApps.chromeAppsStrings.new_popup
*/
trait WindowOpenDisposition extends js.Object
object WindowOpenDisposition {
  
  @scala.inline
  def current_tab: typings.chromeApps.chromeAppsStrings.current_tab = "current_tab".asInstanceOf[typings.chromeApps.chromeAppsStrings.current_tab]
  
  @scala.inline
  def ignore: typings.chromeApps.chromeAppsStrings.ignore = "ignore".asInstanceOf[typings.chromeApps.chromeAppsStrings.ignore]
  
  @scala.inline
  def new_background_tab: typings.chromeApps.chromeAppsStrings.new_background_tab = "new_background_tab".asInstanceOf[typings.chromeApps.chromeAppsStrings.new_background_tab]
  
  @scala.inline
  def new_foreground_tab: typings.chromeApps.chromeAppsStrings.new_foreground_tab = "new_foreground_tab".asInstanceOf[typings.chromeApps.chromeAppsStrings.new_foreground_tab]
  
  @scala.inline
  def new_popup: typings.chromeApps.chromeAppsStrings.new_popup = "new_popup".asInstanceOf[typings.chromeApps.chromeAppsStrings.new_popup]
  
  @scala.inline
  def new_window: typings.chromeApps.chromeAppsStrings.new_window = "new_window".asInstanceOf[typings.chromeApps.chromeAppsStrings.new_window]
  
  @scala.inline
  def save_to_disk: typings.chromeApps.chromeAppsStrings.save_to_disk = "save_to_disk".asInstanceOf[typings.chromeApps.chromeAppsStrings.save_to_disk]
}
