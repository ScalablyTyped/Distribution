package typings
package connectDashHistoryDashApiDashFallbackDashExclusionsLib.connectDashHistoryDashApiDashFallbackDashExclusionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rewrite extends js.Object {
  var from: stdLib.RegExp
  var to: java.lang.String | stdLib.RegExp | RewriteTo
}

object Rewrite {
  @scala.inline
  def apply(from: stdLib.RegExp, to: java.lang.String | stdLib.RegExp | RewriteTo): Rewrite = {
    val __obj = js.Dynamic.literal(from = from, to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Rewrite]
  }
}

