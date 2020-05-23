package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileListData extends js.Object {
  /**
    * 文件列表
    */
  var fileList: js.Array[File]
}

object GetSavedFileListData {
  @scala.inline
  def apply(fileList: js.Array[File]): GetSavedFileListData = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileListData]
  }
}

