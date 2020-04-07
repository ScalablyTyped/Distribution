package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/isSameWeek/index", JSImport.Namespace)
@js.native
object esmIsSameWeekIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Double, options: AnonWeekStartsOn): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date, options: AnonWeekStartsOn): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double, options: AnonWeekStartsOn): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date, options: AnonWeekStartsOn): Boolean = js.native
  }
  
}

