package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dishClassifyResponse extends js.Object {
  var log_id: scala.Double
   // 返回结果数目，及result数组中的元素个数。
  var result: js.Array[baiduDashAppLib.Anon_Calorie]
   // 	唯一的log id，用于问题定位。
  var result_num: scala.Double
}

object dishClassifyResponse {
  @scala.inline
  def apply(log_id: scala.Double, result: js.Array[baiduDashAppLib.Anon_Calorie], result_num: scala.Double): dishClassifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log_id")(log_id)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("result_num")(result_num)
    __obj.asInstanceOf[dishClassifyResponse]
  }
}

