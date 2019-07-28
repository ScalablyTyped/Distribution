package typings.cordovaDashPluginDashInappbrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /**
    * Opens a URL in a new InAppBrowser instance, the current browser instance, or the system browser.
    * @param  url     The URL to load.
    * @param  target  The target in which to load the URL, an optional parameter that defaults to _self.
    * @param  options Options for the InAppBrowser. Optional, defaulting to: location=yes.
    *                 The options string must not contain any blank space, and each feature's
    *                 name/value pairs must be separated by a comma. Feature names are case insensitive.
    */
  def open(url: String): InAppBrowser = js.native
  def open(url: String, target: String): InAppBrowser = js.native
  def open(url: String, target: String, options: String): InAppBrowser = js.native
}

