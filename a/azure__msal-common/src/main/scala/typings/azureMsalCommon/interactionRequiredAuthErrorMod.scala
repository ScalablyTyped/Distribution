package typings.azureMsalCommon

import typings.azureMsalCommon.anon.Code
import typings.azureMsalCommon.authErrorMod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionRequiredAuthErrorMod {
  
  @JSImport("@azure/msal-common/dist/error/InteractionRequiredAuthError", "InteractionRequiredAuthError")
  @js.native
  open class InteractionRequiredAuthError () extends AuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
    def this(errorCode: Unit, errorMessage: String) = this()
    def this(errorCode: String, errorMessage: String, subError: String) = this()
    def this(errorCode: String, errorMessage: Unit, subError: String) = this()
    def this(errorCode: Unit, errorMessage: String, subError: String) = this()
    def this(errorCode: Unit, errorMessage: Unit, subError: String) = this()
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
