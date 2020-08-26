package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket
@js.native
trait ConnectSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  /** HTTP Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.native
  /** 默认是GET，有效值为： OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[String] = js.native
  /**
    * 子协议数组
    * @version 1.4.0
    */
  var protocols: js.UndefOr[js.Array[String]] = js.native
  /** 开发者服务器接口地址，必须是 HTTPS 协议，且域名必须是后台配置的合法域名 */
  var url: String = js.native
}

object ConnectSocketOptions {
  @scala.inline
  def apply(url: String): ConnectSocketOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectSocketOptions]
  }
  @scala.inline
  implicit class ConnectSocketOptionsOps[Self <: ConnectSocketOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: RequestHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
  }
  
}

