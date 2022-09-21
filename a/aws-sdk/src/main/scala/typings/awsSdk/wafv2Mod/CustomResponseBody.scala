package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomResponseBody extends StObject {
  
  /**
    * The payload of the custom response.  You can use JSON escape strings in JSON content. To do this, you must specify JSON content in the ContentType setting.  For information about the limits on count and size for custom request and response settings, see WAF quotas in the WAF Developer Guide. 
    */
  var Content: ResponseContent
  
  /**
    * The type of content in the payload that you are defining in the Content string.
    */
  var ContentType: ResponseContentType
}
object CustomResponseBody {
  
  inline def apply(Content: ResponseContent, ContentType: ResponseContentType): CustomResponseBody = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResponseBody]
  }
  
  extension [Self <: CustomResponseBody](x: Self) {
    
    inline def setContent(value: ResponseContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ResponseContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
  }
}
