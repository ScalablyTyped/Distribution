package typings.baiduApp.swan

import typings.baiduApp.anon.ErrCode
import typings.baiduApp.baiduAppStrings.DELETE
import typings.baiduApp.baiduAppStrings.GET
import typings.baiduApp.baiduAppStrings.HEAD
import typings.baiduApp.baiduAppStrings.OPTIONS
import typings.baiduApp.baiduAppStrings.POST
import typings.baiduApp.baiduAppStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions
  extends BaseOptions[DataResponse, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object] = js.native
  /** 如果设为json，会尝试对返回的数据做一次 JSON.parse  默认值为json */
  var dataType: js.UndefOr[String] = js.native
  @JSName("fail")
  var fail_RequestOptions: js.UndefOr[js.Function1[/* err */ ErrCode, Unit]] = js.native
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.native
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE] = js.native
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer  默认值为text
    * @version 1.7.0
    */
  var responseType: js.UndefOr[String] = js.native
  /** 开发者服务器接口地址 */
  var url: String = js.native
}

object RequestOptions {
  @scala.inline
  def apply(url: String): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setData(value: String | js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setFail(value: /* err */ ErrCode => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setHeader(value: RequestHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMethod(value: GET | OPTIONS | HEAD | POST | PUT | DELETE): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
  }
  
}

