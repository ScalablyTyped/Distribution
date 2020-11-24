package typings.dateFns

import typings.dateFns.anon.AddSuffix
import typings.dateFns.anon.IncludeSeconds
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/formatDistanceToNow", JSImport.Namespace)
@js.native
object formatDistanceToNowMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double): String = js.native
    def apply(date: Double, options: AddSuffix): String = js.native
    def apply(date: Double, options: IncludeSeconds): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: AddSuffix): String = js.native
    def apply(date: Date, options: IncludeSeconds): String = js.native
  }
}
