package typings.dateFns

import typings.dateFns.anon.AddSuffix
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/formatDistance", JSImport.Namespace)
@js.native
object dateFnsFormatDistanceMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, baseDate: Double): String = js.native
    def apply(date: Double, baseDate: Double, options: AddSuffix): String = js.native
    def apply(date: Double, baseDate: Date): String = js.native
    def apply(date: Double, baseDate: Date, options: AddSuffix): String = js.native
    def apply(date: Date, baseDate: Double): String = js.native
    def apply(date: Date, baseDate: Double, options: AddSuffix): String = js.native
    def apply(date: Date, baseDate: Date): String = js.native
    def apply(date: Date, baseDate: Date, options: AddSuffix): String = js.native
  }
}
