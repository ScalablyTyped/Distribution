package typings.dateFns

import typings.dateFns.anon.UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
import typings.dateFns.anon.UseAdditionalWeekYearTokensWeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/parse", JSImport.Namespace)
@js.native
object esmParseMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(dateString: String, formatString: String, referenceDate: Double): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: UseAdditionalWeekYearTokensWeekStartsOn
    ): Date = js.native
    def apply(dateString: String, formatString: String, referenceDate: Date): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Date,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Date,
      options: UseAdditionalWeekYearTokensWeekStartsOn
    ): Date = js.native
  }
}
