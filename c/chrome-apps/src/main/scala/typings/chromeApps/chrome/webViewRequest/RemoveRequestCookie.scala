package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes one or more cookies of request.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
@JSGlobal("chrome.webViewRequest.RemoveRequestCookie")
@js.native
class RemoveRequestCookie protected () extends OnRequestActions {
  def this(parameters: RemoveCookieParams[RequestCookie]) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeApps.chromeAppsStrings.RemoveRequestCookie = js.native
}

