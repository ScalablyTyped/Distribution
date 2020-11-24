package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/getWeek", JSImport.Namespace)
@js.native
object dateFnsGetWeekMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double): Double = js.native
    def apply(date: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Double = js.native
    def apply(date: Date): Double = js.native
    def apply(date: Date, options: FirstWeekContainsDateLocaleWeekStartsOn): Double = js.native
  }
}
