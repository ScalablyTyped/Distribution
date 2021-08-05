package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartOptions extends StObject {
  
  var plugins: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * If true the whole data is reversed including labels, the series order as well as the whole series data arrays.
    */
  var reverseData: js.UndefOr[Boolean] = js.undefined
}
object IChartOptions {
  
  inline def apply(): IChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartOptions]
  }
  
  extension [Self <: IChartOptions](x: Self) {
    
    inline def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
    
    inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
  }
}
