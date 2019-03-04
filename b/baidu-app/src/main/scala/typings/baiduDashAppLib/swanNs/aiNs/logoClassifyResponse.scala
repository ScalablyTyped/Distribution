package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait logoClassifyResponse extends js.Object {
  var log_id: scala.Double
   // 识别结果数，标识返回结果数目。
  var result: js.Array[baiduDashAppLib.Anon_LocationName]
   // 	唯一的log id，用于问题定位。
  var result_num: scala.Double
}

object logoClassifyResponse {
  @scala.inline
  def apply(
    log_id: scala.Double,
    result: js.Array[baiduDashAppLib.Anon_LocationName],
    result_num: scala.Double
  ): logoClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result, result_num = result_num)
  
    __obj.asInstanceOf[logoClassifyResponse]
  }
}

