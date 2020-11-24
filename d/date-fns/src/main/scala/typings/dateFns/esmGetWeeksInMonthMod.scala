package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/getWeeksInMonth", JSImport.Namespace)
@js.native
object esmGetWeeksInMonthMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double): Double = js.native
    def apply(date: Double, options: typings.dateFns.anon.Locale): Double = js.native
    def apply(date: Double, options: WeekStartsOn): Double = js.native
    def apply(date: Date): Double = js.native
    def apply(date: Date, options: typings.dateFns.anon.Locale): Double = js.native
    def apply(date: Date, options: WeekStartsOn): Double = js.native
  }
}
