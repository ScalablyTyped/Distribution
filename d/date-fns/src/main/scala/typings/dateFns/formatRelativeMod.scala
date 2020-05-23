package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/formatRelative", JSImport.Namespace)
@js.native
object formatRelativeMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, baseDate: Double): String = js.native
    def apply(date: Double, baseDate: Double, options: typings.dateFns.anon.Locale): String = js.native
    def apply(date: Double, baseDate: Double, options: WeekStartsOn): String = js.native
    def apply(date: Double, baseDate: Date): String = js.native
    def apply(date: Double, baseDate: Date, options: typings.dateFns.anon.Locale): String = js.native
    def apply(date: Double, baseDate: Date, options: WeekStartsOn): String = js.native
    def apply(date: Date, baseDate: Double): String = js.native
    def apply(date: Date, baseDate: Double, options: typings.dateFns.anon.Locale): String = js.native
    def apply(date: Date, baseDate: Double, options: WeekStartsOn): String = js.native
    def apply(date: Date, baseDate: Date): String = js.native
    def apply(date: Date, baseDate: Date, options: typings.dateFns.anon.Locale): String = js.native
    def apply(date: Date, baseDate: Date, options: WeekStartsOn): String = js.native
  }
  
}

