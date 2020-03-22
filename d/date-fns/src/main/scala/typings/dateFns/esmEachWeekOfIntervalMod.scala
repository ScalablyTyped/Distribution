package typings.dateFns

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
    def apply(interval: Interval, options: AnonWeekStartsOn): js.Array[Date] = js.native
    def apply(interval: typings.dateFns.mod.Interval, options: AnonLocale): js.Array[Date] = js.native
  }
  
}

