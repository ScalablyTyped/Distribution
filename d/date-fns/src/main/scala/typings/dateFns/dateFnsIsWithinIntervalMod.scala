package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/isWithinInterval", JSImport.Namespace)
@js.native
object dateFnsIsWithinIntervalMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, interval: typings.dateFns.mod.Interval): Boolean = js.native
    def apply(date: Date, interval: typings.dateFns.mod.Interval): Boolean = js.native
  }
}
