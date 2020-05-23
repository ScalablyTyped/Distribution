package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSetting extends js.Object {
  var authSetting: typings.baiduApp.swan.AuthSetting
}

object AuthSetting {
  @scala.inline
  def apply(authSetting: typings.baiduApp.swan.AuthSetting): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
}

