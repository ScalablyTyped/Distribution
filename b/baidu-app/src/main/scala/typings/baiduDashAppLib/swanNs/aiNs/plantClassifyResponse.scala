package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plantClassifyResponse extends js.Object {
  var log_id: scala.Double
   // 	唯一的log id，用于问题定位。
  var result: js.Array[baiduDashAppLib.Anon_NameScore]
}

object plantClassifyResponse {
  @scala.inline
  def apply(log_id: scala.Double, result: js.Array[baiduDashAppLib.Anon_NameScore]): plantClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result)
  
    __obj.asInstanceOf[plantClassifyResponse]
  }
}

