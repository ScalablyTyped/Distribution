package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
  * 片的菜品名称、卡路里信息、置信度。
  */
@js.native
trait dishClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var filter_threshold: js.UndefOr[Double] = js.native
  var image: String = js.native
   // 返回结果top n，默认5。
  @JSName("success")
  var success_dishClassifyOptions: js.UndefOr[js.Function1[/* res */ dishClassifyResponse, Unit]] = js.native
   // 默认0.95，可以通过该参数调节识别效果，降低非菜识别率.
  var top_num: js.UndefOr[Double] = js.native
}

object dishClassifyOptions {
  @scala.inline
  def apply(image: String): dishClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[dishClassifyOptions]
  }
  @scala.inline
  implicit class dishClassifyOptionsOps[Self <: dishClassifyOptions] (val x: Self) extends AnyVal {
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
    def setFilter_threshold(value: Double): Self = this.set("filter_threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_threshold: Self = this.set("filter_threshold", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ dishClassifyResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTop_num(value: Double): Self = this.set("top_num", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop_num: Self = this.set("top_num", js.undefined)
  }
  
}

