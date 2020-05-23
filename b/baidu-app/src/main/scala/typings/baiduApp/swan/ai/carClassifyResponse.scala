package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Height
import typings.baiduApp.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait carClassifyResponse extends js.Object {
  var location_result: Height
  var log_id: Double
   //     唯一的log id，用于问题定位。
  var result: js.Array[Name]
}

object carClassifyResponse {
  @scala.inline
  def apply(location_result: Height, log_id: Double, result: js.Array[Name]): carClassifyResponse = {
    val __obj = js.Dynamic.literal(location_result = location_result.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[carClassifyResponse]
  }
}

