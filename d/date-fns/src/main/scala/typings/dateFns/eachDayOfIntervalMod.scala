package typings.dateFns

import typings.dateFns.anon.Step
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/eachDayOfInterval", JSImport.Namespace)
@js.native
object eachDayOfIntervalMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(interval: typings.dateFns.mod.Interval): js.Array[Date] = js.native
    def apply(interval: typings.dateFns.mod.Interval, options: Step): js.Array[Date] = js.native
  }
}
