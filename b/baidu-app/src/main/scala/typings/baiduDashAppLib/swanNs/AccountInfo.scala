package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region App里的onLaunch、onShow回调参数
// #region Account
trait AccountInfo extends js.Object {
  /* 小程序账号信息 */
  var miniProgram: baiduDashAppLib.Anon_AppId
  /* 插件账号信息（仅在插件中调用时包含这一项）	 */
  var plugin: js.UndefOr[baiduDashAppLib.Anon_AppIdVersion] = js.undefined
}

object AccountInfo {
  @scala.inline
  def apply(miniProgram: baiduDashAppLib.Anon_AppId, plugin: baiduDashAppLib.Anon_AppIdVersion = null): AccountInfo = {
    val __obj = js.Dynamic.literal(miniProgram = miniProgram)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[AccountInfo]
  }
}

