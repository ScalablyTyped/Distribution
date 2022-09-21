package typings.azureMsalBrowser.mod

import typings.azureMsalCommon.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthErrorMessage {
  
  @JSImport("@azure/msal-browser", "AuthErrorMessage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/msal-browser", "AuthErrorMessage.postRequestFailed")
  @js.native
  def postRequestFailed: Code = js.native
  inline def postRequestFailed_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postRequestFailed")(x.asInstanceOf[js.Any])
  
  @JSImport("@azure/msal-browser", "AuthErrorMessage.unexpectedError")
  @js.native
  def unexpectedError: Code = js.native
  inline def unexpectedError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unexpectedError")(x.asInstanceOf[js.Any])
}
