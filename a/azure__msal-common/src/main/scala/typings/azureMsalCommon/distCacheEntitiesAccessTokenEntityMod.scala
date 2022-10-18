package typings.azureMsalCommon

import typings.azureMsalCommon.distCacheEntitiesCredentialEntityMod.CredentialEntity
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.ValidCredentialType
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod._ValidCacheType
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheEntitiesAccessTokenEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/AccessTokenEntity", "AccessTokenEntity")
  @js.native
  open class AccessTokenEntity ()
    extends CredentialEntity
       with ValidCredentialType
       with _ValidCacheType {
    
    var cachedAt: String = js.native
    
    var expiresOn: String = js.native
    
    var extendedExpiresOn: js.UndefOr[String] = js.native
    
    @JSName("realm")
    var realm_AccessTokenEntity: String = js.native
    
    var refreshOn: js.UndefOr[String] = js.native
    
    var requestedClaims: js.UndefOr[String] = js.native
    
    @JSName("target")
    var target_AccessTokenEntity: String = js.native
  }
  /* static members */
  object AccessTokenEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/AccessTokenEntity", "AccessTokenEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create AccessTokenEntity
      * @param homeAccountId
      * @param environment
      * @param accessToken
      * @param clientId
      * @param tenantId
      * @param scopes
      * @param expiresOn
      * @param extExpiresOn
      */
    inline def createAccessTokenEntity(
      homeAccountId: String,
      environment: String,
      accessToken: String,
      clientId: String,
      tenantId: String,
      scopes: String,
      expiresOn: Double,
      extExpiresOn: Double,
      cryptoUtils: ICrypto,
      refreshOn: js.UndefOr[Double],
      tokenType: js.UndefOr[AuthenticationScheme],
      userAssertionHash: js.UndefOr[String],
      keyId: js.UndefOr[String],
      requestedClaims: js.UndefOr[String],
      requestedClaimsHash: js.UndefOr[String]
    ): AccessTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccessTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], expiresOn.asInstanceOf[js.Any], extExpiresOn.asInstanceOf[js.Any], cryptoUtils.asInstanceOf[js.Any], refreshOn.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], userAssertionHash.asInstanceOf[js.Any], keyId.asInstanceOf[js.Any], requestedClaims.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[AccessTokenEntity]
    
    /**
      * Validates an entity: checks for all expected params
      * @param entity
      */
    inline def isAccessTokenEntity(entity: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessTokenEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
