package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/are_ranges_overlapping", JSImport.Namespace)
@js.native
object areUnderscoreRangesUnderscoreOverlappingMod extends js.Object {
  def apply(
    initialRangeStartDate: Date | String | Double,
    initialRangeEndDate: Date | String | Double,
    comparedRangeStartDate: Date | String | Double,
    comparedRangeEndDate: Date | String | Double
  ): Boolean = js.native
}

