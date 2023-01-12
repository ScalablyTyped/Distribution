package typings.chartJs.anon

import typings.chartJs.mod.TimeScaleOptions
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsTimeScaleOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: TimeScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
