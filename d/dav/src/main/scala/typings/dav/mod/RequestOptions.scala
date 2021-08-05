package typings.dav.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.Request> */
trait RequestOptions extends StObject {
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var onerror: js.UndefOr[js.Function1[/* error */ Error, js.Any]] = js.undefined
  
  var requestData: js.UndefOr[String] = js.undefined
  
  var transformRequest: js.UndefOr[js.Function1[/* xhr */ js.Any, js.Any]] = js.undefined
  
  var transformResponse: js.UndefOr[js.Function1[/* xhr */ js.Any, js.Any]] = js.undefined
}
object RequestOptions {
  
  inline def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setConstructor(value: /* options */ js.UndefOr[RequestOptions] => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOnerror(value: /* error */ Error => js.Any): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setRequestData(value: String): Self = StObject.set(x, "requestData", value.asInstanceOf[js.Any])
    
    inline def setRequestDataUndefined: Self = StObject.set(x, "requestData", js.undefined)
    
    inline def setTransformRequest(value: /* xhr */ js.Any => js.Any): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
    
    inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    inline def setTransformResponse(value: /* xhr */ js.Any => js.Any): Self = StObject.set(x, "transformResponse", js.Any.fromFunction1(value))
    
    inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
  }
}
