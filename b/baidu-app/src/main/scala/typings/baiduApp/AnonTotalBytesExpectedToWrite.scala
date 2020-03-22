package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotalBytesExpectedToWrite extends js.Object {
  /** 下载进度百分比 */
  var progress: Double
  /** 预期需要下载的数据总长度，单位 Bytes */
  var totalBytesExpectedToWrite: Double
  /** 已经下载的数据长度，单位 Bytes */
  var totalBytesWritten: Double
}

object AnonTotalBytesExpectedToWrite {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToWrite: Double, totalBytesWritten: Double): AnonTotalBytesExpectedToWrite = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTotalBytesExpectedToWrite]
  }
}

