package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.browser.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.browser
/////////////
// Browser //
/////////////
/**
  * @since Chrome 42.
  * @requires Permissions: 'browser'
  * @description
  * Use the chrome.browser API to interact with the Chrome browser associated with
  * the current application and Chrome profile.
  */
@JSGlobal("chrome.browser")
@js.native
object browser extends js.Object {
  
  /**
    * Opens a new tab in a browser window associated with the current application
    * and Chrome profile. If no browser window for the Chrome profile is opened,
    * a new one is opened prior to creating the new tab. Since Chrome 42 only.
    * @param options Configures how the tab should be opened.
    */
  def openTab(options: Options): Unit = js.native
  /**
    * Opens a new tab in a browser window associated with the current application
    * and Chrome profile. If no browser window for the Chrome profile is opened,
    * a new one is opened prior to creating the new tab.
    * @param options Configures how the tab should be opened.
    * @param callback Called when the tab was successfully
    * created, or failed to be created. If failed, runtime.lastError will be set.
    */
  def openTab(options: Options, callback: js.Function0[Unit]): Unit = js.native
}
