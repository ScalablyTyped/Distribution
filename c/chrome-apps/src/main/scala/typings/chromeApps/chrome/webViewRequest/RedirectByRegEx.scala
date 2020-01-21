package typings.chromeApps.chrome.webViewRequest

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
class RedirectByRegEx protected () extends OnRequestActions {
  def this(parameters: RedirectByRegExParams) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeApps.chromeAppsStrings.RedirectByRegEx = js.native
}

