package typings.dateFns

import typings.dateFns.anon.UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsIsMatchMod {
  
  object default {
    
    @scala.inline
    def apply(dateString: String, formatString: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(
      dateString: String,
      formatString: String,
      options: UseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/isMatch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
