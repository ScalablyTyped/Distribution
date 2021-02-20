package typings.dateFnsUpgrade

import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`0`
import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`1`
import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`2`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyParseMod {
  
  @JSImport("@date-fns/upgrade/v2/legacyParse", JSImport.Default)
  @js.native
  def default(argument: js.Any): Date = js.native
  @JSImport("@date-fns/upgrade/v2/legacyParse", JSImport.Default)
  @js.native
  def default(argument: js.Any, options: LegacyParseOptions): Date = js.native
  
  @js.native
  trait LegacyParseOptions extends StObject {
    
    var additionalDigits: js.UndefOr[`0` | `1` | `2`] = js.native
  }
  object LegacyParseOptions {
    
    @scala.inline
    def apply(): LegacyParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyParseOptions]
    }
    
    @scala.inline
    implicit class LegacyParseOptionsMutableBuilder[Self <: LegacyParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalDigits(value: `0` | `1` | `2`): Self = StObject.set(x, "additionalDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalDigitsUndefined: Self = StObject.set(x, "additionalDigits", js.undefined)
    }
  }
}
