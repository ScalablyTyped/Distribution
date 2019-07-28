package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  var appId: String
   // 包括 encrypt_card_id, outer_str, biz三个字段，须从 step3 中获得的链接中获取参数
  var envVersion: js.UndefOr[String] = js.undefined
   // 打开的页面路径，如果为空则打开首页
  var extraData: js.UndefOr[js.Any] = js.undefined
   // 要打开的小程序 appId
  var path: js.UndefOr[String] = js.undefined
   // 要打开的小程序版本，有效值 develop（开发版），trial（体验版），release（正式版） ，仅在当前小程序为开发版或体验版时此参数有效；如果当前小程序是体验版或正式版，则打开的小程序必定是正式版。默认值 release
  @JSName("success")
  var success_NavigateToMiniProgramOptions: js.UndefOr[js.Function1[/* res */ Anon_ErrMsg, Unit]] = js.undefined
}

object NavigateToMiniProgramOptions {
  @scala.inline
  def apply(
    appId: String,
    complete: /* res */ js.Any => Unit = null,
    envVersion: String = null,
    extraData: js.Any = null,
    fail: js.Any => Unit = null,
    path: String = null,
    success: /* res */ Anon_ErrMsg => Unit = null
  ): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion)
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
}

