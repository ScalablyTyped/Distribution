package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/eachWeekOfInterval", JSImport.Namespace)
@js.native
object esmEachWeekOfIntervalMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(interval: typings.dateFns.mod.Interval | Interval): js.Array[Date] = js.native
    def apply(interval: Interval, options: WeekStartsOn): js.Array[Date] = js.native
    def apply(interval: typings.dateFns.mod.Interval, options: typings.dateFns.anon.Locale): js.Array[Date] = js.native
  }
  
}

