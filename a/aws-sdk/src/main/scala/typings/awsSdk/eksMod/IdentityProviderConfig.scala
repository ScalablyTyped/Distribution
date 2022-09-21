package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderConfig extends StObject {
  
  /**
    * The name of the identity provider configuration.
    */
  var name: String
  
  /**
    * The type of the identity provider configuration. The only type available is oidc.
    */
  var `type`: String
}
object IdentityProviderConfig {
  
  inline def apply(name: String, `type`: String): IdentityProviderConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderConfig]
  }
  
  extension [Self <: IdentityProviderConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
