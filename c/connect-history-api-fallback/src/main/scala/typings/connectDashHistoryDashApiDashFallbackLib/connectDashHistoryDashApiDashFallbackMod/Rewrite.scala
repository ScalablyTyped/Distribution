package typings
package connectDashHistoryDashApiDashFallbackLib.connectDashHistoryDashApiDashFallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rewrite extends js.Object {
  var from: stdLib.RegExp
  var to: java.lang.String | stdLib.RegExp | connectDashHistoryDashApiDashFallbackLib.RewriteTo
}

object Rewrite {
  @scala.inline
  def apply(
    from: stdLib.RegExp,
    to: java.lang.String | stdLib.RegExp | connectDashHistoryDashApiDashFallbackLib.RewriteTo
  ): Rewrite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rewrite]
  }
}

