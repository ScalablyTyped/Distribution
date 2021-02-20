package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDate
import typings.dateFns.anon.UseAdditionalDayOfYearTokens
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  object default {
    
    @JSImport("date-fns/esm/format", JSImport.Default)
    @js.native
    def apply(date: Double, format: String): String = js.native
    @JSImport("date-fns/esm/format", JSImport.Default)
    @js.native
    def apply(date: Double, format: String, options: FirstWeekContainsDate): String = js.native
    @JSImport("date-fns/esm/format", JSImport.Default)
    @js.native
    def apply(date: Double, format: String, options: UseAdditionalDayOfYearTokens): String = js.native
    @JSImport("date-fns/esm/format", JSImport.Default)
    @js.native
    def apply(date: Date, format: String): String = js.native
    @JSImport("date-fns/esm/format", JSImport.Default)
    @js.native
    def apply(date: Date, format: String, options: FirstWeekContainsDate): String = js.native
    @JSImport("date-fns/esm/format", JSImport.Default)
    @js.native
    def apply(date: Date, format: String, options: UseAdditionalDayOfYearTokens): String = js.native
  }
}
