package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/differenceInCalendarWeeks", JSImport.Namespace)
@js.native
object esmDifferenceInCalendarWeeksMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateLeft: Double, dateRight: Double): Double = js.native
    def apply(dateLeft: Double, dateRight: Double, options: typings.dateFns.anon.Locale): Double = js.native
    def apply(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Double = js.native
    def apply(dateLeft: Double, dateRight: Date): Double = js.native
    def apply(dateLeft: Double, dateRight: Date, options: typings.dateFns.anon.Locale): Double = js.native
    def apply(dateLeft: Double, dateRight: Date, options: WeekStartsOn): Double = js.native
    def apply(dateLeft: Date, dateRight: Double): Double = js.native
    def apply(dateLeft: Date, dateRight: Double, options: typings.dateFns.anon.Locale): Double = js.native
    def apply(dateLeft: Date, dateRight: Double, options: WeekStartsOn): Double = js.native
    def apply(dateLeft: Date, dateRight: Date): Double = js.native
    def apply(dateLeft: Date, dateRight: Date, options: typings.dateFns.anon.Locale): Double = js.native
    def apply(dateLeft: Date, dateRight: Date, options: WeekStartsOn): Double = js.native
  }
  
}

