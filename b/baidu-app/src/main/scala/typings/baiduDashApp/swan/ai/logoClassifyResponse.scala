package typings.baiduDashApp.swan.ai

import typings.baiduDashApp.Anon_LocationName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait logoClassifyResponse extends js.Object {
  var log_id: Double
   // 识别结果数，标识返回结果数目。
  var result: js.Array[Anon_LocationName]
   // 	唯一的log id，用于问题定位。
  var result_num: Double
}

object logoClassifyResponse {
  @scala.inline
  def apply(log_id: Double, result: js.Array[Anon_LocationName], result_num: Double): logoClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result, result_num = result_num)
  
    __obj.asInstanceOf[logoClassifyResponse]
  }
}

