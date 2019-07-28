package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFile extends js.Object {
  /** 本地文件路径 */
  var path: String
  /** 本地文件大小，单位：B */
  var size: Double
}

object TempFile {
  @scala.inline
  def apply(path: String, size: Double): TempFile = {
    val __obj = js.Dynamic.literal(path = path, size = size)
  
    __obj.asInstanceOf[TempFile]
  }
}

