package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----加速度计
trait AccelerometerData extends js.Object {
  /** X 轴 */
  var x: scala.Double
  /** Y 轴 */
  var y: scala.Double
  /** Z 轴 */
  var z: scala.Double
}

object AccelerometerData {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): AccelerometerData = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[AccelerometerData]
  }
}

