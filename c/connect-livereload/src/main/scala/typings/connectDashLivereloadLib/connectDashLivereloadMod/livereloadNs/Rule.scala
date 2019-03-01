package typings
package connectDashLivereloadLib.connectDashLivereloadMod.livereloadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var `match`: stdLib.RegExp
  def fn(w: java.lang.String, s: java.lang.String): java.lang.String
}

object Rule {
  @scala.inline
  def apply(fn: js.Function2[java.lang.String, java.lang.String, java.lang.String], `match`: stdLib.RegExp): Rule = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("fn")(fn)
    __obj.asInstanceOf[Rule]
  }
}

