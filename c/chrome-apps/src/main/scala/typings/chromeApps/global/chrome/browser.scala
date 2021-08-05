package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.browser.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object browser {
  
  @JSGlobal("chrome.browser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Opens a new tab in a browser window associated with the current application
    * and Chrome profile. If no browser window for the Chrome profile is opened,
    * a new one is opened prior to creating the new tab. Since Chrome 42 only.
    * @param options Configures how the tab should be opened.
    */
  inline def openTab(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openTab")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Opens a new tab in a browser window associated with the current application
    * and Chrome profile. If no browser window for the Chrome profile is opened,
    * a new one is opened prior to creating the new tab.
    * @param options Configures how the tab should be opened.
    * @param callback Called when the tab was successfully
    * created, or failed to be created. If failed, runtime.lastError will be set.
    */
  inline def openTab(options: Options, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openTab")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
