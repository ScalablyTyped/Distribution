package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ocrDrivingLicenseResponse extends js.Object {
  var log_id: java.lang.String
   // 识别结果数，表示 words_result 的元素个数。
  var words_result: org.scalablytyped.runtime.StringDictionary[baiduDashAppLib.Anon_Words]
   // 唯一的log id，用于问题定位。
  var words_result_num: scala.Double
}

object ocrDrivingLicenseResponse {
  @scala.inline
  def apply(
    log_id: java.lang.String,
    words_result: org.scalablytyped.runtime.StringDictionary[baiduDashAppLib.Anon_Words],
    words_result_num: scala.Double
  ): ocrDrivingLicenseResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, words_result = words_result, words_result_num = words_result_num)
  
    __obj.asInstanceOf[ocrDrivingLicenseResponse]
  }
}

