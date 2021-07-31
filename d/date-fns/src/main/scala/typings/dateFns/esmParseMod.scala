package typings.dateFns

import typings.dateFns.anon.UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
import typings.dateFns.anon.UseAdditionalWeekYearTokensWeekStartsOn
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmParseMod {
  
  object default {
    
    @scala.inline
    def apply(dateString: String, formatString: String, referenceDate: Double): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: UseAdditionalWeekYearTokensWeekStartsOn
    ): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(dateString: String, formatString: String, referenceDate: Date): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Date,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Date,
      options: UseAdditionalWeekYearTokensWeekStartsOn
    ): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/parse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
