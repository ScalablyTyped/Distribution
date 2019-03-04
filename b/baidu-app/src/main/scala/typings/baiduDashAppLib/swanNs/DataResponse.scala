package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 基本参数
trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: java.lang.String | stdLib.ArrayBuffer
  var header: js.Any
  var result: java.lang.String
  var statusCode: scala.Double
}

object DataResponse {
  @scala.inline
  def apply(
    data: java.lang.String | stdLib.ArrayBuffer,
    header: js.Any,
    result: java.lang.String,
    statusCode: scala.Double
  ): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header, result = result, statusCode = statusCode)
  
    __obj.asInstanceOf[DataResponse]
  }
}

