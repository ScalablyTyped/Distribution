package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalAxiosRequestConfig[D]
  extends StObject
     with AxiosRequestConfig[D] {
  
  @JSName("headers")
  var headers_InternalAxiosRequestConfig: AxiosRequestHeaders
}
object InternalAxiosRequestConfig {
  
  inline def apply[D](headers: AxiosRequestHeaders): InternalAxiosRequestConfig[D] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalAxiosRequestConfig[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalAxiosRequestConfig[?], D] (val x: Self & InternalAxiosRequestConfig[D]) extends AnyVal {
    
    inline def setHeaders(value: AxiosRequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
