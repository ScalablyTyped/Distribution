package typings.awsSdkHttpSerialization.mod

import typings.awsSdkTypes.httpMod.HeaderBag
import typings.awsSdkTypes.httpMod.QueryParameterBag
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpRequest<string>> & @aws-sdk/types.@aws-sdk/types.HttpMessage<string> & {  method :string} */
@js.native
trait DerivedHttpRequest extends js.Object {
  var body: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.native
  var headers: js.UndefOr[HeaderBag] with HeaderBag = js.native
  var hostname: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] with String = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[String] = js.native
  var query: js.UndefOr[QueryParameterBag] = js.native
}

object DerivedHttpRequest {
  @scala.inline
  def apply(headers: js.UndefOr[HeaderBag] with HeaderBag, method: js.UndefOr[String] with String): DerivedHttpRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerivedHttpRequest]
  }
  @scala.inline
  implicit class DerivedHttpRequestOps[Self <: DerivedHttpRequest] (val x: Self) extends AnyVal {
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
    def setHeaders(value: js.UndefOr[HeaderBag] with HeaderBag): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: js.UndefOr[String] with String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: ArrayBuffer | ArrayBufferView | String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setQuery(value: QueryParameterBag): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

