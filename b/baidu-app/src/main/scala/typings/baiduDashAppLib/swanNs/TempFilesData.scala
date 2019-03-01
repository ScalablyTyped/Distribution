package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFilesData extends js.Object {
  /** 文件的临时路径 */
  var tempFilePaths: java.lang.String
  /**
  		 * 图片的本地文件列表，每一项是一个 File 对象
  		 * @version 1.2.0
  		 */
  var tempFiles: js.Array[TempFile]
}

object TempFilesData {
  @scala.inline
  def apply(tempFilePaths: java.lang.String, tempFiles: js.Array[TempFile]): TempFilesData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tempFilePaths")(tempFilePaths)
    __obj.updateDynamic("tempFiles")(tempFiles)
    __obj.asInstanceOf[TempFilesData]
  }
}

