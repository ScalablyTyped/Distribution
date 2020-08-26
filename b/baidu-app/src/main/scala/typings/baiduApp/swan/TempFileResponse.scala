package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempFileResponse extends js.Object {
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
  /** 文件的临时路径 */
  var tempFilePath: String = js.native
}

object TempFileResponse {
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileResponse]
  }
  @scala.inline
  implicit class TempFileResponseOps[Self <: TempFileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
  }
  
}

