package typings.awsSdkProtocolHttp.httpResponseMod

import typings.awsSdkTypes.httpMod.HeaderBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpMessage> & {  statusCode :number} */
@js.native
trait HttpResponseOptions extends js.Object {
  
  var body: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[HeaderBag] = js.native
  
  var statusCode: Double = js.native
}
object HttpResponseOptions {
  
  @scala.inline
  def apply(statusCode: Double): HttpResponseOptions = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseOptions]
  }
  
  @scala.inline
  implicit class HttpResponseOptionsOps[Self <: HttpResponseOptions] (val x: Self) extends AnyVal {
    
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
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: HeaderBag): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
}
