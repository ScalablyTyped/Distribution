package typings.dateFns

import typings.dateFns.anon.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/areIntervalsOverlapping/index", JSImport.Namespace)
@js.native
object esmAreIntervalsOverlappingIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(intervalLeft: Interval, intervalRight: Interval): Boolean = js.native
    def apply(intervalLeft: Interval, intervalRight: Interval, options: Inclusive): Boolean = js.native
  }
  
}

