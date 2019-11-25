package typings.cordovaDashPluginDashAppDashVersion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cordova extends js.Object {
  var getAppVersion: Anon_GetAppName
}

object Cordova {
  @scala.inline
  def apply(getAppVersion: Anon_GetAppName): Cordova = {
    val __obj = js.Dynamic.literal(getAppVersion = getAppVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cordova]
  }
}

