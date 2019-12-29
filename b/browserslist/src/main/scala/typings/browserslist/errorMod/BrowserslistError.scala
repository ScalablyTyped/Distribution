package typings.browserslist.errorMod

import typings.browserslist.browserslistBooleans.`true`
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
    val __obj = js.Dynamic.literal(browserslist = browserslist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserslistError]
  }
}

