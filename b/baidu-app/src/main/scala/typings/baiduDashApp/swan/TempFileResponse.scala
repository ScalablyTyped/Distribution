package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFileResponse extends js.Object {
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
  /** 文件的临时路径 */
  var tempFilePath: String
}

object TempFileResponse {
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TempFileResponse]
  }
}

