package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomResponse extends StObject {
  
  /**
    * References the response body that you want WAF to return to the web request client. You can define a custom response for a rule action or a default web ACL action that is set to block. To do this, you first define the response body key and value in the CustomResponseBodies setting for the WebACL or RuleGroup where you want to use it. Then, in the rule action or web ACL default action BlockAction setting, you reference the response body using this key. 
    */
  var CustomResponseBodyKey: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The HTTP status code to return to the client.  For a list of status codes that you can use in your custom responses, see Supported status codes for custom response in the WAF Developer Guide. 
    */
  var ResponseCode: ResponseStatusCode
  
  /**
    * The HTTP headers to use in the response. Duplicate header names are not allowed.  For information about the limits on count and size for custom request and response settings, see WAF quotas in the WAF Developer Guide. 
    */
  var ResponseHeaders: js.UndefOr[CustomHTTPHeaders] = js.undefined
}
object CustomResponse {
  
  inline def apply(ResponseCode: ResponseStatusCode): CustomResponse = {
    val __obj = js.Dynamic.literal(ResponseCode = ResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomResponseBodyKey(value: EntityName): Self = StObject.set(x, "CustomResponseBodyKey", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseBodyKeyUndefined: Self = StObject.set(x, "CustomResponseBodyKey", js.undefined)
    
    inline def setResponseCode(value: ResponseStatusCode): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: CustomHTTPHeaders): Self = StObject.set(x, "ResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "ResponseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: CustomHTTPHeader*): Self = StObject.set(x, "ResponseHeaders", js.Array(value*))
  }
}
