package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ocrVehicleLicenseResponse extends js.Object {
  var log_id: java.lang.String
   // 识别结果数，表示 words_result 的元素个数。
  var words_result: ScalablyTyped.runtime.StringDictionary[baiduDashAppLib.Anon_Words]
   // 唯一的log id，用于问题定位。
  var words_result_num: scala.Double
}

