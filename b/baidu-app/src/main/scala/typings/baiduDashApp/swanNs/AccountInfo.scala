package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_AppId
import typings.baiduDashApp.Anon_AppIdVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region App里的onLaunch、onShow回调参数
// #region Account
trait AccountInfo extends js.Object {
  /* 小程序账号信息 */
  var miniProgram: Anon_AppId
  /* 插件账号信息（仅在插件中调用时包含这一项）	 */
  var plugin: js.UndefOr[Anon_AppIdVersion] = js.undefined
}

object AccountInfo {
  @scala.inline
  def apply(miniProgram: Anon_AppId, plugin: Anon_AppIdVersion = null): AccountInfo = {
    val __obj = js.Dynamic.literal(miniProgram = miniProgram)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[AccountInfo]
  }
}

