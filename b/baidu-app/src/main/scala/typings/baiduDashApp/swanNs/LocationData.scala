package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 位置API列表
// 位置-----获取位置
trait LocationData extends js.Object {
  /** 位置的精确度 */
  var accuracy: Double
  /** 纬度，浮点数，范围为-90~90，负数表示南纬 */
  var latitude: Double
  /** 经度，浮点数，范围为-180~180，负数表示西经 */
  var longitude: Double
  /** 速度，浮点数，单位m/s */
  var speed: Double
}

object LocationData {
  @scala.inline
  def apply(accuracy: Double, latitude: Double, longitude: Double, speed: Double): LocationData = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, latitude = latitude, longitude = longitude, speed = speed)
  
    __obj.asInstanceOf[LocationData]
  }
}

