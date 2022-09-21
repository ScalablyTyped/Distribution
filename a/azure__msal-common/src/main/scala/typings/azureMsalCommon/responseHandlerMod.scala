package typings.azureMsalCommon

import typings.azureMsalCommon.authTokenMod.AuthToken
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.authorityMod.Authority
import typings.azureMsalCommon.authorizationCodePayloadMod.AuthorizationCodePayload
import typings.azureMsalCommon.baseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.cacheManagerMod.CacheManager
import typings.azureMsalCommon.cacheRecordMod.CacheRecord
import typings.azureMsalCommon.icachepluginMod.ICachePlugin
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.iserializabletokencacheMod.ISerializableTokenCache
import typings.azureMsalCommon.loggerMod.Logger
import typings.azureMsalCommon.protocolUtilsMod.RequestStateObject
import typings.azureMsalCommon.serverAuthorizationCodeResponseMod.ServerAuthorizationCodeResponse
import typings.azureMsalCommon.serverAuthorizationTokenResponseMod.ServerAuthorizationTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseHandlerMod {
  
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
