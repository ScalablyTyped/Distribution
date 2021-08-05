package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTooltipItem extends StObject {
  
  var datasetIndex: js.UndefOr[Double] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xLabel: js.UndefOr[String | Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yLabel: js.UndefOr[String | Double] = js.undefined
}
object ChartTooltipItem {
  
  inline def apply(): ChartTooltipItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipItem]
  }
  
  extension [Self <: ChartTooltipItem](x: Self) {
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setDatasetIndexUndefined: Self = StObject.set(x, "datasetIndex", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXLabel(value: String | Double): Self = StObject.set(x, "xLabel", value.asInstanceOf[js.Any])
    
    inline def setXLabelUndefined: Self = StObject.set(x, "xLabel", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYLabel(value: String | Double): Self = StObject.set(x, "yLabel", value.asInstanceOf[js.Any])
    
    inline def setYLabelUndefined: Self = StObject.set(x, "yLabel", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
