package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.LogarithmicScaleOptions
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsLogarithmicScaleOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: LogarithmicScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
