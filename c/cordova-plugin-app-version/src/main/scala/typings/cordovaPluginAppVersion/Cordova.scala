package typings.cordovaPluginAppVersion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cordova extends js.Object {
  var getAppVersion: AnonGetAppName
}

object Cordova {
  @scala.inline
  def apply(getAppVersion: AnonGetAppName): Cordova = {
    val __obj = js.Dynamic.literal(getAppVersion = getAppVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
}

