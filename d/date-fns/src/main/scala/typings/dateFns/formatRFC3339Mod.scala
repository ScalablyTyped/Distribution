package typings.dateFns

import typings.dateFns.anon.FractionDigits
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/formatRFC3339", JSImport.Namespace)
@js.native
object formatRFC3339Mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double): String = js.native
    def apply(date: Double, options: FractionDigits): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: FractionDigits): String = js.native
  }
}
