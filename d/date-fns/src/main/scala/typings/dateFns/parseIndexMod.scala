package typings.dateFns

import typings.dateFns.anon.UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseIndexMod {
  
  object default {
    
    inline def apply(dateString: String, formatString: String, referenceDate: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(
      dateString: String,
      formatString: String,
      referenceDate: js.Date,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(dateString: String, formatString: String, referenceDate: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], referenceDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/parse/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
