package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDate
import typings.dateFns.anon.UseAdditionalDayOfYearTokens
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, format: String): String = js.native
    def apply(date: Double, format: String, options: FirstWeekContainsDate): String = js.native
    def apply(date: Double, format: String, options: UseAdditionalDayOfYearTokens): String = js.native
    def apply(date: Date, format: String): String = js.native
    def apply(date: Date, format: String, options: FirstWeekContainsDate): String = js.native
    def apply(date: Date, format: String, options: UseAdditionalDayOfYearTokens): String = js.native
  }
}
