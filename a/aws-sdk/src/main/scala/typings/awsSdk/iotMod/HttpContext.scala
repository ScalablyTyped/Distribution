package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpContext extends StObject {
  
  /**
    * The header keys and values in an HTTP authorization request.
    */
  var headers: js.UndefOr[HttpHeaders] = js.native
  
  /**
    * The query string keys and values in an HTTP authorization request.
    */
  var queryString: js.UndefOr[HttpQueryString] = js.native
}
object HttpContext {
  
  @scala.inline
  def apply(): HttpContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpContext]
  }
  
  @scala.inline
  implicit class HttpContextMutableBuilder[Self <: HttpContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setQueryString(value: HttpQueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
