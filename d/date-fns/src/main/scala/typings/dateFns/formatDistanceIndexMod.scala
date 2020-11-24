package typings.dateFns

import typings.dateFns.anon.IncludeSeconds
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/formatDistance/index", JSImport.Namespace)
@js.native
object formatDistanceIndexMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, baseDate: Double): String = js.native
    def apply(date: Double, baseDate: Double, options: IncludeSeconds): String = js.native
    def apply(date: Double, baseDate: Date): String = js.native
    def apply(date: Double, baseDate: Date, options: IncludeSeconds): String = js.native
    def apply(date: Date, baseDate: Double): String = js.native
    def apply(date: Date, baseDate: Double, options: IncludeSeconds): String = js.native
    def apply(date: Date, baseDate: Date): String = js.native
    def apply(date: Date, baseDate: Date, options: IncludeSeconds): String = js.native
  }
}
