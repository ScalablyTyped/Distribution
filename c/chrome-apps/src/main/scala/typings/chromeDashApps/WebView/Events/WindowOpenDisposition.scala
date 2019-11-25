package typings.chromeDashApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The requested disposition of the new window. */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.ignore
  - typings.chromeDashApps.chromeDashAppsStrings.save_to_disk
  - typings.chromeDashApps.chromeDashAppsStrings.current_tab
  - typings.chromeDashApps.chromeDashAppsStrings.new_background_tab
  - typings.chromeDashApps.chromeDashAppsStrings.new_foreground_tab
  - typings.chromeDashApps.chromeDashAppsStrings.new_window
  - typings.chromeDashApps.chromeDashAppsStrings.new_popup
*/
trait WindowOpenDisposition extends js.Object

object WindowOpenDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current_tab: typings.chromeDashApps.chromeDashAppsStrings.current_tab = this.cast("current_tab")
  @scala.inline
  def ignore: typings.chromeDashApps.chromeDashAppsStrings.ignore = this.cast("ignore")
  @scala.inline
  def new_background_tab: typings.chromeDashApps.chromeDashAppsStrings.new_background_tab = this.cast("new_background_tab")
  @scala.inline
  def new_foreground_tab: typings.chromeDashApps.chromeDashAppsStrings.new_foreground_tab = this.cast("new_foreground_tab")
  @scala.inline
  def new_popup: typings.chromeDashApps.chromeDashAppsStrings.new_popup = this.cast("new_popup")
  @scala.inline
  def new_window: typings.chromeDashApps.chromeDashAppsStrings.new_window = this.cast("new_window")
  @scala.inline
  def save_to_disk: typings.chromeDashApps.chromeDashAppsStrings.save_to_disk = this.cast("save_to_disk")
}

