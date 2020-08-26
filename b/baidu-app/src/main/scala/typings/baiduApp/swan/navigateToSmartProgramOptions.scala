package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  打开另一个小程序。(参数)
  */
@js.native
trait navigateToSmartProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 要打开的小程序App Key
    */
  var appKey: String = js.native
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()
    * App.onShow() 中获取到这份数据。
    */
  var extraData: js.UndefOr[js.Any] = js.native
  /**
    * 打开的页面路径，如果为空则打开首页 。
    */
  var path: js.UndefOr[String] = js.native
}

object navigateToSmartProgramOptions {
  @scala.inline
  def apply(appKey: String): navigateToSmartProgramOptions = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[navigateToSmartProgramOptions]
  }
  @scala.inline
  implicit class navigateToSmartProgramOptionsOps[Self <: navigateToSmartProgramOptions] (val x: Self) extends AnyVal {
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
    def setAppKey(value: String): Self = this.set("appKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

