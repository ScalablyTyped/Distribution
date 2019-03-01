package typings
package basicDashAuthLib.basicDashAuthMod.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthResult extends js.Object {
  var name: java.lang.String
  var pass: java.lang.String
}

object BasicAuthResult {
  @scala.inline
  def apply(name: java.lang.String, pass: java.lang.String): BasicAuthResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pass")(pass)
    __obj.asInstanceOf[BasicAuthResult]
  }
}

