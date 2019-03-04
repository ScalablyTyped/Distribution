package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralIdentifyResponse extends js.Object {
  var log_id: scala.Double
   // 返回结果数目，及result数组中的元素个数。
  var result: js.Array[baiduDashAppLib.Anon_Keyword]
   // 	唯一的log id，用于问题定位。
  var result_num: scala.Double
}

object GeneralIdentifyResponse {
  @scala.inline
  def apply(log_id: scala.Double, result: js.Array[baiduDashAppLib.Anon_Keyword], result_num: scala.Double): GeneralIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result, result_num = result_num)
  
    __obj.asInstanceOf[GeneralIdentifyResponse]
  }
}

