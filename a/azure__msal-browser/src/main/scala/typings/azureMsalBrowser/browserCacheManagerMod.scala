package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.PartialOmitAccountInfoidT
import typings.azureMsalBrowser.anon.RequiredCacheOptions
import typings.azureMsalBrowser.browserConstantsMod.BrowserCacheLocation
import typings.azureMsalBrowser.browserConstantsMod.InteractionType
import typings.azureMsalBrowser.iwindowstorageMod.IWindowStorage
import typings.azureMsalBrowser.memoryStorageMod.MemoryStorage
import typings.azureMsalBrowser.nativeRequestMod.NativeTokenRequest
import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.commonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.mod.AccessTokenEntity
import typings.azureMsalCommon.mod.AccountEntity
import typings.azureMsalCommon.mod.AppMetadataEntity
import typings.azureMsalCommon.mod.AuthorityMetadataEntity
import typings.azureMsalCommon.mod.CacheManager
import typings.azureMsalCommon.mod.IdTokenEntity
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.RefreshTokenEntity
import typings.azureMsalCommon.mod.ServerTelemetryEntity
import typings.azureMsalCommon.mod.ThrottlingEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserCacheManagerMod {
  
  @JSImport("@azure/msal-browser/dist/cache/BrowserCacheManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/msal-browser/dist/cache/BrowserCacheManager", "BrowserCacheManager")
  @js.native
  open class BrowserCacheManager protected () extends CacheManager {
    def this(clientId: String, cacheConfig: RequiredCacheOptions, cryptoImpl: ICrypto, logger: Logger) = this()
    
    /* protected */ val COOKIE_LIFE_MULTIPLIER: Double = js.native
    
    /* protected */ var browserStorage: IWindowStorage[String] = js.native
    
    def cacheCodeRequest(authCodeRequest: CommonAuthorizationCodeRequest, browserCrypto: ICrypto): Unit = js.native
    
    /* protected */ var cacheConfig: RequiredCacheOptions = js.native
    
    /**
      * Looks in temporary cache for any state values with the provided interactionType and removes all temporary cache items for that state
      * Used in scenarios where temp cache needs to be cleaned but state is not known, such as clicking browser back button.
      * @param interactionType
      */
    def cleanRequestByInteractionType(interactionType: InteractionType): Unit = js.native
    
    /**
      * Removes temporary cache for the provided state
      * @param stateString
      */
    def cleanRequestByState(stateString: String): Unit = js.native
    
    /**
      * Clear an item in the cookies by key
      * @param cookieName
      */
    def clearItemCookie(cookieName: String): Unit = js.native
    
    /**
      * Clear all msal-related cookies currently set in the browser. Should only be used to clear temporary cache items.
      */
    def clearMsalCookies(): Unit = js.native
    
    /**
      * Create authorityKey to cache authority
      * @param state
      */
    def generateAuthorityKey(stateString: String): String = js.native
    
    /**
      * Prepend msal.<client-id> to each key; Skip for any JSON object as Key (defined schemas do not need the key appended: AccessToken Keys or the upcoming schema)
      * @param key
      * @param addInstanceId
      */
    def generateCacheKey(key: String): String = js.native
    
    /**
      * Create Nonce key to cache nonce
      * @param state
      */
    def generateNonceKey(stateString: String): String = js.native
    
    /**
      * Creates full cache key for the request state
      * @param stateString State string for the request
      */
    def generateStateKey(stateString: String): String = js.native
    
    /**
      * Gets a list of accounts that match all of the filters provided
      * @param account
      */
    def getAccountInfoByFilter(accountFilter: PartialOmitAccountInfoidT): js.Array[AccountInfo] = js.native
    
    /**
      * Checks the cache for accounts matching loginHint or SID
      * @param loginHint
      * @param sid
      */
    def getAccountInfoByHints(): AccountInfo | Null = js.native
    def getAccountInfoByHints(loginHint: String): AccountInfo | Null = js.native
    def getAccountInfoByHints(loginHint: String, sid: String): AccountInfo | Null = js.native
    def getAccountInfoByHints(loginHint: Unit, sid: String): AccountInfo | Null = js.native
    
    /**
      * Gets the active account
      */
    def getActiveAccount(): AccountInfo | Null = js.native
    
    /**
      * Gets the cache object referenced by the browser
      */
    def getCache(): js.Object = js.native
    
    /**
      * Gets the cached authority based on the cached state. Returns empty if no cached state found.
      */
    def getCachedAuthority(cachedState: String): String | Null = js.native
    
    /**
      * Gets cached native request for redirect flows
      */
    def getCachedNativeRequest(): NativeTokenRequest | Null = js.native
    
    /**
      * Gets the token exchange parameters from the cache. Throws an error if nothing is found.
      */
    def getCachedRequest(state: String, browserCrypto: ICrypto): CommonAuthorizationCodeRequest = js.native
    
    /**
      * Get cookie expiration time
      * @param cookieLifeDays
      */
    def getCookieExpirationTime(cookieLifeDays: Double): String = js.native
    
    def getInteractionInProgress(): String | Null = js.native
    
    /**
      * fetches the entry from the browser storage based off the key
      * @param key
      */
    def getItem(key: String): String | Null = js.native
    
    /**
      * Get one item by key from cookies
      * @param cookieName
      */
    def getItemCookie(cookieName: String): String = js.native
    
    /**
      * Returns username retrieved from ADAL or MSAL v1 idToken
      */
    def getLegacyLoginHint(): String | Null = js.native
    
    /**
      * Gets cache item with given key.
      * Will retrieve from cookies if storeAuthStateInCookie is set to true.
      * @param key
      */
    def getTemporaryCache(cacheKey: String): String | Null = js.native
    def getTemporaryCache(cacheKey: String, generateKey: Boolean): String | Null = js.native
    
    /**
      * Returns wrapper metadata from in-memory storage
      */
    def getWrapperMetadata(): js.Tuple2[String, String] = js.native
    
    /* protected */ var internalStorage: MemoryStorage[String] = js.native
    
    def isInteractionInProgress(): Boolean = js.native
    def isInteractionInProgress(matchClientId: Boolean): Boolean = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * Migrate all old cache entries to new schema. No rollback supported.
      * @param storeAuthStateInCookie
      */
    /* protected */ def migrateCacheEntries(): Unit = js.native
    
    /**
      * Utility function to help with migration.
      * @param newKey
      * @param value
      * @param storeAuthStateInCookie
      */
    /* protected */ def migrateCacheEntry(newKey: String): Unit = js.native
    /* protected */ def migrateCacheEntry(newKey: String, value: String): Unit = js.native
    
    /**
      * Reset all temporary cache items
      * @param state
      */
    def resetRequestCache(state: String): Unit = js.native
    
    /**
      * set accessToken credential to the platform cache
      * @param accessToken
      */
    def setAccessTokenCredential(accessToken: AccessTokenEntity): Unit = js.native
    
    /**
      * set account entity in the platform cache
      * @param key
      * @param value
      */
    def setAccount(account: AccountEntity): Unit = js.native
    
    /**
      * Sets the active account's localAccountId in cache
      * @param account
      */
    def setActiveAccount(): Unit = js.native
    def setActiveAccount(account: AccountInfo): Unit = js.native
    
    /**
      * set appMetadata entity to the platform cache
      * @param appMetadata
      */
    def setAppMetadata(appMetadata: AppMetadataEntity): Unit = js.native
    
    /**
      *
      * @param entity
      */
    def setAuthorityMetadata(key: String, entity: AuthorityMetadataEntity): Unit = js.native
    
    /**
      * interface compat, we cannot overwrite browser cache; Functionality is supported by individual entities in browser
      */
    def setCache(): Unit = js.native
    
    /**
      * set IdToken credential to the platform cache
      * @param idToken
      */
    def setIdTokenCredential(idToken: IdTokenEntity): Unit = js.native
    
    def setInteractionInProgress(inProgress: Boolean): Unit = js.native
    
    /**
      * sets the entry in the browser storage
      * @param key
      * @param value
      */
    def setItem(key: String, value: String): Unit = js.native
    
    /**
      * Add value to cookies
      * @param cookieName
      * @param cookieValue
      * @param expires
      */
    def setItemCookie(cookieName: String, cookieValue: String): Unit = js.native
    def setItemCookie(cookieName: String, cookieValue: String, expires: Double): Unit = js.native
    
    /**
      * set refreshToken credential to the platform cache
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
      * Sets the cache item with the key and value given.
      * Stores in cookie if storeAuthStateInCookie is set to true.
      * This can cause cookie overflow if used incorrectly.
      * @param key
      * @param value
      */
    def setTemporaryCache(cacheKey: String, value: String): Unit = js.native
    def setTemporaryCache(cacheKey: String, value: String, generateKey: Boolean): Unit = js.native
    
    /**
      * set throttling entity to the platform cache
      * @param throttlingCacheKey
      * @param throttlingCache
      */
    def setThrottlingCache(throttlingCacheKey: String, throttlingCache: ThrottlingEntity): Unit = js.native
    
    /**
      * Sets wrapper metadata in memory
      * @param wrapperSKU
      * @param wrapperVersion
      */
    def setWrapperMetadata(wrapperSKU: String, wrapperVersion: String): Unit = js.native
    
    /* protected */ def setupBrowserStorage(cacheLocation: String): IWindowStorage[String] = js.native
    /**
      * Returns a window storage class implementing the IWindowStorage interface that corresponds to the configured cacheLocation.
      * @param cacheLocation
      */
    /* protected */ def setupBrowserStorage(cacheLocation: BrowserCacheLocation): IWindowStorage[String] = js.native
    
    /* protected */ def setupTemporaryCacheStorage(cacheLocation: String): IWindowStorage[String] = js.native
    /**
      *
      * @param cacheLocation
      */
    /* protected */ def setupTemporaryCacheStorage(cacheLocation: BrowserCacheLocation): IWindowStorage[String] = js.native
    
    /* protected */ var temporaryCacheStorage: IWindowStorage[String] = js.native
    
    /**
      * Updates account, authority, and state in cache
      * @param serverAuthenticationRequest
      * @param account
      */
    def updateCacheEntries(state: String, nonce: String, authorityInstance: String, loginHint: String): Unit = js.native
    def updateCacheEntries(state: String, nonce: String, authorityInstance: String, loginHint: String, account: AccountInfo): Unit = js.native
    
    /**
      * Parses passed value as JSON object, JSON.parse() will throw an error.
      * @param input
      */
    /* protected */ def validateAndParseJson(jsonValue: String): js.Object | Null = js.native
  }
  
  inline def DEFAULT_BROWSER_CACHE_MANAGER(clientId: String, logger: Logger): BrowserCacheManager = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_BROWSER_CACHE_MANAGER")(clientId.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[BrowserCacheManager]
}
