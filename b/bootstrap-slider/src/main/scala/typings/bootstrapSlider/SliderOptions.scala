package typings.bootstrapSlider

import typings.bootstrapSlider.bootstrapSliderStrings.auto
import typings.bootstrapSlider.bootstrapSliderStrings.bottom
import typings.bootstrapSlider.bootstrapSliderStrings.left
import typings.bootstrapSlider.bootstrapSliderStrings.linear
import typings.bootstrapSlider.bootstrapSliderStrings.logarithmic
import typings.bootstrapSlider.bootstrapSliderStrings.right
import typings.bootstrapSlider.bootstrapSliderStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderOptions extends StObject {
  
  /**
    * Default: true
    * whether or not the slider is initially enabled
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    * Focus the appropriate slider handle after a value change.
    */
  var focus: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: returns the plain value
    * formatter callback. Return the value wanted to be displayed in the tooltip
    * @param val the current value to display
    */
  var formatter: js.UndefOr[js.Function1[/* val */ Double, String]] = js.native
  
  /**
    * Default: 'round'
    * handle shape. Accepts: 'round', 'square', 'triangle' or 'custom'
    */
  var handle: js.UndefOr[String] = js.native
  
  /**
    * Default: ''
    * set the id of the slider element when it's created
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Default: null
    * ARIA labels for the slider handle's, Use array for multiple values in a
    * range slider.
    */
  var labelledby: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Default: 10
    * maximum possible value
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Default: 0
    * minimum possible value
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Default: false
    * The natural order is used for the arrow keys. Arrow up select the upper slider value for vertical sliders,
    * arrow right the righter slider value for a horizontal slider - no matter if the slider was reversed or not.
    * By default the arrow keys are oriented by arrow up/right to the higher slider value, arrow down/left to the lower slider value.
    */
  var natural_arrow_keys: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: 'horizontal'
    * set the orientation. Accepts 'vertical' or 'horizontal'
    */
  var orientation: js.UndefOr[String] = js.native
  
  /**
    * Default: number of digits after the decimal of step value
    * The number of digits shown after the decimal. Defaults to the number of digits after the decimal of step value.
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Default: false
    * make range slider. Optional if initial value is an array. If initial value is scalar, max will be used for second value.
    */
  var range: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: []
    * Defines a range array that you want to highlight, for example:
    * [{'start':val1, 'end': val2, 'class': 'optionalAdditionalClassName'}].
    */
  var rangeHighlights: js.UndefOr[js.Array[RangeHighlight]] = js.native
  
  /**
    * Default: false
    * whether or not the slider should be reversed
    */
  var reversed: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: 'auto'
    */
  var rtl: js.UndefOr[Boolean | auto] = js.native
  
  /**
    * Default: 'linear'
    * Set to 'logarithmic' to use a logarithmic scale.
    */
  var scale: js.UndefOr[linear | logarithmic] = js.native
  
  /**
    * Default: 'before'
    * selection placement. Accepts: 'before', 'after' or 'none'. In case of a range slider, the selection will be placed between the handles
    */
  var selection: js.UndefOr[String] = js.native
  
  /**
    * Default: 1
    * increment step
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * Default: [ ]
    * Used to define the values of ticks. Tick marks are indicators to denote special values in the range. This option overwrites min and max options.
    */
  var ticks: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Default: [ ]
    * Defines the labels below the tick marks. Accepts HTML input.
    */
  var ticks_labels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Default: [ ]
    * Defines the positions of the tick values in percentages. The first value should alwasy be 0, the last value should always be 100 percent.
    */
  var ticks_positions: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Default: 0
    * Used to define the snap bounds of a tick. Snaps to the tick if value is within these bounds.
    */
  var ticks_snap_bounds: js.UndefOr[Double] = js.native
  
  /**
    * Default: false
    * Used to allow for a user to hover over a given tick to see it's value.
    * Useful if custom formatter passed in
    */
  var ticks_tooltip: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: 'show'
    * whether to show the tooltip on drag, hide the tooltip, or always show the tooltip. Accepts: 'show', 'hide', or 'always'
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /**
    * Default: null
    * Position of tooltip, relative to slider. Accepts 'top'/'bottom' for
    * horizontal sliders and 'left'/'right' for vertically orientated sliders.
    * Default positions are 'top' for horizontal and 'right' for vertical
    * slider.
    */
  var tooltip_position: js.UndefOr[top | bottom | left | right] = js.native
  
  /**
    * Default: false
    * if false show one tootip if true show two tooltips one for each handler
    */
  var tooltip_split: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: 5
    * initial value. Use array to have a range slider.
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
}
object SliderOptions {
  
  @scala.inline
  def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  
  @scala.inline
  implicit class SliderOptionsMutableBuilder[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* val */ Double => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabelledby(value: String | js.Array[String]): Self = StObject.set(x, "labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelledbyUndefined: Self = StObject.set(x, "labelledby", js.undefined)
    
    @scala.inline
    def setLabelledbyVarargs(value: String*): Self = StObject.set(x, "labelledby", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setNatural_arrow_keys(value: Boolean): Self = StObject.set(x, "natural_arrow_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatural_arrow_keysUndefined: Self = StObject.set(x, "natural_arrow_keys", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeHighlights(value: js.Array[RangeHighlight]): Self = StObject.set(x, "rangeHighlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeHighlightsUndefined: Self = StObject.set(x, "rangeHighlights", js.undefined)
    
    @scala.inline
    def setRangeHighlightsVarargs(value: RangeHighlight*): Self = StObject.set(x, "rangeHighlights", js.Array(value :_*))
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean | auto): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    @scala.inline
    def setScale(value: linear | logarithmic): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks_labels(value: js.Array[String]): Self = StObject.set(x, "ticks_labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks_labelsUndefined: Self = StObject.set(x, "ticks_labels", js.undefined)
    
    @scala.inline
    def setTicks_labelsVarargs(value: String*): Self = StObject.set(x, "ticks_labels", js.Array(value :_*))
    
    @scala.inline
    def setTicks_positions(value: js.Array[Double]): Self = StObject.set(x, "ticks_positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks_positionsUndefined: Self = StObject.set(x, "ticks_positions", js.undefined)
    
    @scala.inline
    def setTicks_positionsVarargs(value: Double*): Self = StObject.set(x, "ticks_positions", js.Array(value :_*))
    
    @scala.inline
    def setTicks_snap_bounds(value: Double): Self = StObject.set(x, "ticks_snap_bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks_snap_boundsUndefined: Self = StObject.set(x, "ticks_snap_bounds", js.undefined)
    
    @scala.inline
    def setTicks_tooltip(value: Boolean): Self = StObject.set(x, "ticks_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks_tooltipUndefined: Self = StObject.set(x, "ticks_tooltip", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTooltip_position(value: top | bottom | left | right): Self = StObject.set(x, "tooltip_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip_positionUndefined: Self = StObject.set(x, "tooltip_position", js.undefined)
    
    @scala.inline
    def setTooltip_split(value: Boolean): Self = StObject.set(x, "tooltip_split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip_splitUndefined: Self = StObject.set(x, "tooltip_split", js.undefined)
    
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
