package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/roundToNearestMinutes", JSImport.Namespace)
@js.native
object dateFnsRoundToNearestMinutesMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): Date = js.native
    def apply(date: Double, options: AnonNearestTo): Date = js.native
    def apply(date: Date): Date = js.native
    def apply(date: Date, options: AnonNearestTo): Date = js.native
  }
  
}

