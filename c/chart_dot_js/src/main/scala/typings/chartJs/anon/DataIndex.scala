package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.C_
import typings.chartJs.distChunksHelpersDotcoreMod.E
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIndex extends StObject {
  
  var chart: C_
  
  var dataIndex: Double
  
  var dataset: Any
  
  var datasetIndex: Double
  
  var element: E[AnyObject, AnyObject]
  
  var formattedValue: Any
  
  var label: Any
  
  var parsed: Any
  
  var raw: Any
}
object DataIndex {
  
  inline def apply(
    chart: C_,
    dataIndex: Double,
    dataset: Any,
    datasetIndex: Double,
    element: E[AnyObject, AnyObject],
    formattedValue: Any,
    label: Any,
    parsed: Any,
    raw: Any
  ): DataIndex = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
  
  extension [Self <: DataIndex](x: Self) {
    
    inline def setChart(value: C_): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDataset(value: Any): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setElement(value: E[AnyObject, AnyObject]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setFormattedValue(value: Any): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setParsed(value: Any): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
