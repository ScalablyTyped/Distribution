package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait carClassifyResponse extends js.Object {
  var location_result: baiduDashAppLib.Anon_Height
  var log_id: scala.Double
   // 	唯一的log id，用于问题定位。
  var result: js.Array[baiduDashAppLib.Anon_Name]
}

object carClassifyResponse {
  @scala.inline
  def apply(
    location_result: baiduDashAppLib.Anon_Height,
    log_id: scala.Double,
    result: js.Array[baiduDashAppLib.Anon_Name]
  ): carClassifyResponse = {
    val __obj = js.Dynamic.literal(location_result = location_result, log_id = log_id, result = result)
  
    __obj.asInstanceOf[carClassifyResponse]
  }
}

