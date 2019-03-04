package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textReviewResponse extends js.Object {
  var log_id: java.lang.String
   // 唯一的log id，用于问题定位。
  var result: baiduDashAppLib.Anon_Pass
}

object textReviewResponse {
  @scala.inline
  def apply(log_id: java.lang.String, result: baiduDashAppLib.Anon_Pass): textReviewResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result)
  
    __obj.asInstanceOf[textReviewResponse]
  }
}

