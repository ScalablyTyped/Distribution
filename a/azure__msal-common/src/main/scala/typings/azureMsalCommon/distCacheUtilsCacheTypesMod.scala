package typings.azureMsalCommon

import typings.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
import typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity
import typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity
import typings.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
import typings.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
import typings.azureMsalCommon.distRequestScopeSetMod.ScopeSet
import typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheUtilsCacheTypesMod {
  
  type AccessTokenCache = Record[String, AccessTokenEntity]
  
  type AccountCache = Record[String, AccountEntity]
  
  trait AccountFilter extends StObject {
    
    var environment: js.UndefOr[String] = js.undefined
    
    var homeAccountId: js.UndefOr[String] = js.undefined
    
    var localAccountId: js.UndefOr[String] = js.undefined
    
    var nativeAccountId: js.UndefOr[String] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object AccountFilter {
    
    inline def apply(): AccountFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccountFilter] (val x: Self) extends AnyVal {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setHomeAccountId(value: String): Self = StObject.set(x, "homeAccountId", value.asInstanceOf[js.Any])
      
      inline def setHomeAccountIdUndefined: Self = StObject.set(x, "homeAccountId", js.undefined)
      
      inline def setLocalAccountId(value: String): Self = StObject.set(x, "localAccountId", value.asInstanceOf[js.Any])
      
      inline def setLocalAccountIdUndefined: Self = StObject.set(x, "localAccountId", js.undefined)
      
      inline def setNativeAccountId(value: String): Self = StObject.set(x, "nativeAccountId", value.asInstanceOf[js.Any])
      
      inline def setNativeAccountIdUndefined: Self = StObject.set(x, "nativeAccountId", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  type AppMetadataCache = Record[String, AppMetadataEntity]
  
  trait AppMetadataFilter extends StObject {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
  }
  object AppMetadataFilter {
    
    inline def apply(): AppMetadataFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppMetadataFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppMetadataFilter] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    }
  }
  
  trait CredentialFilter extends StObject {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var credentialType: js.UndefOr[String] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var familyId: js.UndefOr[String] = js.undefined
    
    var homeAccountId: js.UndefOr[String] = js.undefined
    
    var keyId: js.UndefOr[String] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var requestedClaimsHash: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[ScopeSet] = js.undefined
    
    var tokenType: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var userAssertionHash: js.UndefOr[String] = js.undefined
  }
  object CredentialFilter {
    
    inline def apply(): CredentialFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CredentialFilter] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setCredentialType(value: String): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
      
      inline def setCredentialTypeUndefined: Self = StObject.set(x, "credentialType", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setFamilyId(value: String): Self = StObject.set(x, "familyId", value.asInstanceOf[js.Any])
      
      inline def setFamilyIdUndefined: Self = StObject.set(x, "familyId", js.undefined)
      
      inline def setHomeAccountId(value: String): Self = StObject.set(x, "homeAccountId", value.asInstanceOf[js.Any])
      
      inline def setHomeAccountIdUndefined: Self = StObject.set(x, "homeAccountId", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setRequestedClaimsHash(value: String): Self = StObject.set(x, "requestedClaimsHash", value.asInstanceOf[js.Any])
      
      inline def setRequestedClaimsHashUndefined: Self = StObject.set(x, "requestedClaimsHash", js.undefined)
      
      inline def setTarget(value: ScopeSet): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTokenType(value: AuthenticationScheme): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setUserAssertionHash(value: String): Self = StObject.set(x, "userAssertionHash", value.asInstanceOf[js.Any])
      
      inline def setUserAssertionHashUndefined: Self = StObject.set(x, "userAssertionHash", js.undefined)
    }
  }
  
  type IdTokenCache = Record[String, IdTokenEntity]
  
  type RefreshTokenCache = Record[String, RefreshTokenEntity]
  
  trait TokenKeys extends StObject {
    
    var accessToken: js.Array[String]
    
    var idToken: js.Array[String]
    
    var refreshToken: js.Array[String]
  }
  object TokenKeys {
    
    inline def apply(accessToken: js.Array[String], idToken: js.Array[String], refreshToken: js.Array[String]): TokenKeys = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenKeys]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenKeys] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: js.Array[String]): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenVarargs(value: String*): Self = StObject.set(x, "accessToken", js.Array(value*))
      
      inline def setIdToken(value: js.Array[String]): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenVarargs(value: String*): Self = StObject.set(x, "idToken", js.Array(value*))
      
      inline def setRefreshToken(value: js.Array[String]): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenVarargs(value: String*): Self = StObject.set(x, "refreshToken", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity
    - typings.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
    - typings.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
    - typings.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
    - typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity
    - typings.azureMsalCommon.distCacheEntitiesAuthorityMetadataEntityMod.AuthorityMetadataEntity
    - typings.azureMsalCommon.distCacheEntitiesServerTelemetryEntityMod.ServerTelemetryEntity
    - typings.azureMsalCommon.distCacheEntitiesThrottlingEntityMod.ThrottlingEntity
    - java.lang.String
  */
  type ValidCacheType = _ValidCacheType | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
    - typings.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
    - typings.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
  */
  trait ValidCredentialType extends StObject
  
  trait _ValidCacheType extends StObject
}
