package typings.ddTrace.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait TransportRequestParams extends StObject {
  
  var body: js.UndefOr[anyObject] = js.undefined
  
  var bulkBody: js.UndefOr[anyObject] = js.undefined
  
  var method: String
  
  var path: String
  
  var querystring: js.UndefOr[anyObject] = js.undefined
}
object TransportRequestParams {
  
  inline def apply(method: String, path: String): TransportRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportRequestParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransportRequestParams] (val x: Self) extends AnyVal {
    
    inline def setBody(value: anyObject): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBulkBody(value: anyObject): Self = StObject.set(x, "bulkBody", value.asInstanceOf[js.Any])
    
    inline def setBulkBodyUndefined: Self = StObject.set(x, "bulkBody", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuerystring(value: anyObject): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
    
    inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
  }
}
