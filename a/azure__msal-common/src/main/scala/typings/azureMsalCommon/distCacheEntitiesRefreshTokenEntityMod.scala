package typings.azureMsalCommon

import typings.azureMsalCommon.distCacheEntitiesCredentialEntityMod.CredentialEntity
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.ValidCredentialType
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod._ValidCacheType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheEntitiesRefreshTokenEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/RefreshTokenEntity", "RefreshTokenEntity")
  @js.native
  open class RefreshTokenEntity ()
    extends CredentialEntity
       with ValidCredentialType
       with _ValidCacheType
  /* static members */
  object RefreshTokenEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/RefreshTokenEntity", "RefreshTokenEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create RefreshTokenEntity
      * @param homeAccountId
      * @param authenticationResult
      * @param clientId
      * @param authority
      */
    inline def createRefreshTokenEntity(homeAccountId: String, environment: String, refreshToken: String, clientId: String): RefreshTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[RefreshTokenEntity]
    inline def createRefreshTokenEntity(
      homeAccountId: String,
      environment: String,
      refreshToken: String,
      clientId: String,
      familyId: String
    ): RefreshTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any])).asInstanceOf[RefreshTokenEntity]
    inline def createRefreshTokenEntity(
      homeAccountId: String,
      environment: String,
      refreshToken: String,
      clientId: String,
      familyId: String,
      userAssertionHash: String
    ): RefreshTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], userAssertionHash.asInstanceOf[js.Any])).asInstanceOf[RefreshTokenEntity]
    inline def createRefreshTokenEntity(
      homeAccountId: String,
      environment: String,
      refreshToken: String,
      clientId: String,
      familyId: Unit,
      userAssertionHash: String
    ): RefreshTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], userAssertionHash.asInstanceOf[js.Any])).asInstanceOf[RefreshTokenEntity]
    
    /**
      * Validates an entity: checks for all expected params
      * @param entity
      */
    inline def isRefreshTokenEntity(entity: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefreshTokenEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
