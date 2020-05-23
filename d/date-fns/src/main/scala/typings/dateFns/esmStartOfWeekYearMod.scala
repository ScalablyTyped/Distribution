package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.dateFns.anon.LocaleLocale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/startOfWeekYear", JSImport.Namespace)
@js.native
object esmStartOfWeekYearMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): Date = js.native
    def apply(date: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
    def apply(date: Double, options: LocaleLocale): Date = js.native
    def apply(date: Date): Date = js.native
    def apply(date: Date, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
    def apply(date: Date, options: LocaleLocale): Date = js.native
  }
  
}

