package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.bottom
import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.data
import typings.chartJs.chartJsStrings.left
import typings.chartJs.chartJsStrings.right
import typings.chartJs.chartJsStrings.single
import typings.chartJs.chartJsStrings.ticks
import typings.chartJs.chartJsStrings.timeseries
import typings.chartJs.chartJsStrings.top
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.mod.CartesianTickOptions
import typings.chartJs.mod.CoreScaleOptions
import typings.chartJs.mod.GridLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'timeseries'} & chart.js.chart.js.TimeScaleOptions */
trait typetimeseriesTimeScaleOp extends StObject {
  
  /**
    * options for creating a new adapter instance
    */
  var adapters: Date
  
  def afterBuildTicks(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("afterBuildTicks")
  var afterBuildTicks_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def afterCalculateLabelRotation(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("afterCalculateLabelRotation")
  var afterCalculateLabelRotation_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def afterDataLimits(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("afterDataLimits")
  var afterDataLimits_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def afterFit(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("afterFit")
  var afterFit_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def afterSetDimensions(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("afterSetDimensions")
  var afterSetDimensions_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def afterTickToLabelConversion(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("afterTickToLabelConversion")
  var afterTickToLabelConversion_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def afterUpdate(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("afterUpdate")
  var afterUpdate_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  var alignToPixels: Boolean
  
  var axis: x | y
  
  def beforeBuildTicks(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("beforeBuildTicks")
  var beforeBuildTicks_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def beforeCalculateLabelRotation(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("beforeCalculateLabelRotation")
  var beforeCalculateLabelRotation_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def beforeDataLimits(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("beforeDataLimits")
  var beforeDataLimits_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def beforeFit(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("beforeFit")
  var beforeFit_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def beforeSetDimensions(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("beforeSetDimensions")
  var beforeSetDimensions_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def beforeTickToLabelConversion(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("beforeTickToLabelConversion")
  var beforeTickToLabelConversion_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  def beforeUpdate(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  @JSName("beforeUpdate")
  var beforeUpdate_Original: js.Function1[/* axis */ typings.chartJs.mod.Scale[CoreScaleOptions], Unit]
  
  /**
    * Scale boundary strategy (bypassed by min/max time options)
    * - `data`: make sure data are fully visible, ticks outside are removed
    * - `ticks`: make sure ticks are fully visible, data outside are truncated
    * @since 2.7.0
    * @default 'data'
    */
  var bounds: ticks | data
  
  var display: Boolean | auto
  
  var grid: GridLineOptions
  
  var max: String | Double
  
  var min: String | Double
  
  var offset: Boolean
  
  /**
    * If true, bar chart offsets are computed with skipped tick sizes
    * @since 3.8.0
    * @default false
    */
  var offsetAfterAutoskip: Boolean
  
  var position: left | top | right | bottom | center | StringDictionary[Double]
  
  var reverse: Boolean
  
  var stack: js.UndefOr[String] = js.undefined
  
  var stackWeight: js.UndefOr[Double] = js.undefined
  
  var stacked: js.UndefOr[Boolean | single] = js.undefined
  
  var suggestedMax: String | Double
  
  var suggestedMin: String | Double
  
  var ticks: CartesianTickOptions & Source
  
  var time: DisplayFormats
  
  var title: Display
  
  var `type`: timeseries
  
  var weight: Double
}
object typetimeseriesTimeScaleOp {
  
  inline def apply(
    adapters: Date,
    afterBuildTicks: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterCalculateLabelRotation: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterDataLimits: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterFit: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterSetDimensions: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterTickToLabelConversion: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterUpdate: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    alignToPixels: Boolean,
    axis: x | y,
    beforeBuildTicks: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeCalculateLabelRotation: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeDataLimits: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeFit: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeSetDimensions: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeTickToLabelConversion: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeUpdate: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    bounds: ticks | data,
    display: Boolean | auto,
    grid: GridLineOptions,
    max: String | Double,
    min: String | Double,
    offset: Boolean,
    offsetAfterAutoskip: Boolean,
    position: left | top | right | bottom | center | StringDictionary[Double],
    reverse: Boolean,
    suggestedMax: String | Double,
    suggestedMin: String | Double,
    ticks: CartesianTickOptions & Source,
    time: DisplayFormats,
    title: Display,
    weight: Double
  ): typetimeseriesTimeScaleOp = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], afterBuildTicks = js.Any.fromFunction1(afterBuildTicks), afterCalculateLabelRotation = js.Any.fromFunction1(afterCalculateLabelRotation), afterDataLimits = js.Any.fromFunction1(afterDataLimits), afterFit = js.Any.fromFunction1(afterFit), afterSetDimensions = js.Any.fromFunction1(afterSetDimensions), afterTickToLabelConversion = js.Any.fromFunction1(afterTickToLabelConversion), afterUpdate = js.Any.fromFunction1(afterUpdate), alignToPixels = alignToPixels.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1(beforeBuildTicks), beforeCalculateLabelRotation = js.Any.fromFunction1(beforeCalculateLabelRotation), beforeDataLimits = js.Any.fromFunction1(beforeDataLimits), beforeFit = js.Any.fromFunction1(beforeFit), beforeSetDimensions = js.Any.fromFunction1(beforeSetDimensions), beforeTickToLabelConversion = js.Any.fromFunction1(beforeTickToLabelConversion), beforeUpdate = js.Any.fromFunction1(beforeUpdate), bounds = bounds.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], offsetAfterAutoskip = offsetAfterAutoskip.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], suggestedMax = suggestedMax.asInstanceOf[js.Any], suggestedMin = suggestedMin.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timeseries")
    __obj.asInstanceOf[typetimeseriesTimeScaleOp]
  }
  
  extension [Self <: typetimeseriesTimeScaleOp](x: Self) {
    
    inline def setAdapters(value: Date): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
    
    inline def setAfterBuildTicks(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction1(value))
    
    inline def setAfterCalculateLabelRotation(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterCalculateLabelRotation", js.Any.fromFunction1(value))
    
    inline def setAfterDataLimits(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1(value))
    
    inline def setAfterFit(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterFit", js.Any.fromFunction1(value))
    
    inline def setAfterSetDimensions(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterSetDimensions", js.Any.fromFunction1(value))
    
    inline def setAfterTickToLabelConversion(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setAfterUpdate(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    inline def setAlignToPixels(value: Boolean): Self = StObject.set(x, "alignToPixels", value.asInstanceOf[js.Any])
    
    inline def setAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBeforeBuildTicks(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1(value))
    
    inline def setBeforeCalculateLabelRotation(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeCalculateLabelRotation", js.Any.fromFunction1(value))
    
    inline def setBeforeDataLimits(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1(value))
    
    inline def setBeforeFit(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1(value))
    
    inline def setBeforeSetDimensions(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeSetDimensions", js.Any.fromFunction1(value))
    
    inline def setBeforeTickToLabelConversion(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setBeforeUpdate(value: /* axis */ typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
    
    inline def setBounds(value: ticks | data): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: GridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetAfterAutoskip(value: Boolean): Self = StObject.set(x, "offsetAfterAutoskip", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: left | top | right | bottom | center | StringDictionary[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStackWeight(value: Double): Self = StObject.set(x, "stackWeight", value.asInstanceOf[js.Any])
    
    inline def setStackWeightUndefined: Self = StObject.set(x, "stackWeight", js.undefined)
    
    inline def setStacked(value: Boolean | single): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def setSuggestedMax(value: String | Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMin(value: String | Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: CartesianTickOptions & Source): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTime(value: DisplayFormats): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Display): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: timeseries): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
