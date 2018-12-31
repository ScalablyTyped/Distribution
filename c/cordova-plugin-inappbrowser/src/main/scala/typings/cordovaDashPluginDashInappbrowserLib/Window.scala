package typings
package cordovaDashPluginDashInappbrowserLib

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
  def open(url: java.lang.String): InAppBrowser = js.native
  def open(url: java.lang.String, target: java.lang.String): InAppBrowser = js.native
  def open(url: java.lang.String, target: java.lang.String, options: java.lang.String): InAppBrowser = js.native
  def open(url: java.lang.String, target: java.lang.String, options: java.lang.String, replace: scala.Boolean): InAppBrowser = js.native
  @JSName("open")
  def open__blank(
    url: java.lang.String,
    target: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings._blank
  ): InAppBrowser = js.native
  @JSName("open")
  def open__blank(
    url: java.lang.String,
    target: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings._blank,
    options: java.lang.String
  ): InAppBrowser = js.native
  @JSName("open")
  def open__self(
    url: java.lang.String,
    target: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings._self
  ): InAppBrowser = js.native
  @JSName("open")
  def open__self(
    url: java.lang.String,
    target: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings._self,
    options: java.lang.String
  ): InAppBrowser = js.native
  @JSName("open")
  def open__system(
    url: java.lang.String,
    target: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings._system
  ): InAppBrowser = js.native
  @JSName("open")
  def open__system(
    url: java.lang.String,
    target: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings._system,
    options: java.lang.String
  ): InAppBrowser = js.native
}

