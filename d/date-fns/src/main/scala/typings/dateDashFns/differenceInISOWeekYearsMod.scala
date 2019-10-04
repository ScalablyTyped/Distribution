package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/differenceInISOWeekYears", JSImport.Namespace)
@js.native
object differenceInISOWeekYearsMod extends js.Object {
  def default(dateLeft: Double, dateRight: Double): Double = js.native
  def default(dateLeft: Double, dateRight: Date): Double = js.native
  def default(dateLeft: Date, dateRight: Double): Double = js.native
  def default(dateLeft: Date, dateRight: Date): Double = js.native
}

