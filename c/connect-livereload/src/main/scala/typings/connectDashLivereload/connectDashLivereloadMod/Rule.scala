package typings.connectDashLivereload.connectDashLivereloadMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var `match`: RegExp
  def fn(w: String, s: String): String
}

object Rule {
  @scala.inline
  def apply(fn: (String, String) => String, `match`: RegExp): Rule = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Rule]
  }
}

