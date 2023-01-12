package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDataCustomTypesPerDataset[TType /* <: ChartType */, TData, TLabel] extends StObject {
  
  var datasets: js.Array[ChartDatasetCustomTypesPerDataset[TType, TData]]
  
  var labels: js.UndefOr[js.Array[TLabel]] = js.undefined
}
object ChartDataCustomTypesPerDataset {
  
  inline def apply[TType /* <: ChartType */, TData, TLabel](datasets: js.Array[ChartDatasetCustomTypesPerDataset[TType, TData]]): ChartDataCustomTypesPerDataset[TType, TData, TLabel] = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataCustomTypesPerDataset[TType, TData, TLabel]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartDataCustomTypesPerDataset[?, ?, ?], TType /* <: ChartType */, TData, TLabel] (val x: Self & (ChartDataCustomTypesPerDataset[TType, TData, TLabel])) extends AnyVal {
    
    inline def setDatasets(value: js.Array[ChartDatasetCustomTypesPerDataset[TType, TData]]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsVarargs(value: (ChartDatasetCustomTypesPerDataset[TType, TData])*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setLabels(value: js.Array[TLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: TLabel*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
