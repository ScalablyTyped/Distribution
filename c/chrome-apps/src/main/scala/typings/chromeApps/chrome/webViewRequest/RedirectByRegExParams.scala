package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectByRegExParams extends js.Object {
  /**
    * A match pattern that may contain capture groups.
    * Capture groups are referenced in the Perl syntax ($1, $2, ...)
    * instead of the RE2 syntax (\1, \2, ...) in order to be closer
    * to JavaScript Regular Expressions.
    */
  var from: String = js.native
  /** Destination pattern. @see from */
  var to: String = js.native
}

object RedirectByRegExParams {
  @scala.inline
  def apply(from: String, to: String): RedirectByRegExParams = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectByRegExParams]
  }
  @scala.inline
  implicit class RedirectByRegExParamsOps[Self <: RedirectByRegExParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

