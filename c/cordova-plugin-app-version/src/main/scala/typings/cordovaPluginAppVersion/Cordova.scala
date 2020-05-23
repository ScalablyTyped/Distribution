package typings.cordovaPluginAppVersion

import typings.cordovaPluginAppVersion.anon.GetAppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cordova extends js.Object {
  var getAppVersion: GetAppName
}

object Cordova {
  @scala.inline
  def apply(getAppVersion: GetAppName): Cordova = {
    val __obj = js.Dynamic.literal(getAppVersion = getAppVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
}

