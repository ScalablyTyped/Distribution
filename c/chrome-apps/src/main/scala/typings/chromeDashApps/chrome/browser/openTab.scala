package typings.chromeDashApps.chrome.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browser.openTab")
@js.native
object openTab extends js.Object {
  /**
    * Opens a new tab in a browser window associated with the current application
    * and Chrome profile. If no browser window for the Chrome profile is opened,
    * a new one is opened prior to creating the new tab. Since Chrome 42 only.
    * @param options Configures how the tab should be opened.
    */
  def apply(options: Options): Unit = js.native
  /**
    * Opens a new tab in a browser window associated with the current application
    * and Chrome profile. If no browser window for the Chrome profile is opened,
    * a new one is opened prior to creating the new tab.
    * @param options Configures how the tab should be opened.
    * @param callback Called when the tab was successfully
    * created, or failed to be created. If failed, runtime.lastError will be set.
    */
  def apply(options: Options, callback: js.Function0[Unit]): Unit = js.native
}

