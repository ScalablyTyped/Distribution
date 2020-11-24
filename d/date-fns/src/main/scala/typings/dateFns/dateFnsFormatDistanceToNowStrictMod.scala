package typings.dateFns

import typings.dateFns.anon.RoundingMethod
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/formatDistanceToNowStrict", JSImport.Namespace)
@js.native
object dateFnsFormatDistanceToNowStrictMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double): String = js.native
    def apply(date: Double, options: RoundingMethod): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: RoundingMethod): String = js.native
  }
}
