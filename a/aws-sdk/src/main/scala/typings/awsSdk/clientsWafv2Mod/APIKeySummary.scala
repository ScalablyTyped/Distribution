package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIKeySummary extends StObject {
  
  /**
    * The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration. 
    */
  var APIKey: js.UndefOr[typings.awsSdk.clientsWafv2Mod.APIKey] = js.undefined
  
  /**
    * The date and time that the key was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The token domains that are defined in this API key. 
    */
  var TokenDomains: js.UndefOr[typings.awsSdk.clientsWafv2Mod.TokenDomains] = js.undefined
  
  /**
    * Internal value used by WAF to manage the key. 
    */
  var Version: js.UndefOr[APIKeyVersion] = js.undefined
}
object APIKeySummary {
  
  inline def apply(): APIKeySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIKeySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: APIKeySummary] (val x: Self) extends AnyVal {
    
    inline def setAPIKey(value: APIKey): Self = StObject.set(x, "APIKey", value.asInstanceOf[js.Any])
    
    inline def setAPIKeyUndefined: Self = StObject.set(x, "APIKey", js.undefined)
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setTokenDomains(value: TokenDomains): Self = StObject.set(x, "TokenDomains", value.asInstanceOf[js.Any])
    
    inline def setTokenDomainsUndefined: Self = StObject.set(x, "TokenDomains", js.undefined)
    
    inline def setTokenDomainsVarargs(value: TokenDomain*): Self = StObject.set(x, "TokenDomains", js.Array(value*))
    
    inline def setVersion(value: APIKeyVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
