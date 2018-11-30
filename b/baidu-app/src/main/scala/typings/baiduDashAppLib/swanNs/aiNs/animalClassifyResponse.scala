package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait animalClassifyResponse extends js.Object {
  var log_id: scala.Double
   // 识别结果数，标识返回结果数目。
  var result: js.Array[baiduDashAppLib.Anon_NameScore]
   // 	唯一的log id，用于问题定位。
  var result_num: scala.Double
}

