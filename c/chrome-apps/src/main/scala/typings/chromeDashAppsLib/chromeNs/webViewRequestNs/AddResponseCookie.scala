package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
         * Note that it is preferred to use the Cookies API because this is computationally less expensive.
         */
@JSGlobal("chrome.webViewRequest.AddResponseCookie")
@js.native
class AddResponseCookie protected () extends js.Object {
  def this(parameters: AddCookie[ResponseCookie]) = this()
  val instanceType: java.lang.String = js.native
  val typeGuard: chromeDashAppsLib.chromeDashAppsLibStrings.AddResponseCookie = js.native
}

