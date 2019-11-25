package typings.connectDashHistoryDashApiDashFallbackDashExclusions.connectDashHistoryDashApiDashFallbackDashExclusionsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rewrite extends js.Object {
  var from: RegExp
  var to: String | RegExp | RewriteTo
}

object Rewrite {
  @scala.inline
  def apply(from: RegExp, to: String | RegExp | RewriteTo): Rewrite = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Rewrite]
  }
}

