package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/closestTo", JSImport.Namespace)
@js.native
object closestToMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateToCompare: Double, datesArray: js.Array[Date | Double]): Date = js.native
    def apply(dateToCompare: Date, datesArray: js.Array[Date | Double]): Date = js.native
  }
  
}

