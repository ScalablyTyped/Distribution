package typings.azureMsalCommon

import typings.azureMsalCommon.anon.Code
import typings.azureMsalCommon.distErrorAuthErrorMod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorInteractionRequiredAuthErrorMod {
  
  @JSImport("@azure/msal-common/dist/error/InteractionRequiredAuthError", "InteractionRequiredAuthError")
  @js.native
  open class InteractionRequiredAuthError protected () extends AuthError {
    def this(
      errorCode: js.UndefOr[String],
      errorMessage: js.UndefOr[String],
      subError: js.UndefOr[String],
      timestamp: js.UndefOr[String],
      traceId: js.UndefOr[String],
      correlationId: js.UndefOr[String],
      claims: js.UndefOr[String]
    ) = this()
    
    /**
      * https://github.com/AzureAD/microsoft-authentication-library-for-js/blob/dev/lib/msal-common/docs/claims-challenge.md
      *
      * A string with extra claims needed for the token request to succeed
      * web site: redirect the user to the authorization page and set the extra claims
      * web api: include the claims in the WWW-Authenticate header that are sent back to the client so that it knows to request a token with the extra claims
      * desktop application or browser context: include the claims when acquiring the token interactively
      * app to app context (client_credentials): include the claims in the AcquireTokenByClientCredential request
      */
    var claims: String = js.native
    
    /**
      * The time the error occured at
      */
    var timestamp: String = js.native
    
    /**
      * TraceId associated with the error
      */
    var traceId: String = js.native
  }
  /* static members */
  object InteractionRequiredAuthError {
    
    @JSImport("@azure/msal-common/dist/error/InteractionRequiredAuthError", "InteractionRequiredAuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an error thrown when the native broker returns ACCOUNT_UNAVAILABLE status, indicating that the account was removed and interactive sign-in is required
      * @returns
      */
    inline def createNativeAccountUnavailableError(): InteractionRequiredAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeAccountUnavailableError")().asInstanceOf[InteractionRequiredAuthError]
    
    /**
      * Creates an error thrown when the authorization code required for a token request is null or empty.
      */
    inline def createNoTokensFoundError(): InteractionRequiredAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoTokensFoundError")().asInstanceOf[InteractionRequiredAuthError]
    
    /**
      * Helper function used to determine if an error thrown by the server requires interaction to resolve
      * @param errorCode
      * @param errorString
      * @param subError
      */
    inline def isInteractionRequiredError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")().asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: String, errorString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: String, errorString: String, subError: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any], subError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: String, errorString: Unit, subError: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any], subError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: Unit, errorString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: Unit, errorString: String, subError: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any], subError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: Unit, errorString: Unit, subError: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any], subError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object InteractionRequiredAuthErrorMessage {
    
    @JSImport("@azure/msal-common/dist/error/InteractionRequiredAuthError", "InteractionRequiredAuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-common/dist/error/InteractionRequiredAuthError", "InteractionRequiredAuthErrorMessage.native_account_unavailable")
    @js.native
    def nativeAccountUnavailable: Code = js.native
    
    inline def nativeAccountUnavailable_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("native_account_unavailable")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/InteractionRequiredAuthError", "InteractionRequiredAuthErrorMessage.noTokensFoundError")
    @js.native
    def noTokensFoundError: Code = js.native
    inline def noTokensFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noTokensFoundError")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-common/dist/error/InteractionRequiredAuthError", "InteractionRequiredAuthSubErrorMessage")
  @js.native
  val InteractionRequiredAuthSubErrorMessage: js.Array[String] = js.native
  
  @JSImport("@azure/msal-common/dist/error/InteractionRequiredAuthError", "InteractionRequiredServerErrorMessage")
  @js.native
  val InteractionRequiredServerErrorMessage: js.Array[String] = js.native
}
