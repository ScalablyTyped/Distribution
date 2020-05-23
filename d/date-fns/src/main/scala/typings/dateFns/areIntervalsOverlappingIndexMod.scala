package typings.dateFns

import typings.dateFns.anon.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/areIntervalsOverlapping/index", JSImport.Namespace)
@js.native
object areIntervalsOverlappingIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(intervalLeft: typings.dateFns.mod.Interval, intervalRight: typings.dateFns.mod.Interval): Boolean = js.native
    def apply(
      intervalLeft: typings.dateFns.mod.Interval,
      intervalRight: typings.dateFns.mod.Interval,
      options: Inclusive
    ): Boolean = js.native
  }
  
}

