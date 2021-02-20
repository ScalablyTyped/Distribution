package typings.dav.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.Request> */
@js.native
trait RequestOptions extends StObject {
  
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
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: /* options */ js.UndefOr[RequestOptions] => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOnerror(value: /* error */ Error => _): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setRequestData(value: String): Self = StObject.set(x, "requestData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDataUndefined: Self = StObject.set(x, "requestData", js.undefined)
    
    @scala.inline
    def setTransformRequest(value: /* xhr */ js.Any => _): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    @scala.inline
    def setTransformResponse(value: /* xhr */ js.Any => _): Self = StObject.set(x, "transformResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
  }
}
