package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseLocationData extends js.Object {
  /**
  		 * 详细地址
  		 */
  var address: java.lang.String
  /**
  		 * 纬度，浮点数，范围为-90~90，负数表示南纬
  		 */
  var latitude: scala.Double
  /**
  		 * 经度，浮点数，范围为-180~180，负数表示西经
  		 */
  var longitude: scala.Double
  /**
  		 * 位置名称
  		 */
  var name: java.lang.String
}

object ChooseLocationData {
  @scala.inline
  def apply(address: java.lang.String, latitude: scala.Double, longitude: scala.Double, name: java.lang.String): ChooseLocationData = {
    val __obj = js.Dynamic.literal(address = address, latitude = latitude, longitude = longitude, name = name)
  
    __obj.asInstanceOf[ChooseLocationData]
  }
}

