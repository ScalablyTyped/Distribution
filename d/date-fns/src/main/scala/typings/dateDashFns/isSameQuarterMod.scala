package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isSameQuarter", JSImport.Namespace)
@js.native
object isSameQuarterMod extends js.Object {
  def default(dateLeft: Double, dateRight: Double): Boolean = js.native
  def default(dateLeft: Double, dateRight: Date): Boolean = js.native
  def default(dateLeft: Date, dateRight: Double): Boolean = js.native
  def default(dateLeft: Date, dateRight: Date): Boolean = js.native
}

