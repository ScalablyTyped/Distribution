package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDecryptedAPIKeyResponse extends StObject {
  
  /**
    * The date and time that the key was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The token domains that are defined in this API key. 
    */
  var TokenDomains: js.UndefOr[typings.awsSdk.clientsWafv2Mod.TokenDomains] = js.undefined
}
object GetDecryptedAPIKeyResponse {
  
  inline def apply(): GetDecryptedAPIKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDecryptedAPIKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDecryptedAPIKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setTokenDomains(value: TokenDomains): Self = StObject.set(x, "TokenDomains", value.asInstanceOf[js.Any])
    
    inline def setTokenDomainsUndefined: Self = StObject.set(x, "TokenDomains", js.undefined)
    
    inline def setTokenDomainsVarargs(value: TokenDomain*): Self = StObject.set(x, "TokenDomains", js.Array(value*))
  }
}
