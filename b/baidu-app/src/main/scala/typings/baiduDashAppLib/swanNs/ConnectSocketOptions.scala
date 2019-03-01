package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket
trait ConnectSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  /** HTTP Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认是GET，有效值为： OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 子协议数组
  		 * @version 1.4.0
  		 */
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 开发者服务器接口地址，必须是 HTTPS 协议，且域名必须是后台配置的合法域名 */
  var url: java.lang.String
}

object ConnectSocketOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    header: RequestHeader = null,
    method: java.lang.String = null,
    protocols: js.Array[java.lang.String] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): ConnectSocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ConnectSocketOptions]
  }
}

