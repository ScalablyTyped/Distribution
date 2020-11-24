package typings.bootstrapSlider

import typings.bootstrapSlider.bootstrapSliderStrings.auto
import typings.bootstrapSlider.bootstrapSliderStrings.bottom
import typings.bootstrapSlider.bootstrapSliderStrings.left
import typings.bootstrapSlider.bootstrapSliderStrings.linear
import typings.bootstrapSlider.bootstrapSliderStrings.logarithmic
import typings.bootstrapSlider.bootstrapSliderStrings.right
import typings.bootstrapSlider.bootstrapSliderStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderOptions extends js.Object {
  
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
  implicit class SliderOptionsOps[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* val */ Double => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabelledbyVarargs(value: String*): Self = this.set("labelledby", js.Array(value :_*))
    
    @scala.inline
    def setLabelledby(value: String | js.Array[String]): Self = this.set("labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelledby: Self = this.set("labelledby", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNatural_arrow_keys(value: Boolean): Self = this.set("natural_arrow_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatural_arrow_keys: Self = this.set("natural_arrow_keys", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRangeHighlightsVarargs(value: RangeHighlight*): Self = this.set("rangeHighlights", js.Array(value :_*))
    
    @scala.inline
    def setRangeHighlights(value: js.Array[RangeHighlight]): Self = this.set("rangeHighlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeHighlights: Self = this.set("rangeHighlights", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean | auto): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setScale(value: linear | logarithmic): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: Double*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[Double]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setTicks_labelsVarargs(value: String*): Self = this.set("ticks_labels", js.Array(value :_*))
    
    @scala.inline
    def setTicks_labels(value: js.Array[String]): Self = this.set("ticks_labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks_labels: Self = this.set("ticks_labels", js.undefined)
    
    @scala.inline
    def setTicks_positionsVarargs(value: Double*): Self = this.set("ticks_positions", js.Array(value :_*))
    
    @scala.inline
    def setTicks_positions(value: js.Array[Double]): Self = this.set("ticks_positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks_positions: Self = this.set("ticks_positions", js.undefined)
    
    @scala.inline
    def setTicks_snap_bounds(value: Double): Self = this.set("ticks_snap_bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks_snap_bounds: Self = this.set("ticks_snap_bounds", js.undefined)
    
    @scala.inline
    def setTicks_tooltip(value: Boolean): Self = this.set("ticks_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks_tooltip: Self = this.set("ticks_tooltip", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltip_position(value: top | bottom | left | right): Self = this.set("tooltip_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip_position: Self = this.set("tooltip_position", js.undefined)
    
    @scala.inline
    def setTooltip_split(value: Boolean): Self = this.set("tooltip_split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip_split: Self = this.set("tooltip_split", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
