package typings.dateFnsUpgrade

import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`0`
import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`1`
import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`2`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyParseMod {
  
  @JSImport("@date-fns/upgrade/v2/legacyParse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(argument: js.Any): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def default(argument: js.Any, options: LegacyParseOptions): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  trait LegacyParseOptions extends StObject {
    
    var additionalDigits: js.UndefOr[`0` | `1` | `2`] = js.undefined
  }
  object LegacyParseOptions {
    
    inline def apply(): LegacyParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyParseOptions]
    }
    
    extension [Self <: LegacyParseOptions](x: Self) {
      
      inline def setAdditionalDigits(value: `0` | `1` | `2`): Self = StObject.set(x, "additionalDigits", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDigitsUndefined: Self = StObject.set(x, "additionalDigits", js.undefined)
    }
  }
}
