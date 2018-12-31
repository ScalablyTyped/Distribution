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

