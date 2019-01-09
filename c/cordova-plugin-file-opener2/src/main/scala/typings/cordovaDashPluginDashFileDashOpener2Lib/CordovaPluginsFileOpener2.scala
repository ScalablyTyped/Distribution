package typings
package cordovaDashPluginDashFileDashOpener2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPluginsFileOpener2 extends js.Object {
  /**
    * Check if an app is already installed. Android platform only.
    */
  def appIsInstalled(packageId: java.lang.String): scala.Unit = js.native
  def appIsInstalled(packageId: java.lang.String, callbackContext: Anon_Error): scala.Unit = js.native
  /**
    * Open a file with the default file opener and optional callback object:
    */
  def open(fileName: java.lang.String, contentType: java.lang.String): scala.Unit = js.native
  def open(
    fileName: java.lang.String,
    contentType: java.lang.String,
    callbackContext: CordovaPluginsFileOpener2CallbackContext
  ): scala.Unit = js.native
  /**
    * Open a system modal to open document with one of the already installed app and optional callback object
    */
  def showOpenWithDialog(fileName: java.lang.String, contentType: java.lang.String): scala.Unit = js.native
  def showOpenWithDialog(
    fileName: java.lang.String,
    contentType: java.lang.String,
    callbackContext: CordovaPluginsFileOpener2CallbackContext
  ): scala.Unit = js.native
  /**
    * Uninstall a package with its id. Android platform only.
    */
  def uninstall(packageId: java.lang.String): scala.Unit = js.native
  def uninstall(packageId: java.lang.String, callbackContext: CordovaPluginsFileOpener2CallbackContext): scala.Unit = js.native
}

