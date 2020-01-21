package typings.dateFns.esmMod

import typings.dateFns.Interval
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "isWithinInterval")
@js.native
object isWithinInterval extends js.Object {
  def apply(date: Double, interval: Interval): Boolean = js.native
  def apply(date: Date, interval: Interval): Boolean = js.native
}

