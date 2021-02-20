package typings.ddTrace.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait TransportRequestParams extends StObject {
  
  var body: js.UndefOr[anyObject] = js.native
  
  var bulkBody: js.UndefOr[anyObject] = js.native
  
  var method: String = js.native
  
  var path: String = js.native
  
  var querystring: js.UndefOr[anyObject] = js.native
}
object TransportRequestParams {
  
  @scala.inline
  def apply(method: String, path: String): TransportRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportRequestParams]
  }
  
  @scala.inline
  implicit class TransportRequestParamsMutableBuilder[Self <: TransportRequestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: anyObject): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setBulkBody(value: anyObject): Self = StObject.set(x, "bulkBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkBodyUndefined: Self = StObject.set(x, "bulkBody", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerystring(value: anyObject): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
  }
}
