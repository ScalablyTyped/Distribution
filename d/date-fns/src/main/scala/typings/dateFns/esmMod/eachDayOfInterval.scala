package typings.dateFns.esmMod

import typings.dateFns.AnonStep
import typings.dateFns.Interval
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "eachDayOfInterval")
@js.native
object eachDayOfInterval extends js.Object {
  def apply(interval: Interval): js.Array[Date] = js.native
  def apply(interval: Interval, options: AnonStep): js.Array[Date] = js.native
}

