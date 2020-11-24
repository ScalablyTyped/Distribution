package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/startOfWeekYear", JSImport.Namespace)
@js.native
object dateFnsStartOfWeekYearMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double): Date = js.native
    def apply(date: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
    def apply(date: Date): Date = js.native
    def apply(date: Date, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
  }
}
