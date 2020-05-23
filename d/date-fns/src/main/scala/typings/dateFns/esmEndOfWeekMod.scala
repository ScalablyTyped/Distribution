package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/endOfWeek", JSImport.Namespace)
@js.native
object esmEndOfWeekMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): Date = js.native
    def apply(date: Double, options: typings.dateFns.anon.Locale): Date = js.native
    def apply(date: Double, options: WeekStartsOn): Date = js.native
    def apply(date: Date): Date = js.native
    def apply(date: Date, options: typings.dateFns.anon.Locale): Date = js.native
    def apply(date: Date, options: WeekStartsOn): Date = js.native
  }
  
}

