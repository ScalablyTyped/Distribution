package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends BaseOptions[DataResponse, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /** 如果设为json，会尝试对返回的数据做一次 JSON.parse  默认值为json */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  @JSName("fail")
  var fail_RequestOptions: js.UndefOr[js.Function1[/* err */ baiduDashAppLib.Anon_ErrMsgErrCode, scala.Unit]] = js.undefined
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[
    baiduDashAppLib.baiduDashAppLibStrings.GET | baiduDashAppLib.baiduDashAppLibStrings.OPTIONS | baiduDashAppLib.baiduDashAppLibStrings.HEAD | baiduDashAppLib.baiduDashAppLibStrings.POST | baiduDashAppLib.baiduDashAppLibStrings.PUT | baiduDashAppLib.baiduDashAppLibStrings.DELETE
  ] = js.undefined
  /**
  		 * 设置响应的数据类型。合法值：text、arraybuffer  默认值为text
  		 * @version 1.7.0
  		 */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /** 开发者服务器接口地址 */
  var url: java.lang.String
}

