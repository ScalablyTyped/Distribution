package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.Code
import typings.azureMsalBrowser.anon.CodeString
import typings.azureMsalCommon.mod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeAuthErrorMod {
  
  @JSImport("@azure/msal-browser/dist/error/NativeAuthError", "NativeAuthError")
  @js.native
  open class NativeAuthError protected () extends AuthError {
    def this(errorCode: String, description: String) = this()
    def this(errorCode: String, description: String, ext: OSError) = this()
    
    var ext: js.UndefOr[OSError] = js.native
    
    /**
      * These errors should result in a fallback to the 'standard' browser based auth flow.
      */
    def isFatal(): Boolean = js.native
  }
  /* static members */
  object NativeAuthError {
    
    @JSImport("@azure/msal-browser/dist/error/NativeAuthError", "NativeAuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create the appropriate error object based on the WAM status code.
      * @param code
      * @param description
      * @param ext
      * @returns
      */
    inline def createError(code: String, description: String): AuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[AuthError]
    inline def createError(code: String, description: String, ext: OSError): AuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], description.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[AuthError]
    
    /**
      * Creates a tokens not found error when the internal cache look up fails
      * @returns NativeAuthError: tokensNotFoundInCache
      */
    inline def createTokensNotFoundInCacheError(): NativeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokensNotFoundInCacheError")().asInstanceOf[NativeAuthError]
    
    /**
      * Creates user switch error when the user chooses a different account in the native broker prompt
      * @returns
      */
    inline def createUserSwitchError(): NativeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserSwitchError")().asInstanceOf[NativeAuthError]
  }
  
  object NativeAuthErrorMessage {
    
    @JSImport("@azure/msal-browser/dist/error/NativeAuthError", "NativeAuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-browser/dist/error/NativeAuthError", "NativeAuthErrorMessage.extensionError")
    @js.native
    def extensionError: CodeString = js.native
    inline def extensionError_=(x: CodeString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/NativeAuthError", "NativeAuthErrorMessage.tokensNotFoundInCache")
    @js.native
    def tokensNotFoundInCache: Code = js.native
    inline def tokensNotFoundInCache_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokensNotFoundInCache")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/NativeAuthError", "NativeAuthErrorMessage.userSwitch")
    @js.native
    def userSwitch: Code = js.native
    inline def userSwitch_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userSwitch")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait NativeStatusCode extends StObject
  @JSImport("@azure/msal-browser/dist/error/NativeAuthError", "NativeStatusCode")
  @js.native
  object NativeStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NativeStatusCode & String] = js.native
    
    @js.native
    sealed trait ACCOUNT_UNAVAILABLE
      extends StObject
         with NativeStatusCode
    /* "ACCOUNT_UNAVAILABLE" */ val ACCOUNT_UNAVAILABLE: typings.azureMsalBrowser.nativeAuthErrorMod.NativeStatusCode.ACCOUNT_UNAVAILABLE & String = js.native
    
    @js.native
    sealed trait DISABLED
      extends StObject
         with NativeStatusCode
    /* "DISABLED" */ val DISABLED: typings.azureMsalBrowser.nativeAuthErrorMod.NativeStatusCode.DISABLED & String = js.native
    
    @js.native
    sealed trait NO_NETWORK
      extends StObject
         with NativeStatusCode
    /* "NO_NETWORK" */ val NO_NETWORK: typings.azureMsalBrowser.nativeAuthErrorMod.NativeStatusCode.NO_NETWORK & String = js.native
    
    @js.native
    sealed trait PERSISTENT_ERROR
      extends StObject
         with NativeStatusCode
    /* "PERSISTENT_ERROR" */ val PERSISTENT_ERROR: typings.azureMsalBrowser.nativeAuthErrorMod.NativeStatusCode.PERSISTENT_ERROR & String = js.native
    
    @js.native
    sealed trait TRANSIENT_ERROR
      extends StObject
         with NativeStatusCode
    /* "TRANSIENT_ERROR" */ val TRANSIENT_ERROR: typings.azureMsalBrowser.nativeAuthErrorMod.NativeStatusCode.TRANSIENT_ERROR & String = js.native
    
    @js.native
    sealed trait USER_CANCEL
      extends StObject
         with NativeStatusCode
    /* "USER_CANCEL" */ val USER_CANCEL: typings.azureMsalBrowser.nativeAuthErrorMod.NativeStatusCode.USER_CANCEL & String = js.native
    
    @js.native
    sealed trait USER_INTERACTION_REQUIRED
      extends StObject
         with NativeStatusCode
    /* "USER_INTERACTION_REQUIRED" */ val USER_INTERACTION_REQUIRED: typings.azureMsalBrowser.nativeAuthErrorMod.NativeStatusCode.USER_INTERACTION_REQUIRED & String = js.native
  }
  
  trait OSError extends StObject {
    
    var error: Double
    
    var properties: js.Object
    
    var protocol_error: String
    
    var retryable: js.UndefOr[Boolean] = js.undefined
    
    var status: String
  }
  object OSError {
    
    inline def apply(error: Double, properties: js.Object, protocol_error: String, status: String): OSError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], protocol_error = protocol_error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OSError]
    }
    
    extension [Self <: OSError](x: Self) {
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setProtocol_error(value: String): Self = StObject.set(x, "protocol_error", value.asInstanceOf[js.Any])
      
      inline def setRetryable(value: Boolean): Self = StObject.set(x, "retryable", value.asInstanceOf[js.Any])
      
      inline def setRetryableUndefined: Self = StObject.set(x, "retryable", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
