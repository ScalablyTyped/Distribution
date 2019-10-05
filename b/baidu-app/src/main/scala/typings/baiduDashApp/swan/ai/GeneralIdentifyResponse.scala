package typings.baiduDashApp.swan.ai

import typings.baiduDashApp.Anon_Keyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralIdentifyResponse extends js.Object {
  var log_id: Double
   // 返回结果数目，及result数组中的元素个数。
  var result: js.Array[Anon_Keyword]
   // 	唯一的log id，用于问题定位。
  var result_num: Double
}

object GeneralIdentifyResponse {
  @scala.inline
  def apply(log_id: Double, result: js.Array[Anon_Keyword], result_num: Double): GeneralIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result, result_num = result_num)
  
    __obj.asInstanceOf[GeneralIdentifyResponse]
  }
}

