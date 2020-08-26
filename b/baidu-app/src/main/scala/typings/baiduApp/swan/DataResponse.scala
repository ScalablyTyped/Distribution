package typings.baiduApp.swan

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 基本参数
@js.native
trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: String | ArrayBuffer = js.native
  var header: js.Any = js.native
  var result: String = js.native
  var statusCode: Double = js.native
}

object DataResponse {
  @scala.inline
  def apply(data: String | ArrayBuffer, header: js.Any, result: String, statusCode: Double): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResponse]
  }
  @scala.inline
  implicit class DataResponseOps[Self <: DataResponse] (val x: Self) extends AnyVal {
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
    def setData(value: String | ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

