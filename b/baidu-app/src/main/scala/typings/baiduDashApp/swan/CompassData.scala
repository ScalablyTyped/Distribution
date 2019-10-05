package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----罗盘
trait CompassData extends js.Object {
  /** 面对的方向度数 */
  var direction: Double
}

object CompassData {
  @scala.inline
  def apply(direction: Double): CompassData = {
    val __obj = js.Dynamic.literal(direction = direction)
  
    __obj.asInstanceOf[CompassData]
  }
}

