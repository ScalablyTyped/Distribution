package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: java.lang.String
   // 视频文件路径，可以是临时文件路径也可以是永久文件路径
  @JSName("success")
  def success_MSaveVideoOptions(errMsg: java.lang.String): scala.Unit
}

