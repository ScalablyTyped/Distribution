package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProgressTotalBytesExpectedToWrite extends js.Object {
  /** 下载进度百分比 */
  var progress: scala.Double
  /** 预期需要下载的数据总长度，单位 Bytes */
  var totalBytesExpectedToWrite: scala.Double
  /** 已经下载的数据长度，单位 Bytes */
  var totalBytesWritten: scala.Double
}

object Anon_ProgressTotalBytesExpectedToWrite {
  @scala.inline
  def apply(progress: scala.Double, totalBytesExpectedToWrite: scala.Double, totalBytesWritten: scala.Double): Anon_ProgressTotalBytesExpectedToWrite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("totalBytesExpectedToWrite")(totalBytesExpectedToWrite)
    __obj.updateDynamic("totalBytesWritten")(totalBytesWritten)
    __obj.asInstanceOf[Anon_ProgressTotalBytesExpectedToWrite]
  }
}

