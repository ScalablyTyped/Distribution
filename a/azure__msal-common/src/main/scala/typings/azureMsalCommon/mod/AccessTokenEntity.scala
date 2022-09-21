package typings.azureMsalCommon.mod

import typings.azureMsalCommon.icryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AccessTokenEntity")
@js.native
open class AccessTokenEntity ()
  extends typings.azureMsalCommon.accessTokenEntityMod.AccessTokenEntity
/* static members */
object AccessTokenEntity {
  
  @JSImport("@azure/msal-common", "AccessTokenEntity")
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
    tokenType: js.UndefOr[typings.azureMsalCommon.constantsMod.AuthenticationScheme],
    userAssertionHash: js.UndefOr[String],
    keyId: js.UndefOr[String],
    requestedClaims: js.UndefOr[String],
    requestedClaimsHash: js.UndefOr[String]
  ): typings.azureMsalCommon.accessTokenEntityMod.AccessTokenEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAccessTokenEntity")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], expiresOn.asInstanceOf[js.Any], extExpiresOn.asInstanceOf[js.Any], cryptoUtils.asInstanceOf[js.Any], refreshOn.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], userAssertionHash.asInstanceOf[js.Any], keyId.asInstanceOf[js.Any], requestedClaims.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.accessTokenEntityMod.AccessTokenEntity]
  
  /**
    * Validates an entity: checks for all expected params
    * @param entity
    */
  inline def isAccessTokenEntity(entity: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessTokenEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
