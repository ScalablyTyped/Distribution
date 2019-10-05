package typings.baiduDashApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.ai.carClassify")
@js.native
object carClassify extends js.Object {
  /**
  		 * 用于检测一张车辆图片的具体车型，即对于输入的一张图片（可正常解码，且长
  		 * 宽比适宜），输出图片的车辆品牌及型号、颜色及年份、位置信息。
  		 */
  def apply(options: carClassifyOptions): Unit = js.native
}

