package typings.baiduDashApp.swanNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 基本参数
trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: String | ArrayBuffer
  var header: js.Any
  var result: String
  var statusCode: Double
}

object DataResponse {
  @scala.inline
  def apply(data: String | ArrayBuffer, header: js.Any, result: String, statusCode: Double): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header, result = result, statusCode = statusCode)
  
    __obj.asInstanceOf[DataResponse]
  }
}

