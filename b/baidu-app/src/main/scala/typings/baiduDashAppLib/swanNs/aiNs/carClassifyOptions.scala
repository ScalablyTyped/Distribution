package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测一张车辆图片的具体车型，即对于输入的一张图片（可正常解码，且长
		 * 宽比适宜），输出图片的车辆品牌及型号、颜色及年份、位置信息。
		 */
trait carClassifyOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var color_result: js.UndefOr[java.lang.String] = js.undefined
  var image: java.lang.String
   // 返回结果top n，默认5。
  @JSName("success")
  var success_carClassifyOptions: js.UndefOr[js.Function1[/* res */ carClassifyResponse, scala.Unit]] = js.undefined
   // 颜色
  var top_num: js.UndefOr[scala.Double] = js.undefined
}

