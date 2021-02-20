package typings.cordovaPluginMsAdal

import typings.cordovaPluginMsAdal.Microsoft.ADAL.PromiseAuthenticationContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Microsoft {
    
    object ADAL {
      
      @JSGlobal("Microsoft.ADAL.AuthenticationContext")
      @js.native
      class AuthenticationContext protected ()
        extends typings.cordovaPluginMsAdal.Microsoft.ADAL.AuthenticationContext {
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
        @JSGlobal("Microsoft.ADAL.AuthenticationContext.createAsync")
        @js.native
        def createAsync(authority: String): PromiseAuthenticationContext = js.native
        @JSGlobal("Microsoft.ADAL.AuthenticationContext.createAsync")
        @js.native
        def createAsync(authority: String, validateAuthority: Boolean): PromiseAuthenticationContext = js.native
      }
      
      @JSGlobal("Microsoft.ADAL.AuthenticationResult")
      @js.native
      class AuthenticationResult ()
        extends typings.cordovaPluginMsAdal.Microsoft.ADAL.AuthenticationResult
      
      @JSGlobal("Microsoft.ADAL.TokenCache")
      @js.native
      class TokenCache ()
        extends typings.cordovaPluginMsAdal.Microsoft.ADAL.TokenCache
    }
  }
}
