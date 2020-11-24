package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/setWeek/index", JSImport.Namespace)
@js.native
object dateFnsSetWeekIndexMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, week: Double): Date = js.native
    def apply(date: Double, week: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
    def apply(date: Date, week: Double): Date = js.native
    def apply(date: Date, week: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
  }
}
