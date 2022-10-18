package typings.chartJs.mod

import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesElementMod.Element
import typings.chartJs.typesUtilsMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipItem[TType /* <: ChartType */] extends StObject {
  
  /**
    * The chart the tooltip is being shown on
    */
  var chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]
  
  /**
    * Index of this data item in the dataset
    */
  var dataIndex: Double
  
  /**
    * The dataset the item comes from
    */
  var dataset: UnionToIntersection[ChartDataset[TType, DefaultDataPoint[TType]]]
  
  /**
    * Index of the dataset the item comes from
    */
  var datasetIndex: Double
  
  /**
    * The chart element (point, arc, bar, etc.) for this tooltip item
    */
  var element: Element[AnyObject, AnyObject]
  
  /**
    * Formatted value for the tooltip
    */
  var formattedValue: String
  
  /**
    * Label for the tooltip
    */
  var label: String
  
  /**
    * Parsed data values for the given `dataIndex` and `datasetIndex`
    */
  var parsed: UnionToIntersection[ParsedDataType[TType]]
  
  /**
    * Raw data values for the given `dataIndex` and `datasetIndex`
    */
  var raw: Any
}
object TooltipItem {
  
  inline def apply[TType /* <: ChartType */](
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    dataIndex: Double,
    dataset: UnionToIntersection[ChartDataset[TType, DefaultDataPoint[TType]]],
    datasetIndex: Double,
    element: Element[AnyObject, AnyObject],
    formattedValue: String,
    label: String,
    parsed: UnionToIntersection[ParsedDataType[TType]],
    raw: Any
  ): TooltipItem[TType] = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipItem[TType]]
  }
  
  extension [Self <: TooltipItem[?], TType /* <: ChartType */](x: Self & TooltipItem[TType]) {
    
    inline def setChart(value: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDataset(value: UnionToIntersection[ChartDataset[TType, DefaultDataPoint[TType]]]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element[AnyObject, AnyObject]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setParsed(value: UnionToIntersection[ParsedDataType[TType]]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
