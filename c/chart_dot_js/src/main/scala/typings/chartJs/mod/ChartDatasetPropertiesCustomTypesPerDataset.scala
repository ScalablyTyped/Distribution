package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDatasetPropertiesCustomTypesPerDataset[TType /* <: ChartType */, TData] extends StObject {
  
  var data: TData
  
  var `type`: TType
}
object ChartDatasetPropertiesCustomTypesPerDataset {
  
  inline def apply[TType /* <: ChartType */, TData](data: TData, `type`: TType): ChartDatasetPropertiesCustomTypesPerDataset[TType, TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDatasetPropertiesCustomTypesPerDataset[TType, TData]]
  }
  
  extension [Self <: ChartDatasetPropertiesCustomTypesPerDataset[?, ?], TType /* <: ChartType */, TData](x: Self & (ChartDatasetPropertiesCustomTypesPerDataset[TType, TData])) {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
