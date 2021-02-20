package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartConfiguration extends StObject {
  
  var data: js.UndefOr[ChartData] = js.native
  
  var options: js.UndefOr[ChartOptions] = js.native
  
  var plugins: js.UndefOr[js.Array[PluginServiceRegistrationOptions]] = js.native
  
  var `type`: js.UndefOr[ChartType | String] = js.native
}
object ChartConfiguration {
  
  @scala.inline
  def apply(): ChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartConfiguration]
  }
  
  @scala.inline
  implicit class ChartConfigurationMutableBuilder[Self <: ChartConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOptions(value: ChartOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[PluginServiceRegistrationOptions]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: PluginServiceRegistrationOptions*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ChartType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
