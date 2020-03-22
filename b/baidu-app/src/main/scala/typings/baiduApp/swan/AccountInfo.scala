package typings.baiduApp.swan

import typings.baiduApp.AnonAppId
import typings.baiduApp.AnonVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region App里的onLaunch、onShow回调参数
// #region Account
trait AccountInfo extends js.Object {
  /* 小程序账号信息 */
  var miniProgram: AnonAppId
  /* 插件账号信息（仅在插件中调用时包含这一项）	 */
  var plugin: js.UndefOr[AnonVersion] = js.undefined
}

object AccountInfo {
  @scala.inline
  def apply(miniProgram: AnonAppId, plugin: AnonVersion = null): AccountInfo = {
    val __obj = js.Dynamic.literal(miniProgram = miniProgram.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
}

