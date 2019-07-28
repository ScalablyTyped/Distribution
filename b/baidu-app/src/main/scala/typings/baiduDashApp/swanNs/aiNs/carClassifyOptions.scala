package typings.baiduDashApp.swanNs.aiNs

import typings.baiduDashApp.swanNs.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测一张车辆图片的具体车型，即对于输入的一张图片（可正常解码，且长
		 * 宽比适宜），输出图片的车辆品牌及型号、颜色及年份、位置信息。
		 */
trait carClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var color_result: js.UndefOr[String] = js.undefined
  var image: String
   // 返回结果top n，默认5。
  @JSName("success")
  var success_carClassifyOptions: js.UndefOr[js.Function1[/* res */ carClassifyResponse, Unit]] = js.undefined
   // 颜色
  var top_num: js.UndefOr[Double] = js.undefined
}

object carClassifyOptions {
  @scala.inline
  def apply(
    image: String,
    color_result: String = null,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ carClassifyResponse => Unit = null,
    top_num: Int | Double = null
  ): carClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (color_result != null) __obj.updateDynamic("color_result")(color_result)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (top_num != null) __obj.updateDynamic("top_num")(top_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[carClassifyOptions]
  }
}

