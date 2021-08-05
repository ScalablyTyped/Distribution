package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartConfiguration extends StObject {
  
  var data: js.UndefOr[ChartData] = js.undefined
  
  var options: js.UndefOr[ChartOptions] = js.undefined
  
  var plugins: js.UndefOr[js.Array[PluginServiceRegistrationOptions]] = js.undefined
  
  var `type`: js.UndefOr[ChartType | String] = js.undefined
}
object ChartConfiguration {
  
  inline def apply(): ChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartConfiguration]
  }
  
  extension [Self <: ChartConfiguration](x: Self) {
    
    inline def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setOptions(value: ChartOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPlugins(value: js.Array[PluginServiceRegistrationOptions]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: PluginServiceRegistrationOptions*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setType(value: ChartType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
