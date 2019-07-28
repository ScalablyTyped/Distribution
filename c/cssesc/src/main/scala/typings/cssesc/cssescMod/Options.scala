package typings.cssesc.cssescMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var escapeEverything: Boolean
  var isIdentifier: Boolean
  var quotes: String
  var wrap: Boolean
}

object Options {
  @scala.inline
  def apply(escapeEverything: Boolean, isIdentifier: Boolean, quotes: String, wrap: Boolean): Options = {
    val __obj = js.Dynamic.literal(escapeEverything = escapeEverything, isIdentifier = isIdentifier, quotes = quotes, wrap = wrap)
  
    __obj.asInstanceOf[Options]
  }
}

