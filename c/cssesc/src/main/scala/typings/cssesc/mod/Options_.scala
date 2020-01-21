package typings.cssesc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options_ extends js.Object {
  var escapeEverything: Boolean
  var isIdentifier: Boolean
  var quotes: String
  var wrap: Boolean
}

object Options_ {
  @scala.inline
  def apply(escapeEverything: Boolean, isIdentifier: Boolean, quotes: String, wrap: Boolean): Options_ = {
    val __obj = js.Dynamic.literal(escapeEverything = escapeEverything.asInstanceOf[js.Any], isIdentifier = isIdentifier.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options_]
  }
}

