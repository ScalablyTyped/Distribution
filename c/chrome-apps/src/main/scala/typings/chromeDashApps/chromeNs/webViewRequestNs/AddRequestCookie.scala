package typings.chromeDashApps.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
@JSGlobal("chrome.webViewRequest.AddRequestCookie")
@js.native
class AddRequestCookie protected () extends OnRequestActions {
  def this(parameters: AddCookie[RequestCookie]) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeDashApps.chromeDashAppsStrings.AddRequestCookie = js.native
}

