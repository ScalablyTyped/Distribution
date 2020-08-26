package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用于检测和识别图片中的植物信息
  */
@js.native
trait plantClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String = js.native
   // 图像资源地址
  @JSName("success")
  var success_plantClassifyOptions: js.UndefOr[js.Function1[/* res */ plantClassifyResponse, Unit]] = js.native
}

object plantClassifyOptions {
  @scala.inline
  def apply(image: String): plantClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[plantClassifyOptions]
  }
  @scala.inline
  implicit class plantClassifyOptionsOps[Self <: plantClassifyOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: /* res */ plantClassifyResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

