package typings.chartJs.mod

import typings.chartJs.chartJsStrings.single
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesElementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartMetaCommon[TElement /* <: Element[AnyObject, AnyObject] */, TDatasetElement /* <: Element[AnyObject, AnyObject] */] extends StObject {
  
  var _parsed: js.Array[Any]
  
  var _sorted: Boolean
  
  var _stacked: Boolean | single
  
  var controller: DatasetController[
    ChartType, 
    Element[AnyObject, AnyObject], 
    Element[AnyObject, AnyObject], 
    ParsedDataType[ChartType]
  ]
  
  var data: js.Array[TElement]
  
  var dataset: js.UndefOr[TDatasetElement] = js.undefined
  
  var hidden: Boolean
  
  var iAxisID: String
  
  var iScale: js.UndefOr[Scale[CoreScaleOptions]] = js.undefined
  
  var index: Double
  
  var indexAxis: x | y
  
  var label: String
  
  var order: Double
  
  var rAxisID: js.UndefOr[String] = js.undefined
  
  var rScale: js.UndefOr[Scale[CoreScaleOptions]] = js.undefined
  
  var stack: Double
  
  var `type`: String
  
  var vAxisID: String
  
  var vScale: js.UndefOr[Scale[CoreScaleOptions]] = js.undefined
  
  var visible: Boolean
  
  var xAxisID: js.UndefOr[String] = js.undefined
  
  var xScale: js.UndefOr[Scale[CoreScaleOptions]] = js.undefined
  
  var yAxisID: js.UndefOr[String] = js.undefined
  
  var yScale: js.UndefOr[Scale[CoreScaleOptions]] = js.undefined
}
object ChartMetaCommon {
  
  inline def apply[TElement /* <: Element[AnyObject, AnyObject] */, TDatasetElement /* <: Element[AnyObject, AnyObject] */](
    _parsed: js.Array[Any],
    _sorted: Boolean,
    _stacked: Boolean | single,
    controller: DatasetController[
      ChartType, 
      Element[AnyObject, AnyObject], 
      Element[AnyObject, AnyObject], 
      ParsedDataType[ChartType]
    ],
    data: js.Array[TElement],
    hidden: Boolean,
    iAxisID: String,
    index: Double,
    indexAxis: x | y,
    label: String,
    order: Double,
    stack: Double,
    `type`: String,
    vAxisID: String,
    visible: Boolean
  ): ChartMetaCommon[TElement, TDatasetElement] = {
    val __obj = js.Dynamic.literal(_parsed = _parsed.asInstanceOf[js.Any], _sorted = _sorted.asInstanceOf[js.Any], _stacked = _stacked.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], iAxisID = iAxisID.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], vAxisID = vAxisID.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMetaCommon[TElement, TDatasetElement]]
  }
  
  extension [Self <: ChartMetaCommon[?, ?], TElement /* <: Element[AnyObject, AnyObject] */, TDatasetElement /* <: Element[AnyObject, AnyObject] */](x: Self & (ChartMetaCommon[TElement, TDatasetElement])) {
    
    inline def setController(
      value: DatasetController[
          ChartType, 
          Element[AnyObject, AnyObject], 
          Element[AnyObject, AnyObject], 
          ParsedDataType[ChartType]
        ]
    ): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[TElement]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: TElement*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDataset(value: TDatasetElement): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setIAxisID(value: String): Self = StObject.set(x, "iAxisID", value.asInstanceOf[js.Any])
    
    inline def setIScale(value: Scale[CoreScaleOptions]): Self = StObject.set(x, "iScale", value.asInstanceOf[js.Any])
    
    inline def setIScaleUndefined: Self = StObject.set(x, "iScale", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "indexAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setRAxisID(value: String): Self = StObject.set(x, "rAxisID", value.asInstanceOf[js.Any])
    
    inline def setRAxisIDUndefined: Self = StObject.set(x, "rAxisID", js.undefined)
    
    inline def setRScale(value: Scale[CoreScaleOptions]): Self = StObject.set(x, "rScale", value.asInstanceOf[js.Any])
    
    inline def setRScaleUndefined: Self = StObject.set(x, "rScale", js.undefined)
    
    inline def setStack(value: Double): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVAxisID(value: String): Self = StObject.set(x, "vAxisID", value.asInstanceOf[js.Any])
    
    inline def setVScale(value: Scale[CoreScaleOptions]): Self = StObject.set(x, "vScale", value.asInstanceOf[js.Any])
    
    inline def setVScaleUndefined: Self = StObject.set(x, "vScale", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setXAxisID(value: String): Self = StObject.set(x, "xAxisID", value.asInstanceOf[js.Any])
    
    inline def setXAxisIDUndefined: Self = StObject.set(x, "xAxisID", js.undefined)
    
    inline def setXScale(value: Scale[CoreScaleOptions]): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
    
    inline def setYAxisID(value: String): Self = StObject.set(x, "yAxisID", value.asInstanceOf[js.Any])
    
    inline def setYAxisIDUndefined: Self = StObject.set(x, "yAxisID", js.undefined)
    
    inline def setYScale(value: Scale[CoreScaleOptions]): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    
    inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
    
    inline def set_parsed(value: js.Array[Any]): Self = StObject.set(x, "_parsed", value.asInstanceOf[js.Any])
    
    inline def set_parsedVarargs(value: Any*): Self = StObject.set(x, "_parsed", js.Array(value*))
    
    inline def set_sorted(value: Boolean): Self = StObject.set(x, "_sorted", value.asInstanceOf[js.Any])
    
    inline def set_stacked(value: Boolean | single): Self = StObject.set(x, "_stacked", value.asInstanceOf[js.Any])
  }
}
