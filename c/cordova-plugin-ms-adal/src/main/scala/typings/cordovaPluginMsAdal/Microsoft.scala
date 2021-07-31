package typings.cordovaPluginMsAdal

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Microsoft {
  
  object ADAL {
    
    @js.native
    trait AuthenticationContext extends StObject {
      
      /**
        * Acquires token using interactive flow if needed. It checks the cache to return existing result
        * if not expired. It tries to use refresh token if available. If it fails to get token with
        * refresh token, it will remove this refresh token from cache and start authentication.
        *
        * @param   {String}  resourceUrl Resource identifier
        * @param   {String}  clientId    Client (application) identifier
        * @param   {String}  redirectUrl Redirect url for this application
        * @param   {String}  userId      User identifier (optional)
        * @param   {String}  extraQueryParameters
        *                                Extra query parameters (optional)
        *                                Parameters should be escaped before passing to this method (e.g. using 'encodeURI()')
        *
        * @returns {Promise} Promise either fulfilled with AuthenticationResult object or rejected with error
        */
      def acquireTokenAsync(resourceUrl: String, clientId: String, redirectUrl: String): PromiseAuthenticationResult = js.native
      def acquireTokenAsync(resourceUrl: String, clientId: String, redirectUrl: String, userId: String): PromiseAuthenticationResult = js.native
      def acquireTokenAsync(
        resourceUrl: String,
        clientId: String,
        redirectUrl: String,
        userId: String,
        extraQueryParameters: String
      ): PromiseAuthenticationResult = js.native
      def acquireTokenAsync(
        resourceUrl: String,
        clientId: String,
        redirectUrl: String,
        userId: Unit,
        extraQueryParameters: String
      ): PromiseAuthenticationResult = js.native
      
      /**
        * Acquires token WITHOUT using interactive flow. It checks the cache to return existing result
        * if not expired. It tries to use refresh token if available. If it fails to get token without
        * displaying UI it will fail. This method guarantees that no UI will be shown to user.
        *
        * @param   {String}  resourceUrl Resource identifier
        * @param   {String}  clientId    Client (application) identifier
        * @param   {String}  userId      User identifier (optional)
        *
        * @returns {Promise} Promise either fulfilled with AuthenticationResult object or rejected with error
        */
      def acquireTokenSilentAsync(resourceUrl: String, clientId: String, userId: String): PromiseAuthenticationResult = js.native
      
      var authority: String = js.native
      
      var tokenCache: TokenCache = js.native
      
      var validateAuthority: Boolean = js.native
    }
    
    trait AuthenticationResult extends StObject {
      
      var accessToken: String
      
      var accessTokenType: String
      
      /**
        * Creates authorization header for web requests.
        *
        * @returns {String} The authorization header.
        */
      def createAuthorizationHeader(): String
      
      var expiresOn: Date
      
      var idToken: String
      
      var isMultipleResourceRefreshToken: Boolean
      
      var status: String
      
      var statusCode: String
      
      var tenantId: String
      
      var userInfo: UserInfo
    }
    object AuthenticationResult {
      
      @scala.inline
      def apply(
        accessToken: String,
        accessTokenType: String,
        createAuthorizationHeader: () => String,
        expiresOn: Date,
        idToken: String,
        isMultipleResourceRefreshToken: Boolean,
        status: String,
        statusCode: String,
        tenantId: String,
        userInfo: UserInfo
      ): AuthenticationResult = {
        val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accessTokenType = accessTokenType.asInstanceOf[js.Any], createAuthorizationHeader = js.Any.fromFunction0(createAuthorizationHeader), expiresOn = expiresOn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], isMultipleResourceRefreshToken = isMultipleResourceRefreshToken.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuthenticationResult]
      }
      
      @scala.inline
      implicit class AuthenticationResultMutableBuilder[Self <: AuthenticationResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccessTokenType(value: String): Self = StObject.set(x, "accessTokenType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateAuthorizationHeader(value: () => String): Self = StObject.set(x, "createAuthorizationHeader", js.Any.fromFunction0(value))
        
        @scala.inline
        def setExpiresOn(value: Date): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsMultipleResourceRefreshToken(value: Boolean): Self = StObject.set(x, "isMultipleResourceRefreshToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Promise extends StObject {
      
      def `then`(doneCallBack: js.Function0[js.Any]): js.Any = js.native
      def `then`(doneCallBack: js.Function0[js.Any], failCallBack: js.Function1[/* message */ String, js.Any]): js.Any = js.native
    }
    
    @js.native
    trait PromiseAuthenticationContext extends StObject {
      
      def `then`(doneCallBack: js.Function1[/* context */ AuthenticationContext, js.Any]): js.Any = js.native
      def `then`(
        doneCallBack: js.Function1[/* context */ AuthenticationContext, js.Any],
        failCallBack: js.Function1[/* message */ String, js.Any]
      ): js.Any = js.native
    }
    
    @js.native
    trait PromiseAuthenticationResult extends StObject {
      
      def `then`(doneCallBack: js.Function1[/* context */ AuthenticationResult, js.Any]): js.Any = js.native
      def `then`(
        doneCallBack: js.Function1[/* context */ AuthenticationResult, js.Any],
        failCallBack: js.Function1[/* message */ String, js.Any]
      ): js.Any = js.native
    }
    
    @js.native
    trait PromiseTokenCacheItems extends StObject {
      
      def `then`(doneCallBack: js.Function1[/* tokenCacheItems */ js.Array[TokenCacheItem], js.Any]): js.Any = js.native
      def `then`(
        doneCallBack: js.Function1[/* tokenCacheItems */ js.Array[TokenCacheItem], js.Any],
        failCallBack: js.Function1[/* message */ String, js.Any]
      ): js.Any = js.native
    }
    
    trait TokenCache extends StObject {
      
      /**
        * Clears the cache by deleting all the items.
        *
        * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
        */
      def clear(): Promise
      
      var contextAuthority: String
      
      /**
        * Deletes cached item.
        *
        * @param   {TokenCacheItem}  item Cached item to delete from cache
        *
        * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
        */
      def deleteItem(item: TokenCacheItem): Promise
      
      /**
        * Gets all cached items.
        *
        * @returns {Promise} Promise either fulfilled with array of cached items or rejected with error.
        */
      def readItems(): PromiseTokenCacheItems
    }
    object TokenCache {
      
      @scala.inline
      def apply(
        clear: () => Promise,
        contextAuthority: String,
        deleteItem: TokenCacheItem => Promise,
        readItems: () => PromiseTokenCacheItems
      ): TokenCache = {
        val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), contextAuthority = contextAuthority.asInstanceOf[js.Any], deleteItem = js.Any.fromFunction1(deleteItem), readItems = js.Any.fromFunction0(readItems))
        __obj.asInstanceOf[TokenCache]
      }
      
      @scala.inline
      implicit class TokenCacheMutableBuilder[Self <: TokenCache] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClear(value: () => Promise): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
        
        @scala.inline
        def setContextAuthority(value: String): Self = StObject.set(x, "contextAuthority", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteItem(value: TokenCacheItem => Promise): Self = StObject.set(x, "deleteItem", js.Any.fromFunction1(value))
        
        @scala.inline
        def setReadItems(value: () => PromiseTokenCacheItems): Self = StObject.set(x, "readItems", js.Any.fromFunction0(value))
      }
    }
    
    trait TokenCacheItem extends StObject {
      
      var accessToken: String
      
      var authority: String
      
      var clientId: String
      
      var displayableId: String
      
      var expiresOn: Date
      
      var isMultipleResourceRefreshToken: Boolean
      
      var resource: String
      
      var tenantId: String
      
      var userInfo: UserInfo
    }
    object TokenCacheItem {
      
      @scala.inline
      def apply(
        accessToken: String,
        authority: String,
        clientId: String,
        displayableId: String,
        expiresOn: Date,
        isMultipleResourceRefreshToken: Boolean,
        resource: String,
        tenantId: String,
        userInfo: UserInfo
      ): TokenCacheItem = {
        val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], displayableId = displayableId.asInstanceOf[js.Any], expiresOn = expiresOn.asInstanceOf[js.Any], isMultipleResourceRefreshToken = isMultipleResourceRefreshToken.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenCacheItem]
      }
      
      @scala.inline
      implicit class TokenCacheItemMutableBuilder[Self <: TokenCacheItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayableId(value: String): Self = StObject.set(x, "displayableId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiresOn(value: Date): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsMultipleResourceRefreshToken(value: Boolean): Self = StObject.set(x, "isMultipleResourceRefreshToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      }
    }
    
    trait UserInfo extends StObject {
      
      var displayableId: String
      
      var familyName: String
      
      var givenName: String
      
      var identityProvider: String
      
      var passwordChangeUrl: String
      
      var passwordExpiresOn: Date
      
      var uniqueId: String
      
      var userId: String
    }
    object UserInfo {
      
      @scala.inline
      def apply(
        displayableId: String,
        familyName: String,
        givenName: String,
        identityProvider: String,
        passwordChangeUrl: String,
        passwordExpiresOn: Date,
        uniqueId: String,
        userId: String
      ): UserInfo = {
        val __obj = js.Dynamic.literal(displayableId = displayableId.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], identityProvider = identityProvider.asInstanceOf[js.Any], passwordChangeUrl = passwordChangeUrl.asInstanceOf[js.Any], passwordExpiresOn = passwordExpiresOn.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
        __obj.asInstanceOf[UserInfo]
      }
      
      @scala.inline
      implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayableId(value: String): Self = StObject.set(x, "displayableId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdentityProvider(value: String): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordChangeUrl(value: String): Self = StObject.set(x, "passwordChangeUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordExpiresOn(value: Date): Self = StObject.set(x, "passwordExpiresOn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      }
    }
  }
}
