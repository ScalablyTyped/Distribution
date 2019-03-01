package typings
package baiduDashAppLib.swanNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileList")(fileList)
    __obj.asInstanceOf[GetSavedFileListData]
  }
}

