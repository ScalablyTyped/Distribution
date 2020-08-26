package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用于检测和识别图片中的品牌 LOGO 信息
  */
@js.native
trait logoClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var custom_lib: js.UndefOr[Boolean] = js.native
  var image: String = js.native
   // 是否只检索用户子库，true则只检索用户子库，false(默认)为检索底库+用户子库。
  @JSName("success")
  var success_logoClassifyOptions: js.UndefOr[js.Function1[/* res */ logoClassifyResponse, Unit]] = js.native
}

object logoClassifyOptions {
  @scala.inline
  def apply(image: String): logoClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[logoClassifyOptions]
  }
  @scala.inline
  implicit class logoClassifyOptionsOps[Self <: logoClassifyOptions] (val x: Self) extends AnyVal {
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_lib(value: Boolean): Self = this.set("custom_lib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_lib: Self = this.set("custom_lib", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ logoClassifyResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

