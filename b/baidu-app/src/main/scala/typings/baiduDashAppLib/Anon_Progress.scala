package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Progress extends js.Object {
  /** 上传进度百分比 */
  var progress: scala.Double
  /** 预期需要上传的数据总长度，单位 Bytes */
  var totalBytesExpectedToSend: scala.Double
  /** 已经上传的数据长度，单位 Bytes */
  var totalBytesSent: scala.Double
}

