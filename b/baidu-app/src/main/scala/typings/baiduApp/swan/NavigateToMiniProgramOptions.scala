package typings.baiduApp.swan

import typings.baiduApp.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  var appId: String = js.native
   // 包括 encrypt_card_id, outer_str, biz三个字段，须从 step3 中获得的链接中获取参数
  var envVersion: js.UndefOr[String] = js.native
   // 打开的页面路径，如果为空则打开首页
  var extraData: js.UndefOr[js.Any] = js.native
   // 要打开的小程序 appId
  var path: js.UndefOr[String] = js.native
   // 要打开的小程序版本，有效值 develop（开发版），trial（体验版），release（正式版） ，仅在当前小程序为开发版或体验版时此参数有效；如果当前小程序是体验版或正式版，则打开的小程序必定是正式版。默认值 release
  @JSName("success")
  var success_NavigateToMiniProgramOptions: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
}

object NavigateToMiniProgramOptions {
  @scala.inline
  def apply(appId: String): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
  @scala.inline
  implicit class NavigateToMiniProgramOptionsOps[Self <: NavigateToMiniProgramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvVersion(value: String): Self = this.set("envVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvVersion: Self = this.set("envVersion", js.undefined)
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ ErrMsg => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

