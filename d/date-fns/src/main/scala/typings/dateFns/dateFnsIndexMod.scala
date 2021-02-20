package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDate
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsIndexMod {
  
  object default {
    
    @JSImport("date-fns/format/index", JSImport.Default)
    @js.native
    def apply(date: Double, format: String): String = js.native
    @JSImport("date-fns/format/index", JSImport.Default)
    @js.native
    def apply(date: Double, format: String, options: FirstWeekContainsDate): String = js.native
    @JSImport("date-fns/format/index", JSImport.Default)
    @js.native
    def apply(date: Date, format: String): String = js.native
    @JSImport("date-fns/format/index", JSImport.Default)
    @js.native
    def apply(date: Date, format: String, options: FirstWeekContainsDate): String = js.native
  }
}
