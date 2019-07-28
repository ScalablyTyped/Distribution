package typings.baiduDashApp.swanNs.aiNs

import org.scalablytyped.runtime.StringDictionary
import typings.baiduDashApp.Anon_Words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ocrVehicleLicenseResponse extends js.Object {
  var log_id: String
   // 识别结果数，表示 words_result 的元素个数。
  var words_result: StringDictionary[Anon_Words]
   // 唯一的log id，用于问题定位。
  var words_result_num: Double
}

object ocrVehicleLicenseResponse {
  @scala.inline
  def apply(log_id: String, words_result: StringDictionary[Anon_Words], words_result_num: Double): ocrVehicleLicenseResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, words_result = words_result, words_result_num = words_result_num)
  
    __obj.asInstanceOf[ocrVehicleLicenseResponse]
  }
}

