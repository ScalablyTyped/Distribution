package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.RadialLinearScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsRadialLinearScaleOptions extends StObject {
  
  var options: RadialLinearScaleOptions
}
object OptionsRadialLinearScaleOptions {
  
  inline def apply(options: RadialLinearScaleOptions): OptionsRadialLinearScaleOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsRadialLinearScaleOptions]
  }
  
  extension [Self <: OptionsRadialLinearScaleOptions](x: Self) {
    
    inline def setOptions(value: RadialLinearScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
