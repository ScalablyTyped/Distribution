package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Redirects a request by applying a regular expression on the URL.
  * The regular expressions use the RE2 syntax.
  * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
  */
@JSGlobal("chrome.webViewRequest.RedirectByRegEx")
@js.native
class RedirectByRegEx protected () extends js.Object {
  def this(parameters: RedirectByRegExParams) = this()
  val instanceType: java.lang.String = js.native
  val typeGuard: chromeDashAppsLib.chromeDashAppsLibStrings.RedirectByRegEx = js.native
}

