package typings.azure.mod

import typings.azure.anon.Se
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedAccessSignatureResult extends StObject {
  
  var baseUrl: String
  
  var path: String
  
  var queryString: Se
  
  def url(): String
}
object SharedAccessSignatureResult {
  
  inline def apply(baseUrl: String, path: String, queryString: Se, url: () => String): SharedAccessSignatureResult = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[SharedAccessSignatureResult]
  }
  
  extension [Self <: SharedAccessSignatureResult](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: Se): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: () => String): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
  }
}
