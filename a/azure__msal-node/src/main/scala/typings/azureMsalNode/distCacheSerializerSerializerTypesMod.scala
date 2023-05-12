package typings.azureMsalNode

import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AccessTokenCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AccountCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AppMetadataCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.IdTokenCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.RefreshTokenCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.ValidCacheType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheSerializerSerializerTypesMod {
  
  type CacheKVStore = Record[String, ValidCacheType]
  
  trait InMemoryCache extends StObject {
    
    var accessTokens: AccessTokenCache
    
    var accounts: AccountCache
    
    var appMetadata: AppMetadataCache
    
    var idTokens: IdTokenCache
    
    var refreshTokens: RefreshTokenCache
  }
  object InMemoryCache {
    
    inline def apply(
      accessTokens: AccessTokenCache,
      accounts: AccountCache,
      appMetadata: AppMetadataCache,
      idTokens: IdTokenCache,
      refreshTokens: RefreshTokenCache
    ): InMemoryCache = {
      val __obj = js.Dynamic.literal(accessTokens = accessTokens.asInstanceOf[js.Any], accounts = accounts.asInstanceOf[js.Any], appMetadata = appMetadata.asInstanceOf[js.Any], idTokens = idTokens.asInstanceOf[js.Any], refreshTokens = refreshTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[InMemoryCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InMemoryCache] (val x: Self) extends AnyVal {
      
      inline def setAccessTokens(value: AccessTokenCache): Self = StObject.set(x, "accessTokens", value.asInstanceOf[js.Any])
      
      inline def setAccounts(value: AccountCache): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      inline def setAppMetadata(value: AppMetadataCache): Self = StObject.set(x, "appMetadata", value.asInstanceOf[js.Any])
      
      inline def setIdTokens(value: IdTokenCache): Self = StObject.set(x, "idTokens", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokens(value: RefreshTokenCache): Self = StObject.set(x, "refreshTokens", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonCache extends StObject {
    
    var AccessToken: Record[String, SerializedAccessTokenEntity]
    
    var Account: Record[String, SerializedAccountEntity]
    
    var AppMetadata: Record[String, SerializedAppMetadataEntity]
    
    var IdToken: Record[String, SerializedIdTokenEntity]
    
    var RefreshToken: Record[String, SerializedRefreshTokenEntity]
  }
  object JsonCache {
    
    inline def apply(
      AccessToken: Record[String, SerializedAccessTokenEntity],
      Account: Record[String, SerializedAccountEntity],
      AppMetadata: Record[String, SerializedAppMetadataEntity],
      IdToken: Record[String, SerializedIdTokenEntity],
      RefreshToken: Record[String, SerializedRefreshTokenEntity]
    ): JsonCache = {
      val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], Account = Account.asInstanceOf[js.Any], AppMetadata = AppMetadata.asInstanceOf[js.Any], IdToken = IdToken.asInstanceOf[js.Any], RefreshToken = RefreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonCache] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: Record[String, SerializedAccessTokenEntity]): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
      
      inline def setAccount(value: Record[String, SerializedAccountEntity]): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
      
      inline def setAppMetadata(value: Record[String, SerializedAppMetadataEntity]): Self = StObject.set(x, "AppMetadata", value.asInstanceOf[js.Any])
      
      inline def setIdToken(value: Record[String, SerializedIdTokenEntity]): Self = StObject.set(x, "IdToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: Record[String, SerializedRefreshTokenEntity]): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedAccessTokenEntity extends StObject {
    
    var cached_at: String
    
    var client_id: String
    
    var credential_type: String
    
    var environment: String
    
    var expires_on: String
    
    var extended_expires_on: js.UndefOr[String] = js.undefined
    
    var home_account_id: String
    
    var key_id: js.UndefOr[String] = js.undefined
    
    var realm: String
    
    var refresh_on: js.UndefOr[String] = js.undefined
    
    var requestedClaims: js.UndefOr[String] = js.undefined
    
    var requestedClaimsHash: js.UndefOr[String] = js.undefined
    
    var secret: String
    
    var target: String
    
    var token_type: js.UndefOr[String] = js.undefined
    
    var userAssertionHash: js.UndefOr[String] = js.undefined
  }
  object SerializedAccessTokenEntity {
    
    inline def apply(
      cached_at: String,
      client_id: String,
      credential_type: String,
      environment: String,
      expires_on: String,
      home_account_id: String,
      realm: String,
      secret: String,
      target: String
    ): SerializedAccessTokenEntity = {
      val __obj = js.Dynamic.literal(cached_at = cached_at.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], credential_type = credential_type.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], expires_on = expires_on.asInstanceOf[js.Any], home_account_id = home_account_id.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedAccessTokenEntity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedAccessTokenEntity] (val x: Self) extends AnyVal {
      
      inline def setCached_at(value: String): Self = StObject.set(x, "cached_at", value.asInstanceOf[js.Any])
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setCredential_type(value: String): Self = StObject.set(x, "credential_type", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setExpires_on(value: String): Self = StObject.set(x, "expires_on", value.asInstanceOf[js.Any])
      
      inline def setExtended_expires_on(value: String): Self = StObject.set(x, "extended_expires_on", value.asInstanceOf[js.Any])
      
      inline def setExtended_expires_onUndefined: Self = StObject.set(x, "extended_expires_on", js.undefined)
      
      inline def setHome_account_id(value: String): Self = StObject.set(x, "home_account_id", value.asInstanceOf[js.Any])
      
      inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
      
      inline def setKey_idUndefined: Self = StObject.set(x, "key_id", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRefresh_on(value: String): Self = StObject.set(x, "refresh_on", value.asInstanceOf[js.Any])
      
      inline def setRefresh_onUndefined: Self = StObject.set(x, "refresh_on", js.undefined)
      
      inline def setRequestedClaims(value: String): Self = StObject.set(x, "requestedClaims", value.asInstanceOf[js.Any])
      
      inline def setRequestedClaimsHash(value: String): Self = StObject.set(x, "requestedClaimsHash", value.asInstanceOf[js.Any])
      
      inline def setRequestedClaimsHashUndefined: Self = StObject.set(x, "requestedClaimsHash", js.undefined)
      
      inline def setRequestedClaimsUndefined: Self = StObject.set(x, "requestedClaims", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
      
      inline def setUserAssertionHash(value: String): Self = StObject.set(x, "userAssertionHash", value.asInstanceOf[js.Any])
      
      inline def setUserAssertionHashUndefined: Self = StObject.set(x, "userAssertionHash", js.undefined)
    }
  }
  
  trait SerializedAccountEntity extends StObject {
    
    var authority_type: String
    
    var client_info: js.UndefOr[String] = js.undefined
    
    var environment: String
    
    var home_account_id: String
    
    var last_modification_app: js.UndefOr[String] = js.undefined
    
    var last_modification_time: js.UndefOr[String] = js.undefined
    
    var local_account_id: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var realm: String
    
    var username: String
  }
  object SerializedAccountEntity {
    
    inline def apply(
      authority_type: String,
      environment: String,
      home_account_id: String,
      local_account_id: String,
      realm: String,
      username: String
    ): SerializedAccountEntity = {
      val __obj = js.Dynamic.literal(authority_type = authority_type.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], home_account_id = home_account_id.asInstanceOf[js.Any], local_account_id = local_account_id.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedAccountEntity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedAccountEntity] (val x: Self) extends AnyVal {
      
      inline def setAuthority_type(value: String): Self = StObject.set(x, "authority_type", value.asInstanceOf[js.Any])
      
      inline def setClient_info(value: String): Self = StObject.set(x, "client_info", value.asInstanceOf[js.Any])
      
      inline def setClient_infoUndefined: Self = StObject.set(x, "client_info", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setHome_account_id(value: String): Self = StObject.set(x, "home_account_id", value.asInstanceOf[js.Any])
      
      inline def setLast_modification_app(value: String): Self = StObject.set(x, "last_modification_app", value.asInstanceOf[js.Any])
      
      inline def setLast_modification_appUndefined: Self = StObject.set(x, "last_modification_app", js.undefined)
      
      inline def setLast_modification_time(value: String): Self = StObject.set(x, "last_modification_time", value.asInstanceOf[js.Any])
      
      inline def setLast_modification_timeUndefined: Self = StObject.set(x, "last_modification_time", js.undefined)
      
      inline def setLocal_account_id(value: String): Self = StObject.set(x, "local_account_id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedAppMetadataEntity extends StObject {
    
    var client_id: String
    
    var environment: String
    
    var family_id: js.UndefOr[String] = js.undefined
  }
  object SerializedAppMetadataEntity {
    
    inline def apply(client_id: String, environment: String): SerializedAppMetadataEntity = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedAppMetadataEntity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedAppMetadataEntity] (val x: Self) extends AnyVal {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setFamily_id(value: String): Self = StObject.set(x, "family_id", value.asInstanceOf[js.Any])
      
      inline def setFamily_idUndefined: Self = StObject.set(x, "family_id", js.undefined)
    }
  }
  
  trait SerializedIdTokenEntity extends StObject {
    
    var client_id: String
    
    var credential_type: String
    
    var environment: String
    
    var home_account_id: String
    
    var realm: String
    
    var secret: String
  }
  object SerializedIdTokenEntity {
    
    inline def apply(
      client_id: String,
      credential_type: String,
      environment: String,
      home_account_id: String,
      realm: String,
      secret: String
    ): SerializedIdTokenEntity = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], credential_type = credential_type.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], home_account_id = home_account_id.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedIdTokenEntity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedIdTokenEntity] (val x: Self) extends AnyVal {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setCredential_type(value: String): Self = StObject.set(x, "credential_type", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setHome_account_id(value: String): Self = StObject.set(x, "home_account_id", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedRefreshTokenEntity extends StObject {
    
    var client_id: String
    
    var credential_type: String
    
    var environment: String
    
    var family_id: js.UndefOr[String] = js.undefined
    
    var home_account_id: String
    
    var realm: js.UndefOr[String] = js.undefined
    
    var secret: String
    
    var target: js.UndefOr[String] = js.undefined
  }
  object SerializedRefreshTokenEntity {
    
    inline def apply(
      client_id: String,
      credential_type: String,
      environment: String,
      home_account_id: String,
      secret: String
    ): SerializedRefreshTokenEntity = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], credential_type = credential_type.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], home_account_id = home_account_id.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedRefreshTokenEntity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedRefreshTokenEntity] (val x: Self) extends AnyVal {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setCredential_type(value: String): Self = StObject.set(x, "credential_type", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setFamily_id(value: String): Self = StObject.set(x, "family_id", value.asInstanceOf[js.Any])
      
      inline def setFamily_idUndefined: Self = StObject.set(x, "family_id", js.undefined)
      
      inline def setHome_account_id(value: String): Self = StObject.set(x, "home_account_id", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
