package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "InteractionRequiredAuthError")
@js.native
open class InteractionRequiredAuthError ()
  extends typings.azureMsalCommon.interactionRequiredAuthErrorMod.InteractionRequiredAuthError {
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
  
  @JSImport("@azure/msal-common", "InteractionRequiredAuthError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an error thrown when the native broker returns ACCOUNT_UNAVAILABLE status, indicating that the account was removed and interactive sign-in is required
    * @returns
    */
  inline def createNativeAccountUnavailableError(): typings.azureMsalCommon.interactionRequiredAuthErrorMod.InteractionRequiredAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeAccountUnavailableError")().asInstanceOf[typings.azureMsalCommon.interactionRequiredAuthErrorMod.InteractionRequiredAuthError]
  
  /**
    * Creates an error thrown when the authorization code required for a token request is null or empty.
    */
  inline def createNoTokensFoundError(): typings.azureMsalCommon.interactionRequiredAuthErrorMod.InteractionRequiredAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoTokensFoundError")().asInstanceOf[typings.azureMsalCommon.interactionRequiredAuthErrorMod.InteractionRequiredAuthError]
  
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
