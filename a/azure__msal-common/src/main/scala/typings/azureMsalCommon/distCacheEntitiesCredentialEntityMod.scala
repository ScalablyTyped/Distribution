package typings.azureMsalCommon

import typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import typings.azureMsalCommon.distUtilsConstantsMod.CredentialType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheEntitiesCredentialEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/CredentialEntity", "CredentialEntity")
  @js.native
  open class CredentialEntity () extends StObject {
    
    var clientId: String = js.native
    
    var credentialType: CredentialType = js.native
    
    var environment: String = js.native
    
    var familyId: js.UndefOr[String] = js.native
    
    /**
      * Generate Account Id key component as per the schema: <home_account_id>-<environment>
      */
    def generateAccountId(): String = js.native
    
    /**
      * Generate Credential Id key component as per the schema: <credential_type>-<client_id>-<realm>
      */
    def generateCredentialId(): String = js.native
    
    /**
      * generates credential key
      */
    def generateCredentialKey(): String = js.native
    
    /**
      * Generate target key component as per schema: <target>
      */
    def generateTarget(): String = js.native
    
    /**
      * returns the type of the cache (in this case credential)
      */
    def generateType(): Double = js.native
    
    var homeAccountId: String = js.native
    
    var keyId: js.UndefOr[String] = js.native
    
    var realm: js.UndefOr[String] = js.native
    
    var requestedClaimsHash: js.UndefOr[String] = js.native
    
    var secret: String = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var tokenType: js.UndefOr[AuthenticationScheme] = js.native
    
    var userAssertionHash: js.UndefOr[String] = js.native
  }
  /* static members */
  object CredentialEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/CredentialEntity", "CredentialEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * generates Account Id for keys
      * @param homeAccountId
      * @param environment
      */
    @JSImport("@azure/msal-common/dist/cache/entities/CredentialEntity", "CredentialEntity.generateAccountIdForCacheKey")
    @js.native
    def generateAccountIdForCacheKey: Any = js.native
    inline def generateAccountIdForCacheKey_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generateAccountIdForCacheKey")(x.asInstanceOf[js.Any])
    
    /**
      * Generate requested claims key component as per schema: <requestedClaims>
      */
    @JSImport("@azure/msal-common/dist/cache/entities/CredentialEntity", "CredentialEntity.generateClaimsHashForCacheKey")
    @js.native
    def generateClaimsHashForCacheKey: Any = js.native
    inline def generateClaimsHashForCacheKey_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generateClaimsHashForCacheKey")(x.asInstanceOf[js.Any])
    
    /**
      * generates credential key
      * <home_account_id*>-\<environment>-<credential_type>-<client_id>-<realm\*>-<target\*>-<scheme\*>
      */
    inline def generateCredentialCacheKey(homeAccountId: String, environment: String, credentialType: CredentialType, clientId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: String,
      familyId: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: String,
      familyId: String,
      tokenType: Unit,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: String,
      familyId: String,
      tokenType: AuthenticationScheme
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: String,
      familyId: String,
      tokenType: AuthenticationScheme,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: String,
      familyId: Unit,
      tokenType: Unit,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: String,
      familyId: Unit,
      tokenType: AuthenticationScheme
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: String,
      familyId: Unit,
      tokenType: AuthenticationScheme,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: Unit,
      familyId: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: Unit,
      familyId: String,
      tokenType: Unit,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: Unit,
      familyId: String,
      tokenType: AuthenticationScheme
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: Unit,
      familyId: String,
      tokenType: AuthenticationScheme,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: Unit,
      familyId: Unit,
      tokenType: Unit,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: Unit,
      familyId: Unit,
      tokenType: AuthenticationScheme
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: String,
      target: Unit,
      familyId: Unit,
      tokenType: AuthenticationScheme,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: String,
      familyId: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: String,
      familyId: String,
      tokenType: Unit,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: String,
      familyId: String,
      tokenType: AuthenticationScheme
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: String,
      familyId: String,
      tokenType: AuthenticationScheme,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: String,
      familyId: Unit,
      tokenType: Unit,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: String,
      familyId: Unit,
      tokenType: AuthenticationScheme
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: String,
      familyId: Unit,
      tokenType: AuthenticationScheme,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: Unit,
      familyId: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: Unit,
      familyId: String,
      tokenType: Unit,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: Unit,
      familyId: String,
      tokenType: AuthenticationScheme
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: Unit,
      familyId: String,
      tokenType: AuthenticationScheme,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: Unit,
      familyId: Unit,
      tokenType: Unit,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: Unit,
      familyId: Unit,
      tokenType: AuthenticationScheme
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generateCredentialCacheKey(
      homeAccountId: String,
      environment: String,
      credentialType: CredentialType,
      clientId: String,
      realm: Unit,
      target: Unit,
      familyId: Unit,
      tokenType: AuthenticationScheme,
      requestedClaimsHash: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCredentialCacheKey")(homeAccountId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], credentialType.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], realm.asInstanceOf[js.Any], target.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], requestedClaimsHash.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Generates Credential Id for keys
      * @param credentialType
      * @param realm
      * @param clientId
      * @param familyId
      */
    @JSImport("@azure/msal-common/dist/cache/entities/CredentialEntity", "CredentialEntity.generateCredentialIdForCacheKey")
    @js.native
    def generateCredentialIdForCacheKey: Any = js.native
    inline def generateCredentialIdForCacheKey_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generateCredentialIdForCacheKey")(x.asInstanceOf[js.Any])
    
    /**
      * Generate scheme key componenet as per schema: <scheme>
      */
    @JSImport("@azure/msal-common/dist/cache/entities/CredentialEntity", "CredentialEntity.generateSchemeForCacheKey")
    @js.native
    def generateSchemeForCacheKey: Any = js.native
    inline def generateSchemeForCacheKey_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generateSchemeForCacheKey")(x.asInstanceOf[js.Any])
    
    /**
      * Generate target key component as per schema: <target>
      */
    @JSImport("@azure/msal-common/dist/cache/entities/CredentialEntity", "CredentialEntity.generateTargetForCacheKey")
    @js.native
    def generateTargetForCacheKey: Any = js.native
    inline def generateTargetForCacheKey_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generateTargetForCacheKey")(x.asInstanceOf[js.Any])
  }
}
