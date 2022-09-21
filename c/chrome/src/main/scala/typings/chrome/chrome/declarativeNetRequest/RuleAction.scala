package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleAction extends StObject {
  
  /** Describes how the redirect should be performed.
    * Only valid for redirect rules.
    */
  var redirect: js.UndefOr[Redirect] = js.undefined
  
  /** The request headers to modify for the request.
    * Only valid if RuleActionType is "modifyHeaders".
    */
  var requestHeaders: js.UndefOr[js.Array[ModifyHeaderInfo]] = js.undefined
  
  /** The response headers to modify for the request.
    * Only valid if RuleActionType is "modifyHeaders".
    */
  var responseHeaders: js.UndefOr[js.Array[ModifyHeaderInfo]] = js.undefined
  
  /** The type of action to perform. */
  var `type`: RuleActionType
}
object RuleAction {
  
  inline def apply(`type`: RuleActionType): RuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleAction]
  }
  
  extension [Self <: RuleAction](x: Self) {
    
    inline def setRedirect(value: Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setRequestHeaders(value: js.Array[ModifyHeaderInfo]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: ModifyHeaderInfo*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
    
    inline def setResponseHeaders(value: js.Array[ModifyHeaderInfo]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: ModifyHeaderInfo*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
    
    inline def setType(value: RuleActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
