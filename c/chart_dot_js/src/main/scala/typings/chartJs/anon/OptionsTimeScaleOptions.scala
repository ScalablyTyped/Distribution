package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.TimeScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTimeScaleOptions extends StObject {
  
  var options: TimeScaleOptions
}
object OptionsTimeScaleOptions {
  
  inline def apply(options: TimeScaleOptions): OptionsTimeScaleOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTimeScaleOptions]
  }
  
  extension [Self <: OptionsTimeScaleOptions](x: Self) {
    
    inline def setOptions(value: TimeScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
