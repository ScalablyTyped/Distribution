package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthSetting extends js.Object {
  var authSetting: baiduDashAppLib.swanNs.AuthSetting
}

object Anon_AuthSetting {
  @scala.inline
  def apply(authSetting: baiduDashAppLib.swanNs.AuthSetting): Anon_AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authSetting")(authSetting)
    __obj.asInstanceOf[Anon_AuthSetting]
  }
}

