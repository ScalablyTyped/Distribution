package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.dateFns.anon.LocaleLocale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/setWeek", JSImport.Namespace)
@js.native
object esmSetWeekMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, week: Double): Date = js.native
    def apply(date: Double, week: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
    def apply(date: Double, week: Double, options: LocaleLocale): Date = js.native
    def apply(date: Date, week: Double): Date = js.native
    def apply(date: Date, week: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
    def apply(date: Date, week: Double, options: LocaleLocale): Date = js.native
  }
  
}

