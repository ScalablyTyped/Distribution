package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes one or more cookies of response.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
@JSGlobal("chrome.webViewRequest.RemoveResponseCookie")
@js.native
class RemoveResponseCookie protected () extends OnRequestActions {
  def this(parameters: RemoveCookieParams[FilterResponseCookie]) = this()
  val instanceType: java.lang.String = js.native
  val typeGuard: chromeDashAppsLib.chromeDashAppsLibStrings.RemoveResponseCookie = js.native
}

