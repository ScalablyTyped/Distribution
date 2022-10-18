package typings.azureMsalCommon

import typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken
import typings.azureMsalCommon.distAuthorityAuthorityMod.Authority
import typings.azureMsalCommon.distCacheCacheManagerMod.CacheManager
import typings.azureMsalCommon.distCacheEntitiesCacheRecordMod.CacheRecord
import typings.azureMsalCommon.distCacheInterfaceIcachepluginMod.ICachePlugin
import typings.azureMsalCommon.distCacheInterfaceIserializabletokencacheMod.ISerializableTokenCache
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distLoggerLoggerMod.Logger
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distResponseAuthorizationCodePayloadMod.AuthorizationCodePayload
import typings.azureMsalCommon.distResponseServerAuthorizationCodeResponseMod.ServerAuthorizationCodeResponse
import typings.azureMsalCommon.distResponseServerAuthorizationTokenResponseMod.ServerAuthorizationTokenResponse
import typings.azureMsalCommon.distUtilsProtocolUtilsMod.RequestStateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResponseResponseHandlerMod {
  
  @JSImport("@azure/msal-common/dist/response/ResponseHandler", "ResponseHandler")
  @js.native
  open class ResponseHandler protected () extends StObject {
    def this(clientId: String, cacheStorage: CacheManager, cryptoObj: ICrypto, logger: Logger) = this()
    def this(
      clientId: String,
      cacheStorage: CacheManager,
      cryptoObj: ICrypto,
      logger: Logger,
      serializableCache: ISerializableTokenCache
    ) = this()
    def this(
      clientId: String,
      cacheStorage: CacheManager,
      cryptoObj: ICrypto,
      logger: Logger,
      serializableCache: Null,
      persistencePlugin: ICachePlugin
    ) = this()
    def this(
      clientId: String,
      cacheStorage: CacheManager,
      cryptoObj: ICrypto,
      logger: Logger,
      serializableCache: ISerializableTokenCache,
      persistencePlugin: ICachePlugin
    ) = this()
    
    /* private */ var cacheStorage: Any = js.native
    
    /* private */ var clientId: Any = js.native
    
    /* private */ var cryptoObj: Any = js.native
    
    /**
      * Generate Account
      * @param serverTokenResponse
      * @param idToken
      * @param authority
      */
    /* private */ var generateAccountEntity: Any = js.native
    
    /**
      * Generates CacheRecord
      * @param serverTokenResponse
      * @param idTokenObj
      * @param authority
      */
    /* private */ var generateCacheRecord: Any = js.native
    
    /**
      * Returns a constructed token response based on given string. Also manages the cache updates and cleanups.
      * @param serverTokenResponse
      * @param authority
      */
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: Unit,
      userAssertionHash: String
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: Unit,
      userAssertionHash: String,
      handlingRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: Unit,
      userAssertionHash: String,
      handlingRefreshTokenResponse: Boolean,
      forceCacheRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: Unit,
      userAssertionHash: String,
      handlingRefreshTokenResponse: Unit,
      forceCacheRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: Unit,
      userAssertionHash: Unit,
      handlingRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: Unit,
      userAssertionHash: Unit,
      handlingRefreshTokenResponse: Boolean,
      forceCacheRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: Unit,
      userAssertionHash: Unit,
      handlingRefreshTokenResponse: Unit,
      forceCacheRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: AuthorizationCodePayload
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: AuthorizationCodePayload,
      userAssertionHash: String
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: AuthorizationCodePayload,
      userAssertionHash: String,
      handlingRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: AuthorizationCodePayload,
      userAssertionHash: String,
      handlingRefreshTokenResponse: Boolean,
      forceCacheRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: AuthorizationCodePayload,
      userAssertionHash: String,
      handlingRefreshTokenResponse: Unit,
      forceCacheRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: AuthorizationCodePayload,
      userAssertionHash: Unit,
      handlingRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: AuthorizationCodePayload,
      userAssertionHash: Unit,
      handlingRefreshTokenResponse: Boolean,
      forceCacheRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    def handleServerTokenResponse(
      serverTokenResponse: ServerAuthorizationTokenResponse,
      authority: Authority,
      reqTimestamp: Double,
      request: BaseAuthRequest,
      authCodePayload: AuthorizationCodePayload,
      userAssertionHash: Unit,
      handlingRefreshTokenResponse: Unit,
      forceCacheRefreshTokenResponse: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    
    /* private */ var homeAccountIdentifier: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var persistencePlugin: Any = js.native
    
    /* private */ var serializableCache: Any = js.native
    
    /**
      * Function which validates server authorization code response.
      * @param serverResponseHash
      * @param cachedState
      * @param cryptoObj
      */
    def validateServerAuthorizationCodeResponse(serverResponseHash: ServerAuthorizationCodeResponse, cachedState: String, cryptoObj: ICrypto): Unit = js.native
    
    /**
      * Function which validates server authorization token response.
      * @param serverResponse
      */
    def validateTokenResponse(serverResponse: ServerAuthorizationTokenResponse): Unit = js.native
  }
  /* static members */
  object ResponseHandler {
    
    @JSImport("@azure/msal-common/dist/response/ResponseHandler", "ResponseHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an @AuthenticationResult from @CacheRecord , @IdToken , and a boolean that states whether or not the result is from cache.
      *
      * Optionally takes a state string that is set as-is in the response.
      *
      * @param cacheRecord
      * @param idTokenObj
      * @param fromTokenCache
      * @param stateString
      */
    inline def generateAuthenticationResult(
      cryptoObj: ICrypto,
      authority: Authority,
      cacheRecord: CacheRecord,
      fromTokenCache: Boolean,
      request: BaseAuthRequest
    ): js.Promise[AuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthenticationResult")(cryptoObj.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cacheRecord.asInstanceOf[js.Any], fromTokenCache.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticationResult]]
    inline def generateAuthenticationResult(
      cryptoObj: ICrypto,
      authority: Authority,
      cacheRecord: CacheRecord,
      fromTokenCache: Boolean,
      request: BaseAuthRequest,
      idTokenObj: Unit,
      requestState: Unit,
      code: String
    ): js.Promise[AuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthenticationResult")(cryptoObj.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cacheRecord.asInstanceOf[js.Any], fromTokenCache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], idTokenObj.asInstanceOf[js.Any], requestState.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticationResult]]
    inline def generateAuthenticationResult(
      cryptoObj: ICrypto,
      authority: Authority,
      cacheRecord: CacheRecord,
      fromTokenCache: Boolean,
      request: BaseAuthRequest,
      idTokenObj: Unit,
      requestState: RequestStateObject
    ): js.Promise[AuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthenticationResult")(cryptoObj.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cacheRecord.asInstanceOf[js.Any], fromTokenCache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], idTokenObj.asInstanceOf[js.Any], requestState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticationResult]]
    inline def generateAuthenticationResult(
      cryptoObj: ICrypto,
      authority: Authority,
      cacheRecord: CacheRecord,
      fromTokenCache: Boolean,
      request: BaseAuthRequest,
      idTokenObj: Unit,
      requestState: RequestStateObject,
      code: String
    ): js.Promise[AuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthenticationResult")(cryptoObj.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cacheRecord.asInstanceOf[js.Any], fromTokenCache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], idTokenObj.asInstanceOf[js.Any], requestState.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticationResult]]
    inline def generateAuthenticationResult(
      cryptoObj: ICrypto,
      authority: Authority,
      cacheRecord: CacheRecord,
      fromTokenCache: Boolean,
      request: BaseAuthRequest,
      idTokenObj: AuthToken
    ): js.Promise[AuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthenticationResult")(cryptoObj.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cacheRecord.asInstanceOf[js.Any], fromTokenCache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], idTokenObj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticationResult]]
    inline def generateAuthenticationResult(
      cryptoObj: ICrypto,
      authority: Authority,
      cacheRecord: CacheRecord,
      fromTokenCache: Boolean,
      request: BaseAuthRequest,
      idTokenObj: AuthToken,
      requestState: Unit,
      code: String
    ): js.Promise[AuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthenticationResult")(cryptoObj.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cacheRecord.asInstanceOf[js.Any], fromTokenCache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], idTokenObj.asInstanceOf[js.Any], requestState.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticationResult]]
    inline def generateAuthenticationResult(
      cryptoObj: ICrypto,
      authority: Authority,
      cacheRecord: CacheRecord,
      fromTokenCache: Boolean,
      request: BaseAuthRequest,
      idTokenObj: AuthToken,
      requestState: RequestStateObject
    ): js.Promise[AuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthenticationResult")(cryptoObj.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cacheRecord.asInstanceOf[js.Any], fromTokenCache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], idTokenObj.asInstanceOf[js.Any], requestState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticationResult]]
    inline def generateAuthenticationResult(
      cryptoObj: ICrypto,
      authority: Authority,
      cacheRecord: CacheRecord,
      fromTokenCache: Boolean,
      request: BaseAuthRequest,
      idTokenObj: AuthToken,
      requestState: RequestStateObject,
      code: String
    ): js.Promise[AuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthenticationResult")(cryptoObj.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], cacheRecord.asInstanceOf[js.Any], fromTokenCache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], idTokenObj.asInstanceOf[js.Any], requestState.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticationResult]]
  }
}
