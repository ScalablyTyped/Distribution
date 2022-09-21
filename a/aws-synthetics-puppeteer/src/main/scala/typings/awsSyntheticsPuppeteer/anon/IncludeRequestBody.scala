package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeRequestBody extends StObject {
  
  var includeRequestBody: Boolean
  
  var includeRequestHeaders: Boolean
  
  var includeResponseBody: Boolean
  
  var includeResponseHeaders: Boolean
  
  var restrictedHeaders: js.Array[Any]
}
object IncludeRequestBody {
  
  inline def apply(
    includeRequestBody: Boolean,
    includeRequestHeaders: Boolean,
    includeResponseBody: Boolean,
    includeResponseHeaders: Boolean,
    restrictedHeaders: js.Array[Any]
  ): IncludeRequestBody = {
    val __obj = js.Dynamic.literal(includeRequestBody = includeRequestBody.asInstanceOf[js.Any], includeRequestHeaders = includeRequestHeaders.asInstanceOf[js.Any], includeResponseBody = includeResponseBody.asInstanceOf[js.Any], includeResponseHeaders = includeResponseHeaders.asInstanceOf[js.Any], restrictedHeaders = restrictedHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeRequestBody]
  }
  
  extension [Self <: IncludeRequestBody](x: Self) {
    
    inline def setIncludeRequestBody(value: Boolean): Self = StObject.set(x, "includeRequestBody", value.asInstanceOf[js.Any])
    
    inline def setIncludeRequestHeaders(value: Boolean): Self = StObject.set(x, "includeRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setIncludeResponseBody(value: Boolean): Self = StObject.set(x, "includeResponseBody", value.asInstanceOf[js.Any])
    
    inline def setIncludeResponseHeaders(value: Boolean): Self = StObject.set(x, "includeResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setRestrictedHeaders(value: js.Array[Any]): Self = StObject.set(x, "restrictedHeaders", value.asInstanceOf[js.Any])
    
    inline def setRestrictedHeadersVarargs(value: Any*): Self = StObject.set(x, "restrictedHeaders", js.Array(value*))
  }
}
