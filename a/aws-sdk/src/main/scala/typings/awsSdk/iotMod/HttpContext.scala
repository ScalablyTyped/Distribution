package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpContext extends StObject {
  
  /**
    * The header keys and values in an HTTP authorization request.
    */
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  /**
    * The query string keys and values in an HTTP authorization request.
    */
  var queryString: js.UndefOr[HttpQueryString] = js.undefined
}
object HttpContext {
  
  inline def apply(): HttpContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpContext]
  }
  
  extension [Self <: HttpContext](x: Self) {
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setQueryString(value: HttpQueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
