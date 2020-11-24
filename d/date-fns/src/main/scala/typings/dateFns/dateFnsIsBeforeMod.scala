package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/isBefore", JSImport.Namespace)
@js.native
object dateFnsIsBeforeMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, dateToCompare: Double): Boolean = js.native
    def apply(date: Double, dateToCompare: Date): Boolean = js.native
    def apply(date: Date, dateToCompare: Double): Boolean = js.native
    def apply(date: Date, dateToCompare: Date): Boolean = js.native
  }
}
