package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----加速度计
trait AccelerometerData extends js.Object {
  /** X 轴 */
  var x: Double
  /** Y 轴 */
  var y: Double
  /** Z 轴 */
  var z: Double
}

object AccelerometerData {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): AccelerometerData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccelerometerData]
  }
}

