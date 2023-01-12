package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedIdentityCredentialClientIdOptions
  extends StObject
     with TokenCredentialOptions {
  
  /**
    * The client ID of the user - assigned identity, or app registration(when working with AKS pod - identity).
    */
  var clientId: js.UndefOr[String] = js.undefined
}
object ManagedIdentityCredentialClientIdOptions {
  
  inline def apply(): ManagedIdentityCredentialClientIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedIdentityCredentialClientIdOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedIdentityCredentialClientIdOptions] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
  }
}
