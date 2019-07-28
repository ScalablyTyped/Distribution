package typings.chromeDashApps.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectByRegExParams extends js.Object {
  /**
    * A match pattern that may contain capture groups.
    * Capture groups are referenced in the Perl syntax ($1, $2, ...)
    * instead of the RE2 syntax (\1, \2, ...) in order to be closer
    * to JavaScript Regular Expressions.
    */
  var from: String
  /** Destination pattern. @see from */
  var to: String
}

object RedirectByRegExParams {
  @scala.inline
  def apply(from: String, to: String): RedirectByRegExParams = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[RedirectByRegExParams]
  }
}

