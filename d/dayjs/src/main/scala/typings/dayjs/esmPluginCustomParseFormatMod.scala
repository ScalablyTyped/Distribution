package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginCustomParseFormatMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/customParseFormat", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[PluginOptions] = js.native
  
  trait PluginOptions extends StObject {
    
    var parseTwoDigitYear: js.UndefOr[js.Function1[/* yearString */ String, Double]] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setParseTwoDigitYear(value: /* yearString */ String => Double): Self = StObject.set(x, "parseTwoDigitYear", js.Any.fromFunction1(value))
      
      inline def setParseTwoDigitYearUndefined: Self = StObject.set(x, "parseTwoDigitYear", js.undefined)
    }
  }
  
  type _To = PluginFunc[PluginOptions]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginCustomParseFormatMod.foo` */
  override def _to: PluginFunc[PluginOptions] = ^
}
