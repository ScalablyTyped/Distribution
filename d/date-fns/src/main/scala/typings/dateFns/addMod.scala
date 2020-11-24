package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/add", JSImport.Namespace)
@js.native
object addMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, duration: typings.dateFns.mod.Duration): Date = js.native
    def apply(date: Date, duration: typings.dateFns.mod.Duration): Date = js.native
  }
}
