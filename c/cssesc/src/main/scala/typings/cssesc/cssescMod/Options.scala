package typings.cssesc.cssescMod

import org.scalablytyped.runtime.TopLevel
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
    val __obj = js.Dynamic.literal(escapeEverything = escapeEverything.asInstanceOf[js.Any], isIdentifier = isIdentifier.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

@JSImport("cssesc", "options")
@js.native
object options extends TopLevel[Options]

