package typings.baiduDashApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.ai.dishClassify")
@js.native
object dishClassify extends js.Object {
  /**
  		 * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
  		 * 片的菜品名称、卡路里信息、置信度。
  		 */
  def apply(options: dishClassifyOptions): Unit = js.native
}

