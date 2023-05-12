package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.bottom
import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.data
import typings.chartJs.chartJsStrings.left
import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.r
import typings.chartJs.chartJsStrings.right
import typings.chartJs.chartJsStrings.single
import typings.chartJs.chartJsStrings.ticks
import typings.chartJs.chartJsStrings.top
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.distTypesIndexMod.BorderOptions
import typings.chartJs.distTypesIndexMod.CoreScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'linear'} & chart.js.chart.js/dist/types/index.LinearScaleOptions */
trait typelinearLinearScaleOpti extends StObject {
  
  /**
    * Callback that runs after ticks are created. Useful for filtering ticks.
    */
  def afterBuildTicks(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after tick rotation is determined.
    */
  def afterCalculateLabelRotation(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after data limits are determined.
    */
  def afterDataLimits(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after the scale fits to the canvas.
    */
  def afterFit(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after dimensions are set.
    */
  def afterSetDimensions(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after ticks are converted into strings.
    */
  def afterTickToLabelConversion(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs at the end of the update process.
    */
  def afterUpdate(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Align pixel values to device pixels
    */
  var alignToPixels: Boolean
  
  /**
    *   Which type of axis this is. Possible values are: 'x', 'y', 'r'. If not set, this is inferred from the first character of the ID which should be 'x', 'y' or 'r'.
    */
  var axis: x | y | r
  
  /**
    * Callback that runs before ticks are created.
    */
  def beforeBuildTicks(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before tick rotation is determined.
    */
  def beforeCalculateLabelRotation(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before data limits are determined.
    */
  def beforeDataLimits(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before the scale fits to the canvas.
    */
  def beforeFit(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before dimensions are set.
    */
  def beforeSetDimensions(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before ticks are converted into strings.
    */
  def beforeTickToLabelConversion(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback called before the update process starts.
    */
  def beforeUpdate(axis: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Unit
  
  /**
    *  if true, scale will include 0 if it is not already included.
    * @default true
    */
  var beginAtZero: Boolean
  
  var border: BorderOptions
  
  /**
    * Scale boundary strategy (bypassed by min/max time options)
    * - `data`: make sure data are fully visible, ticks outside are removed
    * - `ticks`: make sure ticks are fully visible, data outside are truncated
    * @since 2.7.0
    * @default 'ticks'
    */
  var bounds: ticks | data
  
  /**
    * Controls the axis global visibility (visible when true, hidden when false). When display: 'auto', the axis is visible only if at least one associated dataset is visible.
    * @default true
    */
  var display: Boolean | auto
  
  /**
    * Percentage (string ending with %) or amount (number) for added room in the scale range above and below data.
    */
  var grace: js.UndefOr[String | Double] = js.undefined
  
  var grid: PartialGridLineOptions
  
  /**
    * User defined maximum value for the scale, overrides maximum value from data.
    */
  var max: Double
  
  /**
    * User defined minimum value for the scale, overrides minimum value from data.
    */
  var min: Double
  
  /**
    *   If true, extra space is added to the both edges and the axis is scaled to fit into the chart area. This is set to true for a bar chart by default.
    * @default false
    */
  var offset: Boolean
  
  /**
    * Position of the axis.
    */
  var position: left | top | right | bottom | center | StringDictionary[Double]
  
  /**
    * Reverse the scale.
    * @default false
    */
  var reverse: Boolean
  
  /**
    * Stack group. Axes at the same `position` with same `stack` are stacked.
    */
  var stack: js.UndefOr[String] = js.undefined
  
  /**
    * Weight of the scale in stack group. Used to determine the amount of allocated space for the scale within the group.
    * @default 1
    */
  var stackWeight: js.UndefOr[Double] = js.undefined
  
  /**
    *   If true, data will be comprised between datasets of data
    * @default false
    */
  var stacked: js.UndefOr[Boolean | single] = js.undefined
  
  /**
    * Adjustment used when calculating the minimum data value.
    */
  var suggestedMax: js.UndefOr[Double] = js.undefined
  
  /**
    * Adjustment used when calculating the maximum data value.
    */
  var suggestedMin: js.UndefOr[Double] = js.undefined
  
  var ticks: Format
  
  /** Options for the scale title. */
  var title: Display
  
  var `type`: linear
  
  /**
    * The weight used to sort the axis. Higher weights are further away from the chart area.
    * @default true
    */
  var weight: Double
}
object typelinearLinearScaleOpti {
  
  inline def apply(
    afterBuildTicks: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    afterCalculateLabelRotation: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    afterDataLimits: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    afterFit: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    afterSetDimensions: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    afterTickToLabelConversion: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    afterUpdate: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    alignToPixels: Boolean,
    axis: x | y | r,
    beforeBuildTicks: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    beforeCalculateLabelRotation: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    beforeDataLimits: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    beforeFit: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    beforeSetDimensions: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    beforeTickToLabelConversion: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    beforeUpdate: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit,
    beginAtZero: Boolean,
    border: BorderOptions,
    bounds: ticks | data,
    display: Boolean | auto,
    grid: PartialGridLineOptions,
    max: Double,
    min: Double,
    offset: Boolean,
    position: left | top | right | bottom | center | StringDictionary[Double],
    reverse: Boolean,
    ticks: Format,
    title: Display,
    weight: Double
  ): typelinearLinearScaleOpti = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1(afterBuildTicks), afterCalculateLabelRotation = js.Any.fromFunction1(afterCalculateLabelRotation), afterDataLimits = js.Any.fromFunction1(afterDataLimits), afterFit = js.Any.fromFunction1(afterFit), afterSetDimensions = js.Any.fromFunction1(afterSetDimensions), afterTickToLabelConversion = js.Any.fromFunction1(afterTickToLabelConversion), afterUpdate = js.Any.fromFunction1(afterUpdate), alignToPixels = alignToPixels.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1(beforeBuildTicks), beforeCalculateLabelRotation = js.Any.fromFunction1(beforeCalculateLabelRotation), beforeDataLimits = js.Any.fromFunction1(beforeDataLimits), beforeFit = js.Any.fromFunction1(beforeFit), beforeSetDimensions = js.Any.fromFunction1(beforeSetDimensions), beforeTickToLabelConversion = js.Any.fromFunction1(beforeTickToLabelConversion), beforeUpdate = js.Any.fromFunction1(beforeUpdate), beginAtZero = beginAtZero.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linear")
    __obj.asInstanceOf[typelinearLinearScaleOpti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typelinearLinearScaleOpti] (val x: Self) extends AnyVal {
    
    inline def setAfterBuildTicks(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction1(value))
    
    inline def setAfterCalculateLabelRotation(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterCalculateLabelRotation", js.Any.fromFunction1(value))
    
    inline def setAfterDataLimits(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1(value))
    
    inline def setAfterFit(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterFit", js.Any.fromFunction1(value))
    
    inline def setAfterSetDimensions(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterSetDimensions", js.Any.fromFunction1(value))
    
    inline def setAfterTickToLabelConversion(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setAfterUpdate(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    inline def setAlignToPixels(value: Boolean): Self = StObject.set(x, "alignToPixels", value.asInstanceOf[js.Any])
    
    inline def setAxis(value: typings.chartJs.chartJsStrings.x | y | r): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBeforeBuildTicks(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1(value))
    
    inline def setBeforeCalculateLabelRotation(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeCalculateLabelRotation", js.Any.fromFunction1(value))
    
    inline def setBeforeDataLimits(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1(value))
    
    inline def setBeforeFit(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1(value))
    
    inline def setBeforeSetDimensions(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeSetDimensions", js.Any.fromFunction1(value))
    
    inline def setBeforeTickToLabelConversion(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setBeforeUpdate(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
    
    inline def setBeginAtZero(value: Boolean): Self = StObject.set(x, "beginAtZero", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: BorderOptions): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: ticks | data): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setGrace(value: String | Double): Self = StObject.set(x, "grace", value.asInstanceOf[js.Any])
    
    inline def setGraceUndefined: Self = StObject.set(x, "grace", js.undefined)
    
    inline def setGrid(value: PartialGridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: left | top | right | bottom | center | StringDictionary[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStackWeight(value: Double): Self = StObject.set(x, "stackWeight", value.asInstanceOf[js.Any])
    
    inline def setStackWeightUndefined: Self = StObject.set(x, "stackWeight", js.undefined)
    
    inline def setStacked(value: Boolean | single): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMaxUndefined: Self = StObject.set(x, "suggestedMax", js.undefined)
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMinUndefined: Self = StObject.set(x, "suggestedMin", js.undefined)
    
    inline def setTicks(value: Format): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Display): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
