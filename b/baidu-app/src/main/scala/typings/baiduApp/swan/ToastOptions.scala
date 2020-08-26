package typings.baiduApp.swan

import typings.baiduApp.baiduAppStrings.loading
import typings.baiduApp.baiduAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 界面API列表
@js.native
trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 提示的延迟时间，单位毫秒，默认：1500
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * 图标，只支持"success"、"loading"
    */
  var icon: js.UndefOr[success | loading] = js.native
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[String] = js.native
  /**
    * 是否显示透明蒙层，防止触摸穿透，默认：false
    */
  var mask: js.UndefOr[Boolean] = js.native
  /**
    * 提示的内容
    */
  var title: String = js.native
}

object ToastOptions {
  @scala.inline
  def apply(title: String): ToastOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  @scala.inline
  implicit class ToastOptionsOps[Self <: ToastOptions] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setIcon(value: success | loading): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
  }
  
}

