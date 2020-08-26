package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 自定义图像审核。
  */
@js.native
trait imageAuditOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String = js.native
   // 图像资源地址
  var imgUrl: js.UndefOr[String] = js.native
   // 网图URL地址，以网图形式请求，图片Url需要做UrlEncode，不能与image并存。
  @JSName("success")
  var success_imageAuditOptions: js.UndefOr[js.Function1[/* res */ imageAuditResponse, Unit]] = js.native
}

object imageAuditOptions {
  @scala.inline
  def apply(image: String): imageAuditOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditOptions]
  }
  @scala.inline
  implicit class imageAuditOptionsOps[Self <: imageAuditOptions] (val x: Self) extends AnyVal {
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
    def setImgUrl(value: String): Self = this.set("imgUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgUrl: Self = this.set("imgUrl", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ imageAuditResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

