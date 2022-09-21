package typings.azureMsalCommon

import typings.azureMsalCommon.cacheTypesMod.ValidCredentialType
import typings.azureMsalCommon.cacheTypesMod._ValidCacheType
import typings.azureMsalCommon.credentialEntityMod.CredentialEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idTokenEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/IdTokenEntity", "IdTokenEntity")
  @js.native
  open class IdTokenEntity ()
    extends CredentialEntity
       with ValidCredentialType
       with _ValidCacheType {
    
    @JSName("realm")
    var realm_IdTokenEntity: String = js.native
  }
  /* static members */
  object IdTokenEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/IdTokenEntity", "IdTokenEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create IdTokenEntity
      * @param homeAccountId
      * @param authenticationResult
      * @param clientId
      * @param authority
      */
    inline def createIdTokenEntity(homeAccountId: String, environment: String, idToken: String, clientId: String, tenantId: String): IdTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createIdTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], idToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[IdTokenEntity]
    
    /**
      * Validates an entity: checks for all expected params
      * @param entity
      */
    inline def isIdTokenEntity(entity: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdTokenEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
