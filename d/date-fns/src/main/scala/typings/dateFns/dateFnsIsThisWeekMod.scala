package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isThisWeek", JSImport.Namespace)
@js.native
object dateFnsIsThisWeekMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): Boolean = js.native
    def apply(date: Double, options: typings.dateFns.anon.Locale): Boolean = js.native
    def apply(date: Date): Boolean = js.native
    def apply(date: Date, options: typings.dateFns.anon.Locale): Boolean = js.native
  }
  
}

