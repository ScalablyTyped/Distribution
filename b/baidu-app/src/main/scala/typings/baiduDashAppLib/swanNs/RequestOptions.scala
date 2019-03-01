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
  var fail_RequestOptions: js.UndefOr[js.Function1[/* err */ baiduDashAppLib.Anon_ErrCode, scala.Unit]] = js.undefined
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

object RequestOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    data: java.lang.String | js.Object = null,
    dataType: java.lang.String = null,
    fail: js.Function1[/* err */ baiduDashAppLib.Anon_ErrCode, scala.Unit] = null,
    header: RequestHeader = null,
    method: baiduDashAppLib.baiduDashAppLibStrings.GET | baiduDashAppLib.baiduDashAppLibStrings.OPTIONS | baiduDashAppLib.baiduDashAppLibStrings.HEAD | baiduDashAppLib.baiduDashAppLibStrings.POST | baiduDashAppLib.baiduDashAppLibStrings.PUT | baiduDashAppLib.baiduDashAppLibStrings.DELETE = null,
    responseType: java.lang.String = null,
    success: js.Function1[/* res */ DataResponse, scala.Unit] = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[RequestOptions]
  }
}

