package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Declarative event action that redirects a network request.  */
@JSGlobal("chrome.webViewRequest.RedirectRequest")
@js.native
class RedirectRequest protected () extends OnRequestActions {
  def this(parameters: RedirectRequestParams) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeApps.chromeAppsStrings.RedirectRequest = js.native
}

