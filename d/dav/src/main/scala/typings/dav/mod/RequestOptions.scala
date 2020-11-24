package typings.dav.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.Request> */
@js.native
trait RequestOptions extends js.Object {
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var onerror: js.UndefOr[js.Function1[/* error */ Error, _]] = js.native
  
  var requestData: js.UndefOr[String] = js.native
  
  var transformRequest: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.native
  
  var transformResponse: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
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
    def setConstructor(value: /* options */ js.UndefOr[RequestOptions] => js.Any): Self = this.set("constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOnerror(value: /* error */ Error => _): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setRequestData(value: String): Self = this.set("requestData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestData: Self = this.set("requestData", js.undefined)
    
    @scala.inline
    def setTransformRequest(value: /* xhr */ js.Any => _): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformRequest: Self = this.set("transformRequest", js.undefined)
    
    @scala.inline
    def setTransformResponse(value: /* xhr */ js.Any => _): Self = this.set("transformResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformResponse: Self = this.set("transformResponse", js.undefined)
  }
}
