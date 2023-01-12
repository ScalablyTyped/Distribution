package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderSummary extends StObject {
  
  /**
    * The ARN of the identity provider.
    */
  var identityProviderArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identity provider name.
    */
  var identityProviderName: js.UndefOr[IdentityProviderName] = js.undefined
  
  /**
    * The identity provider type.
    */
  var identityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
}
object IdentityProviderSummary {
  
  inline def apply(): IdentityProviderSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityProviderSummary] (val x: Self) extends AnyVal {
    
    inline def setIdentityProviderArn(value: ARN): Self = StObject.set(x, "identityProviderArn", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderArnUndefined: Self = StObject.set(x, "identityProviderArn", js.undefined)
    
    inline def setIdentityProviderName(value: IdentityProviderName): Self = StObject.set(x, "identityProviderName", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderNameUndefined: Self = StObject.set(x, "identityProviderName", js.undefined)
    
    inline def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "identityProviderType", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderTypeUndefined: Self = StObject.set(x, "identityProviderType", js.undefined)
  }
}
