package typings.chartJs.distChunksHelpersDotcoreMod

import typings.chartJs.anon.Options
import typings.chartJs.anon.OptionsCategoryScaleOptions
import typings.chartJs.anon.OptionsLogarithmicScaleOptions
import typings.chartJs.anon.OptionsTimeScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartesianScaleTypeRegistry extends StObject {
  
  var category: OptionsCategoryScaleOptions
  
  var linear: Options
  
  var logarithmic: OptionsLogarithmicScaleOptions
  
  var time: OptionsTimeScaleOptions
  
  var timeseries: OptionsTimeScaleOptions
}
object CartesianScaleTypeRegistry {
  
  inline def apply(
    category: OptionsCategoryScaleOptions,
    linear: Options,
    logarithmic: OptionsLogarithmicScaleOptions,
    time: OptionsTimeScaleOptions,
    timeseries: OptionsTimeScaleOptions
  ): CartesianScaleTypeRegistry = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], logarithmic = logarithmic.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeseries = timeseries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianScaleTypeRegistry]
  }
  
  extension [Self <: CartesianScaleTypeRegistry](x: Self) {
    
    inline def setCategory(value: OptionsCategoryScaleOptions): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: Options): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLogarithmic(value: OptionsLogarithmicScaleOptions): Self = StObject.set(x, "logarithmic", value.asInstanceOf[js.Any])
    
    inline def setTime(value: OptionsTimeScaleOptions): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeseries(value: OptionsTimeScaleOptions): Self = StObject.set(x, "timeseries", value.asInstanceOf[js.Any])
  }
}
