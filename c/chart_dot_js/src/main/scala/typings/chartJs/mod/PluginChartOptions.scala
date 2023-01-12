package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginChartOptions[TType /* <: ChartType */] extends StObject {
  
  var plugins: PluginOptionsByType[TType]
}
object PluginChartOptions {
  
  inline def apply[TType /* <: ChartType */](plugins: PluginOptionsByType[TType]): PluginChartOptions[TType] = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginChartOptions[TType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginChartOptions[?], TType /* <: ChartType */] (val x: Self & PluginChartOptions[TType]) extends AnyVal {
    
    inline def setPlugins(value: PluginOptionsByType[TType]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
