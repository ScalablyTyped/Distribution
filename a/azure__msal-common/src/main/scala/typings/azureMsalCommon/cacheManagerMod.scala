package typings.azureMsalCommon

import typings.azureMsalCommon.accessTokenEntityMod.AccessTokenEntity
import typings.azureMsalCommon.accountEntityMod.AccountEntity
import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.appMetadataEntityMod.AppMetadataEntity
import typings.azureMsalCommon.authorityMetadataEntityMod.AuthorityMetadataEntity
import typings.azureMsalCommon.baseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.cacheRecordMod.CacheRecord
import typings.azureMsalCommon.cacheTypesMod.AccountCache
import typings.azureMsalCommon.cacheTypesMod.AccountFilter
import typings.azureMsalCommon.cacheTypesMod.AppMetadataCache
import typings.azureMsalCommon.cacheTypesMod.AppMetadataFilter
import typings.azureMsalCommon.cacheTypesMod.CredentialCache
import typings.azureMsalCommon.cacheTypesMod.CredentialFilter
import typings.azureMsalCommon.cacheTypesMod.ValidCredentialType
import typings.azureMsalCommon.credentialEntityMod.CredentialEntity
import typings.azureMsalCommon.icachemanagerMod.ICacheManager
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.idTokenEntityMod.IdTokenEntity
import typings.azureMsalCommon.refreshTokenEntityMod.RefreshTokenEntity
import typings.azureMsalCommon.serverTelemetryEntityMod.ServerTelemetryEntity
import typings.azureMsalCommon.throttlingEntityMod.ThrottlingEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheManagerMod {
  
  @JSImport("@azure/msal-common/dist/cache/CacheManager", "CacheManager")
  @js.native
  abstract class CacheManager protected ()
    extends StObject
       with ICacheManager {
    def this(clientId: String, cryptoImpl: ICrypto) = this()
    
    /**
      * Function which clears cache.
      */
    def clear(): js.Promise[Unit] = js.native
    
    /* protected */ var clientId: String = js.native
    
    /**
      * Function which returns boolean whether cache contains a specific key.
      * @param key
      */
    def containsKey(key: String): Boolean = js.native
    def containsKey(key: String, `type`: String): Boolean = js.native
    
    /* protected */ var cryptoImpl: ICrypto = js.native
    
    /**
      * given an authority generates the cache key for authorityMetadata
      * @param authority
      */
    /* CompleteClass */
    override def generateAuthorityMetadataCacheKey(authority: String): String = js.native
    
    /**
      * fetch the idToken entity from the platform cache
      * @param accessTokenKey
      */
    /* CompleteClass */
    override def getAccessTokenCredential(accessTokenKey: String): AccessTokenEntity | Null = js.native
    
    /**
      * fetch the account entity from the platform cache
      * @param accountKey
      */
    /* CompleteClass */
    override def getAccount(accountKey: String): AccountEntity | Null = js.native
    
    /**
      * retrieve accounts matching all provided filters; if no filter is set, get all accounts
      * not checking for casing as keys are all generated in lower case, remember to convert to lower case if object properties are compared
      * @param homeAccountId
      * @param environment
      * @param realm
      */
    def getAccountsFilteredBy(): AccountCache = js.native
    /**
      * retrieve accounts matching all provided filters; if no filter is set, get all accounts
      * @param homeAccountId
      * @param environment
      * @param realm
      */
    /* CompleteClass */
    override def getAccountsFilteredBy(filter: AccountFilter): AccountCache = js.native
    
    /**
      * retrieve accounts matching all provided filters; if no filter is set, get all accounts
      * not checking for casing as keys are all generated in lower case, remember to convert to lower case if object properties are compared
      * @param homeAccountId
      * @param environment
      * @param realm
      */
    /* private */ var getAccountsFilteredByInternal: Any = js.native
    
    /**
      * Returns all accounts in cache
      */
    /* CompleteClass */
    override def getAllAccounts(): js.Array[AccountInfo] = js.native
    
    /**
      * fetch appMetadata entity from the platform cache
      * @param appMetadataKey
      */
    /* CompleteClass */
    override def getAppMetadata(appMetadataKey: String): AppMetadataEntity | Null = js.native
    
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
      * fetch cloud discovery metadata entity from the platform cache
      * @param key
      */
    /* CompleteClass */
    override def getAuthorityMetadata(key: String): AuthorityMetadataEntity | Null = js.native
    
    /**
      * Provide an alias to find a matching AuthorityMetadataEntity in cache
      * @param host
      */
    /* CompleteClass */
    override def getAuthorityMetadataByAlias(host: String): AuthorityMetadataEntity | Null = js.native
    
    /**
      * Get cache keys for authority metadata
      */
    /* CompleteClass */
    override def getAuthorityMetadataKeys(): js.Array[String] = js.native
    
    /**
      * retrieve credentials matching all provided filters; if no filter is set, get all credentials
      * @param homeAccountId
      * @param environment
      * @param credentialType
      * @param clientId
      * @param realm
      * @param target
      */
    /* CompleteClass */
    override def getCredentialsFilteredBy(filter: CredentialFilter): CredentialCache = js.native
    
    /**
      * Support function to help match credentials
      * @param homeAccountId
      * @param environment
      * @param credentialType
      * @param clientId
      * @param realm
      * @param target
      * @param userAssertionHash
      * @param tokenType
      */
    /* private */ var getCredentialsFilteredByInternal: Any = js.native
    
    /**
      * fetch the idToken entity from the platform cache
      * @param idTokenKey
      */
    /* CompleteClass */
    override def getIdTokenCredential(idTokenKey: String): IdTokenEntity | Null = js.native
    
    /**
      * Function which retrieves all current keys from the cache.
      */
    def getKeys(): js.Array[String] = js.native
    
    /**
      * fetch the idToken entity from the platform cache
      * @param refreshTokenKey
      */
    /* CompleteClass */
    override def getRefreshTokenCredential(refreshTokenKey: String): RefreshTokenEntity | Null = js.native
    
    /**
      * fetch server telemetry entity from the platform cache
      * @param serverTelemetryKey
      */
    /* CompleteClass */
    override def getServerTelemetry(serverTelemetryKey: String): ServerTelemetryEntity | Null = js.native
    
    /**
      * Returns the specific credential (IdToken/AccessToken/RefreshToken) from the cache
      * @param key
      * @param credType
      */
    /* private */ var getSpecificCredential: Any = js.native
    
    /**
      * fetch throttling entity from the platform cache
      * @param throttlingCacheKey
      */
    /* CompleteClass */
    override def getThrottlingCache(throttlingCacheKey: String): ThrottlingEntity | Null = js.native
    
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
    def isAppMetadataFOCI(environment: String, clientId: String): Boolean = js.native
    
    /**
      * returns if a given cache entity is of the type authoritymetadata
      * @param key
      */
    /* protected */ def isAuthorityMetadata(key: String): Boolean = js.native
    
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
      * Retrieve AccessTokenEntity from cache
      * @param clientId
      * @param account
      * @param scopes
      * @param authScheme
      */
    def readAccessTokenFromCache(clientId: String, account: AccountInfo, request: BaseAuthRequest): AccessTokenEntity | Null = js.native
    
    /**
      * Retrieve AccountEntity from cache
      * @param account
      */
    def readAccountFromCache(account: AccountInfo): AccountEntity | Null = js.native
    
    /**
      * Retrieve AccountEntity from cache
      * @param nativeAccountId
      * @returns AccountEntity or Null
      */
    def readAccountFromCacheWithNativeAccountId(nativeAccountId: String): AccountEntity | Null = js.native
    
    /**
      * Retrieve AppMetadataEntity from cache
      */
    def readAppMetadataFromCache(environment: String, clientId: String): AppMetadataEntity | Null = js.native
    
    /**
      * Retrieve the cached credentials into a cacherecord
      * @param account
      * @param clientId
      * @param scopes
      * @param environment
      * @param authScheme
      */
    def readCacheRecord(account: AccountInfo, clientId: String, request: BaseAuthRequest, environment: String): CacheRecord = js.native
    
    /**
      * Retrieve IdTokenEntity from cache
      * @param clientId
      * @param account
      * @param inputRealm
      */
    def readIdTokenFromCache(clientId: String, account: AccountInfo): IdTokenEntity | Null = js.native
    
    /**
      * Helper to retrieve the appropriate refresh token from cache
      * @param clientId
      * @param account
      * @param familyRT
      */
    def readRefreshTokenFromCache(clientId: String, account: AccountInfo, familyRT: Boolean): RefreshTokenEntity | Null = js.native
    
    /**
      * returns a boolean if the given account is removed
      * @param account
      */
    /* CompleteClass */
    override def removeAccount(accountKey: String): js.Promise[Boolean] = js.native
    
    /**
      * returns a boolean if the given account is removed
      * @param account
      */
    /* CompleteClass */
    override def removeAccountContext(account: AccountEntity): js.Promise[Boolean] = js.native
    
    /**
      * Removes all accounts and related tokens from cache.
      */
    /* CompleteClass */
    override def removeAllAccounts(): js.Promise[Boolean] = js.native
    
    /**
      * Removes all app metadata objects from cache.
      */
    def removeAppMetadata(): Boolean = js.native
    
    /**
      * returns a boolean if the given credential is removed
      * @param credential
      */
    /* CompleteClass */
    override def removeCredential(credential: CredentialEntity): js.Promise[Boolean] = js.native
    
    /**
      * Function to remove an item from cache given its key.
      * @param key
      */
    def removeItem(key: String): Boolean = js.native
    def removeItem(key: String, `type`: String): Boolean = js.native
    
    /**
      * saves access token credential
      * @param credential
      */
    /* private */ var saveAccessToken: Any = js.native
    
    /**
      * saves a cache record
      * @param cacheRecord
      */
    /* CompleteClass */
    override def saveCacheRecord(cacheRecord: CacheRecord): js.Promise[Unit] = js.native
    
    /**
      * set idToken entity to the platform cache
      * @param accessToken
      */
    /* CompleteClass */
    override def setAccessTokenCredential(accessToken: AccessTokenEntity): Unit = js.native
    
    /**
      * set account entity in the platform cache
      * @param account
      */
    /* CompleteClass */
    override def setAccount(account: AccountEntity): Unit = js.native
    
    /**
      * set appMetadata entity to the platform cache
      * @param appMetadata
      */
    /* CompleteClass */
    override def setAppMetadata(appMetadata: AppMetadataEntity): Unit = js.native
    
    /**
      * set cloud discovery metadata entity to the platform cache
      * @param key
      * @param value
      */
    /* CompleteClass */
    override def setAuthorityMetadata(key: String, value: AuthorityMetadataEntity): Unit = js.native
    
    /**
      * set idToken entity to the platform cache
      * @param idToken
      */
    /* CompleteClass */
    override def setIdTokenCredential(idToken: IdTokenEntity): Unit = js.native
    
    /**
      * set idToken entity to the platform cache
      * @param refreshToken
      */
    /* CompleteClass */
    override def setRefreshTokenCredential(refreshToken: RefreshTokenEntity): Unit = js.native
    
    /**
      * set server telemetry entity to the platform cache
      * @param serverTelemetryKey
      * @param serverTelemetry
      */
    /* CompleteClass */
    override def setServerTelemetry(serverTelemetryKey: String, serverTelemetry: ServerTelemetryEntity): Unit = js.native
    
    /**
      * set throttling entity to the platform cache
      * @param throttlingCacheKey
      * @param throttlingCache
      */
    /* CompleteClass */
    override def setThrottlingCache(throttlingCacheKey: String, throttlingCache: ThrottlingEntity): Unit = js.native
    
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
    def this(clientId: String, cryptoImpl: ICrypto) = this()
    
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
