package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

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
  var from: java.lang.String
  /** Destination pattern. @see from */
  var to: java.lang.String
}

object RedirectByRegExParams {
  @scala.inline
  def apply(from: java.lang.String, to: java.lang.String): RedirectByRegExParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RedirectByRegExParams]
  }
}

