package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/parse", JSImport.Namespace)
@js.native
object esmParseMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateString: String, formatString: String, backupDate: Double): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Double,
      options: AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Double,
      options: AnonUseAdditionalWeekYearTokensWeekStartsOn
    ): Date = js.native
    def apply(dateString: String, formatString: String, backupDate: Date): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Date,
      options: AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Date,
      options: AnonUseAdditionalWeekYearTokensWeekStartsOn
    ): Date = js.native
  }
  
}

