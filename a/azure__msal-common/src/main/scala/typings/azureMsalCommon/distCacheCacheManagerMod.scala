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
import typings.azureMsalCommon.distCacheInterfaceIcachemanagerMod.ICacheManager
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AppMetadataCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AppMetadataFilter
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.CredentialFilter
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.TokenKeys
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.ValidCredentialType
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distLoggerLoggerMod.Logger
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheCacheManagerMod {
  
  /* note: abstract class */ @JSImport("@azure/msal-common/dist/cache/CacheManager", "CacheManager")
  @js.native
  open class CacheManager protected ()
    extends StObject
       with ICacheManager {
    def this(clientId: String, cryptoImpl: ICrypto, logger: Logger) = this()
    
    /**
      * Validate the cache key against filter before retrieving and parsing cache value
      * @param key
      * @param filter
      * @param keyMustContainAllScopes
      * @returns
      */
    def accessTokenKeyMatchesFilter(inputKey: String, filter: CredentialFilter, keyMustContainAllScopes: Boolean): Boolean = js.native
    
    /**
      * Function which clears cache.
      */
    def clear(): js.Promise[Unit] = js.native
    
    /* protected */ var clientId: String = js.native
    
    /* private */ var commonLogger: Any = js.native
    
    /**
      * Function which returns boolean whether cache contains a specific key.
      * @param key
      */
    def containsKey(key: String): Boolean = js.native
    def containsKey(key: String, `type`: String): Boolean = js.native
    
    /**
      * Returns whether or not the given credential entity matches the filter
      * @param entity
      * @param filter
      * @returns
      */
    def credentialMatchesFilter(entity: ValidCredentialType, filter: CredentialFilter): Boolean = js.native
    
    /* protected */ var cryptoImpl: ICrypto = js.native
    
    /**
      * Retrieve AccessTokenEntity from cache
      * @param clientId
      * @param account
      * @param scopes
      * @param authScheme
      */
    def getAccessToken(account: AccountInfo, request: BaseAuthRequest): AccessTokenEntity | Null = js.native
    def getAccessToken(account: AccountInfo, request: BaseAuthRequest, tokenKeys: TokenKeys): AccessTokenEntity | Null = js.native
    
    /**
      * Gets all access tokens matching the filter
      * @param filter
      * @returns
      */
    def getAccessTokensByFilter(filter: CredentialFilter): js.Array[AccessTokenEntity] = js.native
    
    /* private */ var getAccountInfoFromEntity: Any = js.native
    
    /**
      * Function which retrieves all account keys from the cache
      */
    def getAccountKeys(): js.Array[String] = js.native
    
    /**
      * retrieve appMetadata matching all provided filters; if no filter is set, get all appMetadata
      * @param filter
      */
    def getAppMetadataFilteredBy(filter: AppMetadataFilter): AppMetadataCache = js.native
    
    /**
      * Support function to help match appMetadata
      * @param environment
      * @param clientId
      */
    /* private */ var getAppMetadataFilteredByInternal: Any = js.native
    
    /**
      * Retrieve IdTokenEntity from cache
      * @param clientId
      * @param account
      * @param inputRealm
      */
    def getIdToken(account: AccountInfo): IdTokenEntity | Null = js.native
    def getIdToken(account: AccountInfo, tokenKeys: TokenKeys): IdTokenEntity | Null = js.native
    
    /**
      * Gets all idTokens matching the given filter
      * @param filter
      * @returns
      */
    def getIdTokensByFilter(filter: CredentialFilter): js.Array[IdTokenEntity] = js.native
    def getIdTokensByFilter(filter: CredentialFilter, tokenKeys: TokenKeys): js.Array[IdTokenEntity] = js.native
    
    /**
      * Function which retrieves all current keys from the cache.
      */
    def getKeys(): js.Array[String] = js.native
    
    /**
      * Helper to retrieve the appropriate refresh token from cache
      * @param clientId
      * @param account
      * @param familyRT
      */
    def getRefreshToken(account: AccountInfo, familyRT: Boolean): RefreshTokenEntity | Null = js.native
    def getRefreshToken(account: AccountInfo, familyRT: Boolean, tokenKeys: TokenKeys): RefreshTokenEntity | Null = js.native
    
    /**
      * Function which retrieves all token keys from the cache
      */
    def getTokenKeys(): TokenKeys = js.native
    
    /**
      * Validate the cache key against filter before retrieving and parsing cache value
      * @param key
      * @param filter
      * @returns
      */
    def idTokenKeyMatchesFilter(inputKey: String, filter: CredentialFilter): Boolean = js.native
    
    /**
      * returns if a given cache entity is of the type appmetadata
      * @param key
      */
    /* private */ var isAppMetadata: Any = js.native
    
    /**
      * Return the family_id value associated  with FOCI
      * @param environment
      * @param clientId
      */
    def isAppMetadataFOCI(environment: String): Boolean = js.native
    
    /**
      * returns if a given cache entity is of the type authoritymetadata
      * @param key
      */
    /* protected */ def isAuthorityMetadata(key: String): Boolean = js.native
    
    /**
      * Returns true if the given key matches our credential key schema.
      * @param key
      */
    def isCredentialKey(key: String): Boolean = js.native
    
    /**
      * helper to match client ids
      * @param entity
      * @param clientId
      */
    /* private */ var matchClientId: Any = js.native
    
    /**
      * helper to match credential type
      * @param entity
      * @param credentialType
      */
    /* private */ var matchCredentialType: Any = js.native
    
    /**
      * helper to match environment
      * @param value
      * @param environment
      */
    /* private */ var matchEnvironment: Any = js.native
    
    /**
      * helper to match family ids
      * @param entity
      * @param familyId
      */
    /* private */ var matchFamilyId: Any = js.native
    
    /**
      * helper to match account ids
      * @param value
      * @param homeAccountId
      */
    /* private */ var matchHomeAccountId: Any = js.native
    
    /**
      * Returns true if the credential's keyId matches the one in the request, false otherwise
      * @param entity
      * @param tokenType
      */
    /* private */ var matchKeyId: Any = js.native
    
    /**
      * helper to match account ids
      * @param entity
      * @param localAccountId
      * @returns
      */
    /* private */ var matchLocalAccountId: Any = js.native
    
    /**
      * helper to match nativeAccountId
      * @param entity
      * @param nativeAccountId
      * @returns boolean indicating the match result
      */
    /* private */ var matchNativeAccountId: Any = js.native
    
    /**
      * helper to match realm
      * @param entity
      * @param realm
      */
    /* private */ var matchRealm: Any = js.native
    
    /**
      * Returns true if the target scopes are a subset of the current entity's scopes, false otherwise.
      * @param entity
      * @param target
      */
    /* private */ var matchTarget: Any = js.native
    
    /**
      * Returns true if the credential's tokenType or Authentication Scheme matches the one in the request, false otherwise
      * @param entity
      * @param tokenType
      */
    /* private */ var matchTokenType: Any = js.native
    
    /**
      * helper to match assertion
      * @param value
      * @param oboAssertion
      */
    /* private */ var matchUserAssertionHash: Any = js.native
    
    /**
      * helper to match usernames
      * @param entity
      * @param username
      * @returns
      */
    /* private */ var matchUsername: Any = js.native
    
    /**
      * Retrieve AccountEntity from cache
      * @param account
      */
    def readAccountFromCache(account: AccountInfo): AccountEntity | Null = js.native
    
    /**
      * Retrieve AppMetadataEntity from cache
      */
    def readAppMetadataFromCache(environment: String): AppMetadataEntity | Null = js.native
    
    /**
      * Retrieve the cached credentials into a cacherecord
      * @param account
      * @param clientId
      * @param scopes
      * @param environment
      * @param authScheme
      */
    def readCacheRecord(account: AccountInfo, request: BaseAuthRequest, environment: String): CacheRecord = js.native
    
    /**
      * Validate the cache key against filter before retrieving and parsing cache value
      * @param key
      * @param filter
      */
    def refreshTokenKeyMatchesFilter(inputKey: String, filter: CredentialFilter): Boolean = js.native
    
    /**
      * Removes all app metadata objects from cache.
      */
    def removeAppMetadata(): Boolean = js.native
    
    /**
      * Function to remove an item from cache given its key.
      * @param key
      */
    def removeItem(key: String): Unit = js.native
    
    /**
      * saves access token credential
      * @param credential
      */
    /* private */ var saveAccessToken: Any = js.native
    
    /**
      * Function which updates an outdated credential cache key
      */
    def updateCredentialCacheKey(currentCacheKey: String, credential: ValidCredentialType): String = js.native
  }
  /* static members */
  object CacheManager {
    
    @JSImport("@azure/msal-common/dist/cache/CacheManager", "CacheManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper to convert serialized data to object
      * @param obj
      * @param json
      */
    inline def toObject[T](obj: T, json: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(obj.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@azure/msal-common/dist/cache/CacheManager", "DefaultStorageClass")
  @js.native
  open class DefaultStorageClass protected () extends CacheManager {
    def this(clientId: String, cryptoImpl: ICrypto, logger: Logger) = this()
    
    def containsKey(): Boolean = js.native
    
    def getAccessTokenCredential(): AccessTokenEntity = js.native
    
    def getAccount(): AccountEntity = js.native
    
    def getAppMetadata(): AppMetadataEntity = js.native
    
    def getAuthorityMetadata(): AuthorityMetadataEntity | Null = js.native
    
    def getIdTokenCredential(): IdTokenEntity = js.native
    
    def getRefreshTokenCredential(): RefreshTokenEntity = js.native
    
    def getServerTelemetry(): ServerTelemetryEntity = js.native
    
    def getThrottlingCache(): ThrottlingEntity = js.native
    
    def removeItem(): Boolean = js.native
    
    def setAccessTokenCredential(): Unit = js.native
    
    def setAccount(): Unit = js.native
    
    def setAppMetadata(): Unit = js.native
    
    def setAuthorityMetadata(): Unit = js.native
    
    def setIdTokenCredential(): Unit = js.native
    
    def setRefreshTokenCredential(): Unit = js.native
    
    def setServerTelemetry(): Unit = js.native
    
    def setThrottlingCache(): Unit = js.native
    
    def updateCredentialCacheKey(): String = js.native
  }
}
