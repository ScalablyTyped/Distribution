package typings
package cssescLib.cssescMod.cssescNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var escapeEverything: scala.Boolean
  var isIdentifier: scala.Boolean
  var quotes: java.lang.String
  var wrap: scala.Boolean
}

object Options {
  @scala.inline
  def apply(
    escapeEverything: scala.Boolean,
    isIdentifier: scala.Boolean,
    quotes: java.lang.String,
    wrap: scala.Boolean
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("escapeEverything")(escapeEverything)
    __obj.updateDynamic("isIdentifier")(isIdentifier)
    __obj.updateDynamic("quotes")(quotes)
    __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[Options]
  }
}

