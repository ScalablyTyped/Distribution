package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/isThisWeek", JSImport.Namespace)
@js.native
object isThisWeekMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): Boolean = js.native
    def apply(date: Double, options: AnonLocale): Boolean = js.native
    def apply(date: Double, options: AnonWeekStartsOn): Boolean = js.native
    def apply(date: Date): Boolean = js.native
    def apply(date: Date, options: AnonLocale): Boolean = js.native
    def apply(date: Date, options: AnonWeekStartsOn): Boolean = js.native
  }
  
}

