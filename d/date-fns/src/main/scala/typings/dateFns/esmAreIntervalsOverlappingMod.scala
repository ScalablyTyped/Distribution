package typings.dateFns

import typings.dateFns.anon.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/areIntervalsOverlapping", JSImport.Namespace)
@js.native
object esmAreIntervalsOverlappingMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(
      intervalLeft: typings.dateFns.mod.Interval | Interval,
      intervalRight: typings.dateFns.mod.Interval | Interval
    ): Boolean = js.native
    def apply(
      intervalLeft: typings.dateFns.mod.Interval | Interval,
      intervalRight: typings.dateFns.mod.Interval | Interval,
      options: Inclusive
    ): Boolean = js.native
  }
}
