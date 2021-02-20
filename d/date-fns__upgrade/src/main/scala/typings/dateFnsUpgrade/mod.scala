package typings.dateFnsUpgrade

import typings.dateFnsUpgrade.legacyParseMod.LegacyParseOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object v2 {
    
    @JSImport("@date-fns/upgrade", "v2.convertTokens")
    @js.native
    def convertTokens(format: String): String = js.native
    
    @JSImport("@date-fns/upgrade", "v2.legacyParse")
    @js.native
    def legacyParse(argument: js.Any): Date = js.native
    @JSImport("@date-fns/upgrade", "v2.legacyParse")
    @js.native
    def legacyParse(argument: js.Any, options: LegacyParseOptions): Date = js.native
    
    @JSImport("@date-fns/upgrade", "v2.legacyParseMap")
    @js.native
    def legacyParseMap(array: js.Array[_]): js.Array[Date] = js.native
  }
}
