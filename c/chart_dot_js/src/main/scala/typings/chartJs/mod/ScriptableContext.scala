package typings.chartJs.mod

import typings.chartJs.typesUtilsMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableContext[TType /* <: ChartType */] extends StObject {
  
  var active: Boolean
  
  var chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]
  
  var dataIndex: Double
  
  var dataset: UnionToIntersection[ChartDataset[TType, DefaultDataPoint[TType]]]
  
  var datasetIndex: Double
  
  var mode: String
  
  var parsed: UnionToIntersection[ParsedDataType[TType]]
  
  var raw: Any
  
  var `type`: String
}
object ScriptableContext {
  
  inline def apply[TType /* <: ChartType */](
    active: Boolean,
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    dataIndex: Double,
    dataset: UnionToIntersection[ChartDataset[TType, DefaultDataPoint[TType]]],
    datasetIndex: Double,
    mode: String,
    parsed: UnionToIntersection[ParsedDataType[TType]],
    raw: Any,
    `type`: String
  ): ScriptableContext[TType] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptableContext[TType]]
  }
  
  extension [Self <: ScriptableContext[?], TType /* <: ChartType */](x: Self & ScriptableContext[TType]) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setChart(value: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDataset(value: UnionToIntersection[ChartDataset[TType, DefaultDataPoint[TType]]]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParsed(value: UnionToIntersection[ParsedDataType[TType]]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
