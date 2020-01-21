package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
@JSGlobal("chrome.webViewRequest.AddResponseCookie")
@js.native
class AddResponseCookie protected () extends OnRequestActions {
  def this(parameters: AddCookie[ResponseCookie]) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeApps.chromeAppsStrings.AddResponseCookie = js.native
}

