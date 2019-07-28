package typings.baiduDashApp.swanNs.aiNs

import typings.baiduDashApp.swanNs.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
		 * 片的菜品名称、卡路里信息、置信度。
		 */
trait dishClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var filter_threshold: js.UndefOr[Double] = js.undefined
  var image: String
   // 返回结果top n，默认5。
  @JSName("success")
  var success_dishClassifyOptions: js.UndefOr[js.Function1[/* res */ dishClassifyResponse, Unit]] = js.undefined
   // 默认0.95，可以通过该参数调节识别效果，降低非菜识别率.
  var top_num: js.UndefOr[Double] = js.undefined
}

object dishClassifyOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    filter_threshold: Int | Double = null,
    success: /* res */ dishClassifyResponse => Unit = null,
    top_num: Int | Double = null
  ): dishClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (filter_threshold != null) __obj.updateDynamic("filter_threshold")(filter_threshold.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (top_num != null) __obj.updateDynamic("top_num")(top_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[dishClassifyOptions]
  }
}

