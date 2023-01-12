package typings.chartJs.mod

import typings.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartConfigurationCustomTypesPerDataset[TType /* <: ChartType */, TData, TLabel] extends StObject {
  
  var data: ChartDataCustomTypesPerDataset[TType, TData, TLabel]
  
  var options: js.UndefOr[ChartOptions[TType]] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Plugin[TType, AnyObject]]] = js.undefined
}
object ChartConfigurationCustomTypesPerDataset {
  
  inline def apply[TType /* <: ChartType */, TData, TLabel](data: ChartDataCustomTypesPerDataset[TType, TData, TLabel]): ChartConfigurationCustomTypesPerDataset[TType, TData, TLabel] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartConfigurationCustomTypesPerDataset[TType, TData, TLabel]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartConfigurationCustomTypesPerDataset[?, ?, ?], TType /* <: ChartType */, TData, TLabel] (val x: Self & (ChartConfigurationCustomTypesPerDataset[TType, TData, TLabel])) extends AnyVal {
    
    inline def setData(value: ChartDataCustomTypesPerDataset[TType, TData, TLabel]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ChartOptions[TType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin[TType, AnyObject]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (Plugin[TType, AnyObject])*): Self = StObject.set(x, "plugins", js.Array(value*))
  }
}
