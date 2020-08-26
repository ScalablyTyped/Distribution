package typings.cssesc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends js.Object {
  var escapeEverything: Boolean = js.native
  var isIdentifier: Boolean = js.native
  var quotes: String = js.native
  var wrap: Boolean = js.native
}

object Options_ {
  @scala.inline
  def apply(escapeEverything: Boolean, isIdentifier: Boolean, quotes: String, wrap: Boolean): Options_ = {
    val __obj = js.Dynamic.literal(escapeEverything = escapeEverything.asInstanceOf[js.Any], isIdentifier = isIdentifier.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
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
    def setEscapeEverything(value: Boolean): Self = this.set("escapeEverything", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIdentifier(value: Boolean): Self = this.set("isIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotes(value: String): Self = this.set("quotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
  }
  
}

