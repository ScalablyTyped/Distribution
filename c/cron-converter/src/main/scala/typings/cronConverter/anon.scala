package typings.cronConverter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<cron-converter.cron-converter/dist/mjs/types.Options> */
  trait PartialOptions extends StObject {
    
    var outputHashes: js.UndefOr[Boolean] = js.undefined
    
    var outputMonthNames: js.UndefOr[Boolean] = js.undefined
    
    var outputWeekdayNames: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setOutputHashes(value: Boolean): Self = StObject.set(x, "outputHashes", value.asInstanceOf[js.Any])
      
      inline def setOutputHashesUndefined: Self = StObject.set(x, "outputHashes", js.undefined)
      
      inline def setOutputMonthNames(value: Boolean): Self = StObject.set(x, "outputMonthNames", value.asInstanceOf[js.Any])
      
      inline def setOutputMonthNamesUndefined: Self = StObject.set(x, "outputMonthNames", js.undefined)
      
      inline def setOutputWeekdayNames(value: Boolean): Self = StObject.set(x, "outputWeekdayNames", value.asInstanceOf[js.Any])
      
      inline def setOutputWeekdayNamesUndefined: Self = StObject.set(x, "outputWeekdayNames", js.undefined)
    }
  }
}
