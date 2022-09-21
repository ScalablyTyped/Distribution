package typings.azureMsalBrowser.mod

import typings.azureMsalBrowser.signedHttpRequestMod.SignedHttpRequestOptions
import typings.azureMsalCommon.icryptoMod.SignedHttpRequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "SignedHttpRequest")
@js.native
open class SignedHttpRequest protected ()
  extends typings.azureMsalBrowser.signedHttpRequestMod.SignedHttpRequest {
  def this(shrParameters: SignedHttpRequestParameters) = this()
  def this(shrParameters: SignedHttpRequestParameters, shrOptions: SignedHttpRequestOptions) = this()
}
