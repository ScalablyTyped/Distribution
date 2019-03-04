package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieDefaults extends js.Object {
  var whitelist: java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | (js.Function1[/* cookie */ js.Any, scala.Boolean])
}

object CookieDefaults {
  @scala.inline
  def apply(
    whitelist: java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | (js.Function1[/* cookie */ js.Any, scala.Boolean])
  ): CookieDefaults = {
    val __obj = js.Dynamic.literal(whitelist = whitelist.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CookieDefaults]
  }
}

