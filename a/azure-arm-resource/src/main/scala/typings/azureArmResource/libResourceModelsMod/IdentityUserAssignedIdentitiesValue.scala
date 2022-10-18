package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityUserAssignedIdentitiesValue extends StObject {
  
  /**
    * The client id of user assigned identity.
    */
  val clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The principal id of user assigned identity.
    */
  val principalId: js.UndefOr[String] = js.undefined
}
object IdentityUserAssignedIdentitiesValue {
  
  inline def apply(): IdentityUserAssignedIdentitiesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUserAssignedIdentitiesValue]
  }
  
  extension [Self <: IdentityUserAssignedIdentitiesValue](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
  }
}
