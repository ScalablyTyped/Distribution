package typings.dateFns.esmMod

import typings.dateFns.AnonWeekStartsOn
import typings.dateFns.Interval
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "eachWeekOfInterval")
@js.native
object eachWeekOfInterval extends js.Object {
  def apply(interval: Interval): js.Array[Date] = js.native
  def apply(interval: Interval, options: AnonWeekStartsOn): js.Array[Date] = js.native
}

