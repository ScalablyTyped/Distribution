package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendLabelItem
  extends StObject
     with ChartLegendItem {
  
  var datasetIndex: js.UndefOr[Double] = js.undefined
}
object ChartLegendLabelItem {
  
  inline def apply(): ChartLegendLabelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendLabelItem]
  }
  
  extension [Self <: ChartLegendLabelItem](x: Self) {
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setDatasetIndexUndefined: Self = StObject.set(x, "datasetIndex", js.undefined)
  }
}
