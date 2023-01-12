package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyReleasePolicy extends StObject {
  
  /**
    * Content type and version of key release policy.
    *
    * Defaults to "application/json; charset=utf-8" if omitted.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The policy rules under which the key can be released. Encoded based on the {@link KeyReleasePolicy.contentType}.
    *
    * For more information regarding the release policy grammar for Azure Key Vault, please refer to:
    * - https://aka.ms/policygrammarkeys for Azure Key Vault release policy grammar.
    * - https://aka.ms/policygrammarmhsm for Azure Managed HSM release policy grammar.
    */
  var encodedPolicy: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /** Marks a release policy as immutable. An immutable release policy cannot be changed or updated after being marked immutable. */
  var immutable: js.UndefOr[Boolean] = js.undefined
}
object KeyReleasePolicy {
  
  inline def apply(): KeyReleasePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyReleasePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyReleasePolicy] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setEncodedPolicy(value: js.typedarray.Uint8Array): Self = StObject.set(x, "encodedPolicy", value.asInstanceOf[js.Any])
    
    inline def setEncodedPolicyUndefined: Self = StObject.set(x, "encodedPolicy", js.undefined)
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
  }
}
