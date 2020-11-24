package typings.dateFns.mod

import typings.dateFns.anon.UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns", "parse")
@js.native
object parse extends js.Object {
  
  def apply(dateString: String, formatString: String, referenceDate: Double): Date = js.native
  def apply(
    dateString: String,
    formatString: String,
    referenceDate: Double,
    options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
  ): Date = js.native
  def apply(dateString: String, formatString: String, referenceDate: Date): Date = js.native
  def apply(
    dateString: String,
    formatString: String,
    referenceDate: Date,
    options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
  ): Date = js.native
}
