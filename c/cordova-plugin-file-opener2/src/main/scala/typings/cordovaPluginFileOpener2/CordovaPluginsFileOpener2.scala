package typings.cordovaPluginFileOpener2

import typings.cordovaPluginFileOpener2.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPluginsFileOpener2 extends js.Object {
  
  /**
    * Check if an app is already installed. Android platform only.
    */
  def appIsInstalled(packageId: String): Unit = js.native
  def appIsInstalled(packageId: String, callbackContext: Error): Unit = js.native
  
  /**
    * Open a file with the default file opener and optional callback object:
    */
  def open(fileName: String, contentType: String): Unit = js.native
  def open(fileName: String, contentType: String, callbackContext: CordovaPluginsFileOpener2CallbackContext): Unit = js.native
  
  /**
    * Open a system modal to open document with one of the already installed app and optional callback object
    */
  def showOpenWithDialog(fileName: String, contentType: String): Unit = js.native
  def showOpenWithDialog(fileName: String, contentType: String, callbackContext: CordovaPluginsFileOpener2CallbackContext): Unit = js.native
  
  /**
    * Uninstall a package with its id. Android platform only.
    */
  def uninstall(packageId: String): Unit = js.native
  def uninstall(packageId: String, callbackContext: CordovaPluginsFileOpener2CallbackContext): Unit = js.native
}
