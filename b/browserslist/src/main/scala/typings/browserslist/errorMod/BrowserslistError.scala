package typings.browserslist.errorMod

import typings.browserslist.browserslistNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserslistError extends Error {
  var browserslist: `true`
}

object BrowserslistError {
  @scala.inline
  def apply(browserslist: `true`, message: String, name: String, stack: String = null): BrowserslistError = {
    val __obj = js.Dynamic.literal(browserslist = browserslist, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[BrowserslistError]
  }
}

