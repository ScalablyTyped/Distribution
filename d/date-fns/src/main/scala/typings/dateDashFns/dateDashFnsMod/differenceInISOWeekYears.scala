package typings.dateDashFns.dateDashFnsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "differenceInISOWeekYears")
@js.native
object differenceInISOWeekYears extends js.Object {
  def apply(dateLeft: Double, dateRight: Double): Double = js.native
  def apply(dateLeft: Double, dateRight: Date): Double = js.native
  def apply(dateLeft: Date, dateRight: Double): Double = js.native
  def apply(dateLeft: Date, dateRight: Date): Double = js.native
}

