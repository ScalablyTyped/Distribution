package typings
package cordovaUnderscoreAppUnderscoreVersionUnderscorePluginLib.CordovaAppVersionPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaAppVersionPlugin extends js.Object {
  /**
    * App version from config.xml's version (e.g. <widget id="my.app.id" version="1.5.0">)
    * @example window.cordova.plugins.version.getAppVersion() // e.g: "1.5.0"
    */
  def getAppVersion(): java.lang.String
}

object CordovaAppVersionPlugin {
  @scala.inline
  def apply(getAppVersion: js.Function0[java.lang.String]): CordovaAppVersionPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAppVersion")(getAppVersion)
    __obj.asInstanceOf[CordovaAppVersionPlugin]
  }
}

