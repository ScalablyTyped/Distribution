package typings.azureMsalCommon

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distCacheEntitiesAccessTokenEntityMod.AccessTokenEntity
import typings.azureMsalCommon.distCacheEntitiesAccountEntityMod.AccountEntity
import typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity
import typings.azureMsalCommon.distCacheEntitiesAuthorityMetadataEntityMod.AuthorityMetadataEntity
import typings.azureMsalCommon.distCacheEntitiesCacheRecordMod.CacheRecord
import typings.azureMsalCommon.distCacheEntitiesIdTokenEntityMod.IdTokenEntity
import typings.azureMsalCommon.distCacheEntitiesRefreshTokenEntityMod.RefreshTokenEntity
import typings.azureMsalCommon.distCacheEntitiesServerTelemetryEntityMod.ServerTelemetryEntity
import typings.azureMsalCommon.distCacheEntitiesThrottlingEntityMod.ThrottlingEntity
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AccountFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheInterfaceIcachemanagerMod {
  
  @js.native
  trait ICacheManager extends StObject {
    
    /**
      * given an authority generates the cache key for authorityMetadata
      * @param authority
      */
    def generateAuthorityMetadataCacheKey(authority: String): String = js.native
    
    /**
      * fetch the idToken entity from the platform cache
      * @param accessTokenKey
      */
    def getAccessTokenCredential(accessTokenKey: String): AccessTokenEntity | Null = js.native
    
    /**
      * fetch the account entity from the platform cache
      * @param accountKey
      */
    def getAccount(accountKey: String): AccountEntity | Null = js.native
    
    /**
      * Get AccountInfo object based on provided filters
      * @param filter
      */
    def getAccountInfoFilteredBy(filter: AccountFilter): AccountInfo | Null = js.native
    
    /**
      * retrieve accounts matching all provided filters; if no filter is set, get all accounts
      * @param homeAccountId
      * @param environment
      * @param realm
      */
    def getAccountsFilteredBy(filter: AccountFilter): js.Array[AccountEntity] = js.native
    
    /**
      * Returns all accounts in cache
      */
    def getAllAccounts(): js.Array[AccountInfo] = js.native
    
    /**
      * fetch appMetadata entity from the platform cache
      * @param appMetadataKey
      */
    def getAppMetadata(appMetadataKey: String): AppMetadataEntity | Null = js.native
    
    /**
      * fetch cloud discovery metadata entity from the platform cache
      * @param key
      */
    def getAuthorityMetadata(key: String): AuthorityMetadataEntity | Null = js.native
    
    /**
      * Provide an alias to find a matching AuthorityMetadataEntity in cache
      * @param host
      */
    def getAuthorityMetadataByAlias(host: String): AuthorityMetadataEntity | Null = js.native
    
    /**
      * Get cache keys for authority metadata
      */
    def getAuthorityMetadataKeys(): js.Array[String] = js.native
    
    /**
      * fetch the idToken entity from the platform cache
      * @param idTokenKey
      */
    def getIdTokenCredential(idTokenKey: String): IdTokenEntity | Null = js.native
    
    /**
      * fetch the idToken entity from the platform cache
      * @param refreshTokenKey
      */
    def getRefreshTokenCredential(refreshTokenKey: String): RefreshTokenEntity | Null = js.native
    
    /**
      * fetch server telemetry entity from the platform cache
      * @param serverTelemetryKey
      */
    def getServerTelemetry(serverTelemetryKey: String): ServerTelemetryEntity | Null = js.native
    
    /**
      * fetch throttling entity from the platform cache
      * @param throttlingCacheKey
      */
    def getThrottlingCache(throttlingCacheKey: String): ThrottlingEntity | Null = js.native
    
    /**
      * Returns true if the given key matches our account key schema. Also matches homeAccountId and/or tenantId if provided
      * @param key
      * @param homeAccountId
      * @param tenantId
      * @returns
      */
    def isAccountKey(key: String): Boolean = js.native
    def isAccountKey(key: String, homeAccountId: String): Boolean = js.native
    def isAccountKey(key: String, homeAccountId: String, tenantId: String): Boolean = js.native
    def isAccountKey(key: String, homeAccountId: Unit, tenantId: String): Boolean = js.native
    
    /**
      * @param key
      */
    def removeAccessToken(key: String): js.Promise[Unit] = js.native
    
    /**
      * returns a boolean if the given account is removed
      * @param account
      */
    def removeAccount(accountKey: String): js.Promise[Unit] = js.native
    
    /**
      * returns a boolean if the given account is removed
      * @param account
      */
    def removeAccountContext(account: AccountEntity): js.Promise[Unit] = js.native
    
    /**
      * Removes all accounts and related tokens from cache.
      */
    def removeAllAccounts(): js.Promise[Unit] = js.native
    
    /**
      * @param key
      */
    def removeIdToken(key: String): Unit = js.native
    
    /**
      * @param key
      */
    def removeRefreshToken(key: String): Unit = js.native
    
    /**
      * saves a cache record
      * @param cacheRecord
      */
    def saveCacheRecord(cacheRecord: CacheRecord): js.Promise[Unit] = js.native
    
    /**
      * set idToken entity to the platform cache
      * @param accessToken
      */
    def setAccessTokenCredential(accessToken: AccessTokenEntity): Unit = js.native
    
    /**
      * set account entity in the platform cache
      * @param account
      */
    def setAccount(account: AccountEntity): Unit = js.native
    
    /**
      * set appMetadata entity to the platform cache
      * @param appMetadata
      */
    def setAppMetadata(appMetadata: AppMetadataEntity): Unit = js.native
    
    /**
      * set cloud discovery metadata entity to the platform cache
      * @param key
      * @param value
      */
    def setAuthorityMetadata(key: String, value: AuthorityMetadataEntity): Unit = js.native
    
    /**
      * set idToken entity to the platform cache
      * @param idToken
      */
    def setIdTokenCredential(idToken: IdTokenEntity): Unit = js.native
    
    /**
      * set idToken entity to the platform cache
      * @param refreshToken
      */
    def setRefreshTokenCredential(refreshToken: RefreshTokenEntity): Unit = js.native
    
    /**
      * set server telemetry entity to the platform cache
      * @param serverTelemetryKey
      * @param serverTelemetry
      */
    def setServerTelemetry(serverTelemetryKey: String, serverTelemetry: ServerTelemetryEntity): Unit = js.native
    
    /**
      * set throttling entity to the platform cache
      * @param throttlingCacheKey
      * @param throttlingCache
      */
    def setThrottlingCache(throttlingCacheKey: String, throttlingCache: ThrottlingEntity): Unit = js.native
  }
}
