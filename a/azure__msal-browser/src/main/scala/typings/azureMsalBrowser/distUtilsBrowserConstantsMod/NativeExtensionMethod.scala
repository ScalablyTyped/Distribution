package typings.azureMsalBrowser.distUtilsBrowserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NativeExtensionMethod extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "NativeExtensionMethod")
@js.native
object NativeExtensionMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NativeExtensionMethod & String] = js.native
  
  @js.native
  sealed trait GetToken
    extends StObject
       with NativeExtensionMethod
  /* "GetToken" */ val GetToken: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.NativeExtensionMethod.GetToken & String = js.native
  
  @js.native
  sealed trait HandshakeRequest
    extends StObject
       with NativeExtensionMethod
  /* "Handshake" */ val HandshakeRequest: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.NativeExtensionMethod.HandshakeRequest & String = js.native
  
  @js.native
  sealed trait HandshakeResponse
    extends StObject
       with NativeExtensionMethod
  /* "HandshakeResponse" */ val HandshakeResponse: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.NativeExtensionMethod.HandshakeResponse & String = js.native
  
  @js.native
  sealed trait Response
    extends StObject
       with NativeExtensionMethod
  /* "Response" */ val Response: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.NativeExtensionMethod.Response & String = js.native
}
