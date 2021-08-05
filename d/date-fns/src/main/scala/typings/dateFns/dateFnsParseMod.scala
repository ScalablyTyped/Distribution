package typings.dateFns

import typings.dateFns.anon.UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsParseMod {
  
  object default {
    
    inline def apply(dateString: String, formatString: String, referenceDate: Double): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(dateString: String, formatString: String, referenceDate: Date): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(
      dateString: String,
      formatString: String,
      referenceDate: Date,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/parse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
