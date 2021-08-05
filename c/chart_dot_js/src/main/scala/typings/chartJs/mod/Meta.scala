package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  @JSName("$filler")
  var $filler: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var controller: StringDictionary[js.Any]
  
  var data: js.Array[MetaData]
  
  var dataset: js.UndefOr[ChartDataSets] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var total: js.UndefOr[String] = js.undefined
  
  var `type`: ChartType
  
  var xAxisID: js.UndefOr[String] = js.undefined
  
  var yAxisID: js.UndefOr[String] = js.undefined
}
object Meta {
  
  inline def apply(controller: StringDictionary[js.Any], data: js.Array[MetaData], `type`: ChartType): Meta = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def set$filler(value: StringDictionary[js.Any]): Self = StObject.set(x, "$filler", value.asInstanceOf[js.Any])
    
    inline def set$fillerUndefined: Self = StObject.set(x, "$filler", js.undefined)
    
    inline def setController(value: StringDictionary[js.Any]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[MetaData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: MetaData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDataset(value: ChartDataSets): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: ChartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxisID(value: String): Self = StObject.set(x, "xAxisID", value.asInstanceOf[js.Any])
    
    inline def setXAxisIDUndefined: Self = StObject.set(x, "xAxisID", js.undefined)
    
    inline def setYAxisID(value: String): Self = StObject.set(x, "yAxisID", value.asInstanceOf[js.Any])
    
    inline def setYAxisIDUndefined: Self = StObject.set(x, "yAxisID", js.undefined)
  }
}
