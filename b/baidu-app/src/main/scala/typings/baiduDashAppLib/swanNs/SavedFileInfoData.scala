package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFileInfoData extends js.Object {
  var createTime: scala.Double
  // filePath: string;
  var size: scala.Double
}

object SavedFileInfoData {
  @scala.inline
  def apply(createTime: scala.Double, size: scala.Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime, size = size)
  
    __obj.asInstanceOf[SavedFileInfoData]
  }
}

