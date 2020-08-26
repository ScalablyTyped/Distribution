package typings.awsSdkTypes.httpMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpMessage[StreamType] extends js.Object {
  var body: js.UndefOr[ArrayBuffer | ArrayBufferView | String | StreamType] = js.native
  var headers: HeaderBag = js.native
}

object HttpMessage {
  @scala.inline
  def apply[StreamType](headers: HeaderBag): HttpMessage[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMessage[StreamType]]
  }
  @scala.inline
  implicit class HttpMessageOps[Self <: HttpMessage[_], StreamType] (val x: Self with HttpMessage[StreamType]) extends AnyVal {
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
    def setHeaders(value: HeaderBag): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: ArrayBuffer | ArrayBufferView | String | StreamType): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

