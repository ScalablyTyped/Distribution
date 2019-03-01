package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 文件
trait SavedFileData extends js.Object {
  /** 文件的保存路径 */
  var savedFilePath: java.lang.String
}

object SavedFileData {
  @scala.inline
  def apply(savedFilePath: java.lang.String): SavedFileData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("savedFilePath")(savedFilePath)
    __obj.asInstanceOf[SavedFileData]
  }
}

