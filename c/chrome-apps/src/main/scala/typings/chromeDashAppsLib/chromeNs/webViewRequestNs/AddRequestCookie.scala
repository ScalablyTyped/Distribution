package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

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
  val instanceType: java.lang.String = js.native
  val typeGuard: chromeDashAppsLib.chromeDashAppsLibStrings.AddRequestCookie = js.native
}

