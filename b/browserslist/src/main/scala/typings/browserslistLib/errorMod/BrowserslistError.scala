package typings
package browserslistLib.errorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserslistError
  extends stdLib.Error {
  var browserslist: browserslistLib.browserslistLibNumbers.`true`
}

object BrowserslistError {
  @scala.inline
  def apply(
    browserslist: browserslistLib.browserslistLibNumbers.`true`,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): BrowserslistError = {
    val __obj = js.Dynamic.literal(browserslist = browserslist, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[BrowserslistError]
  }
}

