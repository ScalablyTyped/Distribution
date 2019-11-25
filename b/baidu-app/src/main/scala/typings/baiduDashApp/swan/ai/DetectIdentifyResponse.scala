package typings.baiduDashApp.swan.ai

import typings.baiduDashApp.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectIdentifyResponse extends js.Object {
  var log_id: Double
   // 	唯一的log id，用于问题定位。
  var result: Anon_Height
}

object DetectIdentifyResponse {
  @scala.inline
  def apply(log_id: Double, result: Anon_Height): DetectIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetectIdentifyResponse]
  }
}

