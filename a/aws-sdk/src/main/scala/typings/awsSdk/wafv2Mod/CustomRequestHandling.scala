package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRequestHandling extends StObject {
  
  /**
    * The HTTP headers to insert into the request. Duplicate header names are not allowed.  For information about the limits on count and size for custom request and response settings, see WAF quotas in the WAF Developer Guide. 
    */
  var InsertHeaders: CustomHTTPHeaders
}
object CustomRequestHandling {
  
  inline def apply(InsertHeaders: CustomHTTPHeaders): CustomRequestHandling = {
    val __obj = js.Dynamic.literal(InsertHeaders = InsertHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRequestHandling]
  }
  
  extension [Self <: CustomRequestHandling](x: Self) {
    
    inline def setInsertHeaders(value: CustomHTTPHeaders): Self = StObject.set(x, "InsertHeaders", value.asInstanceOf[js.Any])
    
    inline def setInsertHeadersVarargs(value: CustomHTTPHeader*): Self = StObject.set(x, "InsertHeaders", js.Array(value*))
  }
}
