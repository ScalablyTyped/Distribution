package typings.baiduApp

import typings.baiduApp.swan.AuthSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthSetting extends js.Object {
  var authSetting: AuthSetting
}

object AnonAuthSetting {
  @scala.inline
  def apply(authSetting: AuthSetting): AnonAuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthSetting]
  }
}

