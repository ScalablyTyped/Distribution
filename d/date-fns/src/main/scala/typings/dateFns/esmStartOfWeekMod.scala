package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/startOfWeek", JSImport.Namespace)
@js.native
object esmStartOfWeekMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): Date = js.native
    def apply(date: Double, options: AnonLocale): Date = js.native
    def apply(date: Double, options: AnonWeekStartsOn): Date = js.native
    def apply(date: Date): Date = js.native
    def apply(date: Date, options: AnonLocale): Date = js.native
    def apply(date: Date, options: AnonWeekStartsOn): Date = js.native
  }
  
}

