package typings.cordovaPluginMsAdal

import typings.cordovaPluginMsAdal.Microsoft.ADAL.Promise
import typings.cordovaPluginMsAdal.Microsoft.ADAL.PromiseAuthenticationContext
import typings.cordovaPluginMsAdal.Microsoft.ADAL.PromiseTokenCacheItems
import typings.cordovaPluginMsAdal.Microsoft.ADAL.TokenCacheItem
import typings.cordovaPluginMsAdal.Microsoft.ADAL.UserInfo
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Microsoft {
    
    object ADAL {
      
      @JSGlobal("Microsoft.ADAL.AuthenticationContext")
      @js.native
      class AuthenticationContext protected ()
        extends StObject
           with typings.cordovaPluginMsAdal.Microsoft.ADAL.AuthenticationContext {
        /**
          * Constructs context to use with known authority to get the token. It reuses existing context
          * for this authority URL in native proxy or creates a new one if it doesn't exists.
          * Corresponding native context will be created at first time when it will be needed.
          *
          * @param   {String}  authority         Authority url to send code and token requests
          * @param   {Boolean} validateAuthority Validate authority before sending token request
          *                                      When context is being created syncronously using this constructor
          *                                      validateAuthority in native context will be disabled to prevent
          *                                      context initialization failure
          *
          * @returns {Object}  Newly created authentication context.
          */
        def this(authority: String) = this()
        def this(authority: String, validateAuthority: Boolean) = this()
      }
      object AuthenticationContext {
        
        @JSGlobal("Microsoft.ADAL.AuthenticationContext")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Constructs context asynchronously to use with known authority to get the token.
          * It reuses existing context for this authority URL in native proxy or creates a new one if it doesn't exists.
          *
          * @param   {String}   authority         Authority url to send code and token requests
          * @param   {Boolean}  validateAuthority Validate authority before sending token request. True by default
          *
          * @returns {Promise}  Promise either fulfilled with newly created authentication context or rejected with error
          */
        /* static member */
        inline def createAsync(authority: String): PromiseAuthenticationContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(authority.asInstanceOf[js.Any]).asInstanceOf[PromiseAuthenticationContext]
        inline def createAsync(authority: String, validateAuthority: Boolean): PromiseAuthenticationContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(authority.asInstanceOf[js.Any], validateAuthority.asInstanceOf[js.Any])).asInstanceOf[PromiseAuthenticationContext]
      }
      
      @JSGlobal("Microsoft.ADAL.AuthenticationResult")
      @js.native
      class AuthenticationResult ()
        extends StObject
           with typings.cordovaPluginMsAdal.Microsoft.ADAL.AuthenticationResult {
        
        /* CompleteClass */
        var accessToken: String = js.native
        
        /* CompleteClass */
        var accessTokenType: String = js.native
        
        /**
          * Creates authorization header for web requests.
          *
          * @returns {String} The authorization header.
          */
        /* CompleteClass */
        override def createAuthorizationHeader(): String = js.native
        
        /* CompleteClass */
        var expiresOn: Date = js.native
        
        /* CompleteClass */
        var idToken: String = js.native
        
        /* CompleteClass */
        var isMultipleResourceRefreshToken: Boolean = js.native
        
        /* CompleteClass */
        var status: String = js.native
        
        /* CompleteClass */
        var statusCode: String = js.native
        
        /* CompleteClass */
        var tenantId: String = js.native
        
        /* CompleteClass */
        var userInfo: UserInfo = js.native
      }
      
      @JSGlobal("Microsoft.ADAL.TokenCache")
      @js.native
      class TokenCache ()
        extends StObject
           with typings.cordovaPluginMsAdal.Microsoft.ADAL.TokenCache {
        
        /**
          * Clears the cache by deleting all the items.
          *
          * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
          */
        /* CompleteClass */
        override def clear(): Promise = js.native
        
        /* CompleteClass */
        var contextAuthority: String = js.native
        
        /**
          * Deletes cached item.
          *
          * @param   {TokenCacheItem}  item Cached item to delete from cache
          *
          * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
          */
        /* CompleteClass */
        override def deleteItem(item: TokenCacheItem): Promise = js.native
        
        /**
          * Gets all cached items.
          *
          * @returns {Promise} Promise either fulfilled with array of cached items or rejected with error.
          */
        /* CompleteClass */
        override def readItems(): PromiseTokenCacheItems = js.native
      }
    }
  }
}
