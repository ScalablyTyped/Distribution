package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 文件
trait SavedFileData extends js.Object {
  /** 文件的保存路径 */
  var savedFilePath: String
}

object SavedFileData {
  @scala.inline
  def apply(savedFilePath: String): SavedFileData = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFileData]
  }
}

