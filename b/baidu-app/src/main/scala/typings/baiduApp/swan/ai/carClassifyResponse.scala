package typings.baiduApp.swan.ai

import typings.baiduApp.AnonHeight
import typings.baiduApp.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait carClassifyResponse extends js.Object {
  var location_result: AnonHeight
  var log_id: Double
   // 	唯一的log id，用于问题定位。
  var result: js.Array[AnonName]
}

object carClassifyResponse {
  @scala.inline
  def apply(location_result: AnonHeight, log_id: Double, result: js.Array[AnonName]): carClassifyResponse = {
    val __obj = js.Dynamic.literal(location_result = location_result.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[carClassifyResponse]
  }
}

