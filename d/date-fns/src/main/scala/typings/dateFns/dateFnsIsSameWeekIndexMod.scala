package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isSameWeek/index", JSImport.Namespace)
@js.native
object dateFnsIsSameWeekIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Double, options: typings.dateFns.anon.Locale): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date, options: typings.dateFns.anon.Locale): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double, options: typings.dateFns.anon.Locale): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date, options: typings.dateFns.anon.Locale): Boolean = js.native
  }
  
}

