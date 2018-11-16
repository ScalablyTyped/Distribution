package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Edits one or more cookies of request.
         * Note that it is preferred to use the Cookies API because this is computationally less expensive.
         */
@JSGlobal("chrome.webViewRequest.EditRequestCookie")
@js.native
class EditRequestCookie protected () extends js.Object {
  /**
               * @param filter
               * @param modification Attributes that shall be overridden in cookies that machted the filter.
               *                     Attributes that are set to an empty string are removed.
               */
  def this(parameters: EditCookieParams[RequestCookie, RequestCookie]) = this()
  val instanceType: java.lang.String = js.native
  val typeGuard: chromeDashAppsLib.chromeDashAppsLibStrings.EditRequestCookie = js.native
}

