package typings.chromeDashApps.chrome.webViewRequest

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
  val instanceType: String = js.native
  val typeGuard: typings.chromeDashApps.chromeDashAppsStrings.RemoveResponseCookie = js.native
}

