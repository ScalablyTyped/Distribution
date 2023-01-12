package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRotationPolicyProperties extends StObject {
  
  /**
    * Optional key expiration period used to define the duration after which a newly rotated key will expire, defined as an ISO 8601 duration.
    */
  var expiresIn: js.UndefOr[String] = js.undefined
  
  /**
    * Actions that will be performed by Key Vault over the lifetime of a key.
    *
    * You may also pass an empty array to restore to its default values.
    */
  var lifetimeActions: js.UndefOr[js.Array[KeyRotationLifetimeAction]] = js.undefined
}
object KeyRotationPolicyProperties {
  
  inline def apply(): KeyRotationPolicyProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRotationPolicyProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyRotationPolicyProperties] (val x: Self) extends AnyVal {
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setLifetimeActions(value: js.Array[KeyRotationLifetimeAction]): Self = StObject.set(x, "lifetimeActions", value.asInstanceOf[js.Any])
    
    inline def setLifetimeActionsUndefined: Self = StObject.set(x, "lifetimeActions", js.undefined)
    
    inline def setLifetimeActionsVarargs(value: KeyRotationLifetimeAction*): Self = StObject.set(x, "lifetimeActions", js.Array(value*))
  }
}
