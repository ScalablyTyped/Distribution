package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFileInfoData extends js.Object {
  var createTime: Double
  // filePath: string;
  var size: Double
}

object SavedFileInfoData {
  @scala.inline
  def apply(createTime: Double, size: Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime, size = size)
  
    __obj.asInstanceOf[SavedFileInfoData]
  }
}

