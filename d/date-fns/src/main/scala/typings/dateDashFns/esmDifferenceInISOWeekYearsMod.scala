package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/differenceInISOWeekYears", JSImport.Namespace)
@js.native
object esmDifferenceInISOWeekYearsMod extends js.Object {
  def default(dateLeft: Double, dateRight: Double): Double = js.native
  def default(dateLeft: Double, dateRight: Date): Double = js.native
  def default(dateLeft: Date, dateRight: Double): Double = js.native
  def default(dateLeft: Date, dateRight: Date): Double = js.native
}

