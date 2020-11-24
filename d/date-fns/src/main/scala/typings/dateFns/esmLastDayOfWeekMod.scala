package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/lastDayOfWeek", JSImport.Namespace)
@js.native
object esmLastDayOfWeekMod extends js.Object {
  
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
