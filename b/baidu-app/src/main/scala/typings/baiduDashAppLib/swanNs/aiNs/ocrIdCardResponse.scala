package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ocrIdCardResponse extends js.Object {
  var direction: scala.Double
   // 输入参数 detect_risk = true 时，则返回该字段识别身份证类型: normal-正常身份证；copy-复印件；temporary-临时身份证；screen-翻拍；unknown-其他未知情况。
  var edit_tool: java.lang.String
   // 图像方向，当 detect_direction=true 时存在。-1: 未定义，0: 正向，1: 逆时针90度，2: 逆时针180度，3: 逆时针270度。
  var image_status: java.lang.String
   // 如果参数 detect_risk = true 时，则返回此字段。如果检测身份证被编辑过，该字段指定编辑软件名称，如:Adobe Photoshop CC 2014 (Macintosh),如果没有被编辑过则返回值无此参数。
  var log_id: java.lang.String
   // normal-识别正常；reversed_side-身份证正反面颠倒；non_idcard-上传的图片中不包含身份证；blurred-身份证模糊；other_type_card-其他类型证照；over_exposure-身份证关键字段反光或过曝；unknown-未知状态。
  var risk_type: java.lang.String
   // 识别结果数，表示words_result的元素个数。
  var words_result: // 定位和识别结果
  org.scalablytyped.runtime.StringDictionary[baiduDashAppLib.Anon_LocationWords]
   // 唯一的log id，用于问题定位。
  var words_result_num: scala.Double
}

