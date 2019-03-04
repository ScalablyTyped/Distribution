package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectIdentifyResponse extends js.Object {
  var log_id: scala.Double
   // 	唯一的log id，用于问题定位。
  var result: baiduDashAppLib.Anon_Height
}

object DetectIdentifyResponse {
  @scala.inline
  def apply(log_id: scala.Double, result: baiduDashAppLib.Anon_Height): DetectIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result)
  
    __obj.asInstanceOf[DetectIdentifyResponse]
  }
}

