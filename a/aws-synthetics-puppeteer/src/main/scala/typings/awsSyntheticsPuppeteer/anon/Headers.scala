package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var headers: Boolean
  
  var method: Boolean
  
  var postData: Boolean
  
  var resourceType: Boolean
  
  var url: Boolean
}
object Headers {
  
  inline def apply(headers: Boolean, method: Boolean, postData: Boolean, resourceType: Boolean, url: Boolean): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], postData = postData.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPostData(value: Boolean): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: Boolean): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
