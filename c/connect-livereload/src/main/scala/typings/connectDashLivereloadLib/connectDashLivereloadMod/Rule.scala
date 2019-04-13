package typings
package connectDashLivereloadLib.connectDashLivereloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var `match`: stdLib.RegExp
  def fn(w: java.lang.String, s: java.lang.String): java.lang.String
}

object Rule {
  @scala.inline
  def apply(fn: (java.lang.String, java.lang.String) => java.lang.String, `match`: stdLib.RegExp): Rule = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Rule]
  }
}

