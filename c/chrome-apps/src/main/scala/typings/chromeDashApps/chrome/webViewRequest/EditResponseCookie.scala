package typings.chromeDashApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Edits one or more cookies of response.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
@JSGlobal("chrome.webViewRequest.EditResponseCookie")
@js.native
class EditResponseCookie protected () extends OnRequestActions {
  /**
    * @param filter Filter for cookies that will be modified.All empty entries are ignored.
    * @param modification
    */
  def this(parameter: EditCookieParams[FilterResponseCookie, ResponseCookie]) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeDashApps.chromeDashAppsStrings.EditResponseCookie = js.native
}

