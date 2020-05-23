package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/setDay", JSImport.Namespace)
@js.native
object esmSetDayMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, day: Double): Date = js.native
    def apply(date: Double, day: Double, options: typings.dateFns.anon.Locale): Date = js.native
    def apply(date: Double, day: Double, options: WeekStartsOn): Date = js.native
    def apply(date: Date, day: Double): Date = js.native
    def apply(date: Date, day: Double, options: typings.dateFns.anon.Locale): Date = js.native
    def apply(date: Date, day: Double, options: WeekStartsOn): Date = js.native
  }
  
}

