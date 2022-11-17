package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TData represents the data point type. If unspecified, a default is provided
  *   based on the chart type.
  * TLabel represents the label type
  */
trait ChartData[TType /* <: ChartType */, TData, TLabel] extends StObject {
  
  var datasets: js.Array[ChartDataset[TType, TData]]
  
  var labels: js.UndefOr[js.Array[TLabel]] = js.undefined
}
object ChartData {
  
  inline def apply[TType /* <: ChartType */, TData, TLabel](datasets: js.Array[ChartDataset[TType, TData]]): ChartData[TType, TData, TLabel] = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData[TType, TData, TLabel]]
  }
  
  extension [Self <: ChartData[?, ?, ?], TType /* <: ChartType */, TData, TLabel](x: Self & (ChartData[TType, TData, TLabel])) {
    
    inline def setDatasets(value: js.Array[ChartDataset[TType, TData]]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsVarargs(value: (ChartDataset[TType, TData])*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setLabels(value: js.Array[TLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: TLabel*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
