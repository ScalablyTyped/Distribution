package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.LogarithmicScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsLogarithmicScaleOptions extends StObject {
  
  var options: LogarithmicScaleOptions
}
object OptionsLogarithmicScaleOptions {
  
  inline def apply(options: LogarithmicScaleOptions): OptionsLogarithmicScaleOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsLogarithmicScaleOptions]
  }
  
  extension [Self <: OptionsLogarithmicScaleOptions](x: Self) {
    
    inline def setOptions(value: LogarithmicScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
