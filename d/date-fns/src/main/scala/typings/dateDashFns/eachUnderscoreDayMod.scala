package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/each_day", JSImport.Namespace)
@js.native
object eachUnderscoreDayMod extends js.Object {
  def apply(startDate: Date | String | Double, endDate: Date | String | Double): js.Array[Date] = js.native
  def apply(startDate: Date | String | Double, endDate: Date | String | Double, step: Double): js.Array[Date] = js.native
}

