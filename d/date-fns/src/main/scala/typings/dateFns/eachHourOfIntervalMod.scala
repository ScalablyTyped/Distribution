package typings.dateFns

import typings.dateFns.anon.Step
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/eachHourOfInterval", JSImport.Namespace)
@js.native
object eachHourOfIntervalMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(interval: typings.dateFns.mod.Interval): js.Array[Date] = js.native
    def apply(interval: typings.dateFns.mod.Interval, options: Step): js.Array[Date] = js.native
  }
  
}

