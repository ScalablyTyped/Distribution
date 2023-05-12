package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "InteractionRequiredAuthError")
@js.native
open class InteractionRequiredAuthError protected ()
  extends typings.azureMsalCommon.mod.InteractionRequiredAuthError {
  def this(
    errorCode: js.UndefOr[String],
    errorMessage: js.UndefOr[String],
    subError: js.UndefOr[String],
    timestamp: js.UndefOr[String],
    traceId: js.UndefOr[String],
    correlationId: js.UndefOr[String],
    claims: js.UndefOr[String]
  ) = this()
}
/* static members */
object InteractionRequiredAuthError {
  
  @JSImport("@azure/msal-browser", "InteractionRequiredAuthError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an error thrown when the native broker returns ACCOUNT_UNAVAILABLE status, indicating that the account was removed and interactive sign-in is required
    * @returns
    */
  inline def createNativeAccountUnavailableError(): typings.azureMsalCommon.distErrorInteractionRequiredAuthErrorMod.InteractionRequiredAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeAccountUnavailableError")().asInstanceOf[typings.azureMsalCommon.distErrorInteractionRequiredAuthErrorMod.InteractionRequiredAuthError]
  
  /**
    * Creates an error thrown when the authorization code required for a token request is null or empty.
    */
  inline def createNoTokensFoundError(): typings.azureMsalCommon.distErrorInteractionRequiredAuthErrorMod.InteractionRequiredAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoTokensFoundError")().asInstanceOf[typings.azureMsalCommon.distErrorInteractionRequiredAuthErrorMod.InteractionRequiredAuthError]
  
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
