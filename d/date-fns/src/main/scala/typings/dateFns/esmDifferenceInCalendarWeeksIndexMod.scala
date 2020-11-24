package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/differenceInCalendarWeeks/index", JSImport.Namespace)
@js.native
object esmDifferenceInCalendarWeeksIndexMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(dateLeft: Double, dateRight: Double): Double = js.native
    def apply(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Double = js.native
    def apply(dateLeft: Double, dateRight: Date): Double = js.native
    def apply(dateLeft: Double, dateRight: Date, options: WeekStartsOn): Double = js.native
    def apply(dateLeft: Date, dateRight: Double): Double = js.native
    def apply(dateLeft: Date, dateRight: Double, options: WeekStartsOn): Double = js.native
    def apply(dateLeft: Date, dateRight: Date): Double = js.native
    def apply(dateLeft: Date, dateRight: Date, options: WeekStartsOn): Double = js.native
  }
}
