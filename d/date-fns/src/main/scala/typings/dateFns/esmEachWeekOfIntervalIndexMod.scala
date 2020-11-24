package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/eachWeekOfInterval/index", JSImport.Namespace)
@js.native
object esmEachWeekOfIntervalIndexMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(interval: Interval): js.Array[Date] = js.native
    def apply(interval: Interval, options: WeekStartsOn): js.Array[Date] = js.native
  }
}
