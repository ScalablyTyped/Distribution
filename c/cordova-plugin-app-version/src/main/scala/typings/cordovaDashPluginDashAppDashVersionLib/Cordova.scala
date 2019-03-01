package typings
package cordovaDashPluginDashAppDashVersionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cordova extends js.Object {
  var getAppVersion: Anon_GetAppName
}

object Cordova {
  @scala.inline
  def apply(getAppVersion: Anon_GetAppName): Cordova = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAppVersion")(getAppVersion)
    __obj.asInstanceOf[Cordova]
  }
}

