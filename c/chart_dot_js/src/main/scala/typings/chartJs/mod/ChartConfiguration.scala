package typings.chartJs.mod

import typings.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartConfiguration[TType /* <: ChartType */, TData, TLabel] extends StObject {
  
  var data: ChartData[TType, TData, TLabel]
  
  var options: js.UndefOr[ChartOptions[TType]] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Plugin[TType, AnyObject]]] = js.undefined
  
  var `type`: TType
}
object ChartConfiguration {
  
  inline def apply[TType /* <: ChartType */, TData, TLabel](data: ChartData[TType, TData, TLabel], `type`: TType): ChartConfiguration[TType, TData, TLabel] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartConfiguration[TType, TData, TLabel]]
  }
  
  extension [Self <: ChartConfiguration[?, ?, ?], TType /* <: ChartType */, TData, TLabel](x: Self & (ChartConfiguration[TType, TData, TLabel])) {
    
    inline def setData(value: ChartData[TType, TData, TLabel]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ChartOptions[TType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin[TType, AnyObject]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (Plugin[TType, AnyObject])*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
