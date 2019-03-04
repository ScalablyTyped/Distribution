package typings
package cordovaUnderscoreAppUnderscoreVersionUnderscorePluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova_app_version_plugin interface
    */
  var version: cordovaUnderscoreAppUnderscoreVersionUnderscorePluginLib.CordovaAppVersionPluginNs.CordovaAppVersionPlugin
}

object CordovaPlugins {
  @scala.inline
  def apply(
    version: cordovaUnderscoreAppUnderscoreVersionUnderscorePluginLib.CordovaAppVersionPluginNs.CordovaAppVersionPlugin
  ): CordovaPlugins = {
    val __obj = js.Dynamic.literal(version = version)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

