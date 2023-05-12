package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorityValidationOptions extends StObject {
  
  /**
    * The field determines whether instance discovery is performed when attempting to authenticate.
    * Setting this to `true` will completely disable both instance discovery and authority validation.
    * As a result, it's crucial to ensure that the configured authority host is valid and trustworthy.
    * This functionality is intended for use in scenarios where the metadata endpoint cannot be reached, such as in private clouds or Azure Stack.
    * The process of instance discovery entails retrieving authority metadata from https://login.microsoft.com/ to validate the authority.
    */
  var disableInstanceDiscovery: js.UndefOr[Boolean] = js.undefined
}
object AuthorityValidationOptions {
  
  inline def apply(): AuthorityValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorityValidationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorityValidationOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableInstanceDiscovery(value: Boolean): Self = StObject.set(x, "disableInstanceDiscovery", value.asInstanceOf[js.Any])
    
    inline def setDisableInstanceDiscoveryUndefined: Self = StObject.set(x, "disableInstanceDiscovery", js.undefined)
  }
}
