package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
		 * 片的菜品名称、卡路里信息、置信度。
		 */
trait dishClassifyOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var filter_threshold: js.UndefOr[scala.Double] = js.undefined
  var image: java.lang.String
   // 返回结果top n，默认5。
  @JSName("success")
  var success_dishClassifyOptions: js.UndefOr[js.Function1[/* res */ dishClassifyResponse, scala.Unit]] = js.undefined
   // 默认0.95，可以通过该参数调节识别效果，降低非菜识别率.
  var top_num: js.UndefOr[scala.Double] = js.undefined
}

object dishClassifyOptions {
  @scala.inline
  def apply(
    image: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    filter_threshold: scala.Int | scala.Double = null,
    success: js.Function1[/* res */ dishClassifyResponse, scala.Unit] = null,
    top_num: scala.Int | scala.Double = null
  ): dishClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (filter_threshold != null) __obj.updateDynamic("filter_threshold")(filter_threshold.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    if (top_num != null) __obj.updateDynamic("top_num")(top_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[dishClassifyOptions]
  }
}

