package typings.bootstrapSlider

import typings.bootstrapSlider.bootstrapSliderBooleans.`false`
import typings.bootstrapSlider.bootstrapSliderStrings.auto
import typings.bootstrapSlider.bootstrapSliderStrings.bottom
import typings.bootstrapSlider.bootstrapSliderStrings.left
import typings.bootstrapSlider.bootstrapSliderStrings.linear
import typings.bootstrapSlider.bootstrapSliderStrings.logarithmic
import typings.bootstrapSlider.bootstrapSliderStrings.right
import typings.bootstrapSlider.bootstrapSliderStrings.slide
import typings.bootstrapSlider.bootstrapSliderStrings.top
import typings.jquery.JQuery.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This class is actually not used when using the jQuery version of bootstrap-slider
    * The method documentation is still here thouh.
    * When using jQuery, slider methods like setValue(3, true) have to be called like $slider.slider('setValue', 3, true)
    */
  @JSImport("bootstrap-slider", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Slider {
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, opts: SliderOptions) = this()
    def this(element: HTMLElement, opts: SliderOptions) = this()
  }
  
  trait ChangeValue extends StObject {
    
    var newValue: Double
    
    var oldValue: Double
  }
  object ChangeValue {
    
    inline def apply(newValue: Double, oldValue: Double): ChangeValue = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeValue]
    }
    
    extension [Self <: ChangeValue](x: Self) {
      
      inline def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeHighlight extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object RangeHighlight {
    
    inline def apply(): RangeHighlight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeHighlight]
    }
    
    extension [Self <: RangeHighlight](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait RefreshOptions extends StObject {
    
    var useCurrentValue: js.UndefOr[Boolean] = js.undefined
  }
  object RefreshOptions {
    
    inline def apply(): RefreshOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshOptions]
    }
    
    extension [Self <: RefreshOptions](x: Self) {
      
      inline def setUseCurrentValue(value: Boolean): Self = StObject.set(x, "useCurrentValue", value.asInstanceOf[js.Any])
      
      inline def setUseCurrentValueUndefined: Self = StObject.set(x, "useCurrentValue", js.undefined)
    }
  }
  
  /**
    * This class is actually not used when using the jQuery version of bootstrap-slider
    * The method documentation is still here thouh.
    * When using jQuery, slider methods like setValue(3, true) have to be called like $slider.slider('setValue', 3, true)
    */
  @js.native
  trait Slider extends StObject {
    
    /**
      * Properly clean up and remove the slider instance
      */
    def destroy(): this.type = js.native
    
    /**
      * Disables the slider and prevents the user from changing the value
      */
    def disable(): this.type = js.native
    
    /**
      * Enables the slider
      */
    def enable(): this.type = js.native
    
    /**
      * Get the slider's attributes
      */
    def getAttribute(attribute: String): Any = js.native
    
    /**
      * Get the div slider element
      */
    def getElement(): HTMLDivElement = js.native
    
    /**
      * Get the current value from the slider
      */
    def getValue(): Double = js.native
    
    /**
      * Returns true if enabled, false if disabled
      */
    def isEnabled(): Boolean = js.native
    
    /**
      * Removes the callback function from the slider event eventType
      */
    def off(eventType: SliderEventType, callback: js.Function1[/* val */ js.UndefOr[Double], Unit]): Unit = js.native
    
    /**
      * When the slider event eventType is triggered, the callback function will be invoked
      */
    def on(eventType: SliderEventType, callback: js.Function1[/* val */ js.UndefOr[Double], Unit]): this.type = js.native
    
    /**
      * Refreshes the current slider
      */
    def refresh(): this.type = js.native
    def refresh(options: RefreshOptions): this.type = js.native
    
    /**
      * Renders the tooltip again, after initialization. Useful in situations when the slider and tooltip are initially hidden.
      */
    def relayout(): this.type = js.native
    
    /**
      * Updates the slider's attributes
      */
    def setAttribute(attribute: String, value: Any): this.type = js.native
    
    /**
      * Set a new value for the slider. If optional triggerSlideEvent parameter is true, 'slide' events will be triggered.
      * If optional triggerChangeEvent parameter is true, 'change' events will be triggered.
      */
    def setValue(newValue: Double): this.type = js.native
    def setValue(newValue: Double, triggerSlideEvent: Boolean): this.type = js.native
    def setValue(newValue: Double, triggerSlideEvent: Boolean, triggerChangeEvent: Boolean): this.type = js.native
    def setValue(newValue: Double, triggerSlideEvent: Unit, triggerChangeEvent: Boolean): this.type = js.native
    
    /**
      * Toggles the slider between enabled and disabled
      */
    def toggle(): this.type = js.native
  }
  
  trait SliderEvent
    extends StObject
       with Event {
    
    var value: Double | ChangeValue
  }
  object SliderEvent {
    
    inline def apply(
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      timeStamp: Double,
      `type`: String,
      value: Double | ChangeValue
    ): SliderEvent = {
      val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderEvent]
    }
    
    extension [Self <: SliderEvent](x: Self) {
      
      inline def setValue(value: Double | ChangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bootstrapSlider.bootstrapSliderStrings.slide
    - typings.bootstrapSlider.bootstrapSliderStrings.slideStart
    - typings.bootstrapSlider.bootstrapSliderStrings.slideStop
    - typings.bootstrapSlider.bootstrapSliderStrings.change
    - typings.bootstrapSlider.bootstrapSliderStrings.slideEnabled
    - typings.bootstrapSlider.bootstrapSliderStrings.slideDisabled
  */
  trait SliderEventType extends StObject
  object SliderEventType {
    
    inline def change: typings.bootstrapSlider.bootstrapSliderStrings.change = "change".asInstanceOf[typings.bootstrapSlider.bootstrapSliderStrings.change]
    
    inline def slide: typings.bootstrapSlider.bootstrapSliderStrings.slide = "slide".asInstanceOf[typings.bootstrapSlider.bootstrapSliderStrings.slide]
    
    inline def slideDisabled: typings.bootstrapSlider.bootstrapSliderStrings.slideDisabled = "slideDisabled".asInstanceOf[typings.bootstrapSlider.bootstrapSliderStrings.slideDisabled]
    
    inline def slideEnabled: typings.bootstrapSlider.bootstrapSliderStrings.slideEnabled = "slideEnabled".asInstanceOf[typings.bootstrapSlider.bootstrapSliderStrings.slideEnabled]
    
    inline def slideStart: typings.bootstrapSlider.bootstrapSliderStrings.slideStart = "slideStart".asInstanceOf[typings.bootstrapSlider.bootstrapSliderStrings.slideStart]
    
    inline def slideStop: typings.bootstrapSlider.bootstrapSliderStrings.slideStop = "slideStop".asInstanceOf[typings.bootstrapSlider.bootstrapSliderStrings.slideStop]
  }
  
  trait SliderOptions extends StObject {
    
    /**
      * Default: true
      * whether or not the slider is initially enabled
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: false
      * Focus the appropriate slider handle after a value change.
      */
    var focus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: returns the plain value
      * formatter callback. Return the value wanted to be displayed in the tooltip
      * @param val the current value to display
      */
    var formatter: js.UndefOr[js.Function1[/* val */ Double, String]] = js.undefined
    
    /**
      * Default: 'round'
      * handle shape. Accepts: 'round', 'square', 'triangle' or 'custom'
      */
    var handle: js.UndefOr[String] = js.undefined
    
    /**
      * Default: ''
      * set the id of the slider element when it's created
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Default: null
      * ARIA labels for the slider handle's, Use array for multiple values in a
      * range slider.
      */
    var labelledby: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Default: false
      * Lock the selection to the values defined in the ticks array.
      */
    var lock_to_ticks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: 10
      * maximum possible value
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: 0
      * minimum possible value
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: false
      * The natural order is used for the arrow keys. Arrow up select the upper slider value for vertical sliders,
      * arrow right the righter slider value for a horizontal slider - no matter if the slider was reversed or not.
      * By default the arrow keys are oriented by arrow up/right to the higher slider value, arrow down/left to the lower slider value.
      */
    var natural_arrow_keys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: 'horizontal'
      * set the orientation. Accepts 'vertical' or 'horizontal'
      */
    var orientation: js.UndefOr[String] = js.undefined
    
    /**
      * Default: number of digits after the decimal of step value
      * The number of digits shown after the decimal. Defaults to the number of digits after the decimal of step value.
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: false
      * make range slider. Optional if initial value is an array. If initial value is scalar, max will be used for second value.
      */
    var range: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: []
      * Defines a range array that you want to highlight, for example:
      * [{'start':val1, 'end': val2, 'class': 'optionalAdditionalClassName'}].
      */
    var rangeHighlights: js.UndefOr[js.Array[RangeHighlight]] = js.undefined
    
    /**
      * Default: false
      * whether or not the slider should be reversed
      */
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: 'auto'
      */
    var rtl: js.UndefOr[Boolean | auto] = js.undefined
    
    /**
      * Default: 'linear'
      * Set to 'logarithmic' to use a logarithmic scale.
      */
    var scale: js.UndefOr[linear | logarithmic] = js.undefined
    
    /**
      * Default: 'before'
      * selection placement. Accepts: 'before', 'after' or 'none'. In case of a range slider, the selection will be placed between the handles
      */
    var selection: js.UndefOr[String] = js.undefined
    
    /**
      * Default: 1
      * increment step
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: [ ]
      * Used to define the values of ticks. Tick marks are indicators to denote special values in the range. This option overwrites min and max options.
      */
    var ticks: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Default: [ ]
      * Defines the labels below the tick marks. Accepts HTML input.
      */
    var ticks_labels: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Default: [ ]
      * Defines the positions of the tick values in percentages. The first value should alwasy be 0, the last value should always be 100 percent.
      */
    var ticks_positions: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Default: 0
      * Used to define the snap bounds of a tick. Snaps to the tick if value is within these bounds.
      */
    var ticks_snap_bounds: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: false
      * Used to allow for a user to hover over a given tick to see it's value.
      * Useful if custom formatter passed in
      */
    var ticks_tooltip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: 'show'
      * whether to show the tooltip on drag, hide the tooltip, or always show the tooltip. Accepts: 'show', 'hide', or 'always'
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /**
      * Default: null
      * Position of tooltip, relative to slider. Accepts 'top'/'bottom' for
      * horizontal sliders and 'left'/'right' for vertically orientated sliders.
      * Default positions are 'top' for horizontal and 'right' for vertical
      * slider.
      */
    var tooltip_position: js.UndefOr[top | bottom | left | right] = js.undefined
    
    /**
      * Default: false
      * if false show one tootip if true show two tooltips one for each handler
      */
    var tooltip_split: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: 5
      * initial value. Use array to have a range slider.
      */
    var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object SliderOptions {
    
    inline def apply(): SliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderOptions]
    }
    
    extension [Self <: SliderOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFormatter(value: /* val */ Double => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabelledby(value: String | js.Array[String]): Self = StObject.set(x, "labelledby", value.asInstanceOf[js.Any])
      
      inline def setLabelledbyUndefined: Self = StObject.set(x, "labelledby", js.undefined)
      
      inline def setLabelledbyVarargs(value: String*): Self = StObject.set(x, "labelledby", js.Array(value*))
      
      inline def setLock_to_ticks(value: Boolean): Self = StObject.set(x, "lock_to_ticks", value.asInstanceOf[js.Any])
      
      inline def setLock_to_ticksUndefined: Self = StObject.set(x, "lock_to_ticks", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setNatural_arrow_keys(value: Boolean): Self = StObject.set(x, "natural_arrow_keys", value.asInstanceOf[js.Any])
      
      inline def setNatural_arrow_keysUndefined: Self = StObject.set(x, "natural_arrow_keys", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeHighlights(value: js.Array[RangeHighlight]): Self = StObject.set(x, "rangeHighlights", value.asInstanceOf[js.Any])
      
      inline def setRangeHighlightsUndefined: Self = StObject.set(x, "rangeHighlights", js.undefined)
      
      inline def setRangeHighlightsVarargs(value: RangeHighlight*): Self = StObject.set(x, "rangeHighlights", js.Array(value*))
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setRtl(value: Boolean | auto): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setScale(value: linear | logarithmic): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value*))
      
      inline def setTicks_labels(value: js.Array[String]): Self = StObject.set(x, "ticks_labels", value.asInstanceOf[js.Any])
      
      inline def setTicks_labelsUndefined: Self = StObject.set(x, "ticks_labels", js.undefined)
      
      inline def setTicks_labelsVarargs(value: String*): Self = StObject.set(x, "ticks_labels", js.Array(value*))
      
      inline def setTicks_positions(value: js.Array[Double]): Self = StObject.set(x, "ticks_positions", value.asInstanceOf[js.Any])
      
      inline def setTicks_positionsUndefined: Self = StObject.set(x, "ticks_positions", js.undefined)
      
      inline def setTicks_positionsVarargs(value: Double*): Self = StObject.set(x, "ticks_positions", js.Array(value*))
      
      inline def setTicks_snap_bounds(value: Double): Self = StObject.set(x, "ticks_snap_bounds", value.asInstanceOf[js.Any])
      
      inline def setTicks_snap_boundsUndefined: Self = StObject.set(x, "ticks_snap_bounds", js.undefined)
      
      inline def setTicks_tooltip(value: Boolean): Self = StObject.set(x, "ticks_tooltip", value.asInstanceOf[js.Any])
      
      inline def setTicks_tooltipUndefined: Self = StObject.set(x, "ticks_tooltip", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTooltip_position(value: top | bottom | left | right): Self = StObject.set(x, "tooltip_position", value.asInstanceOf[js.Any])
      
      inline def setTooltip_positionUndefined: Self = StObject.set(x, "tooltip_position", js.undefined)
      
      inline def setTooltip_split(value: Boolean): Self = StObject.set(x, "tooltip_split", value.asInstanceOf[js.Any])
      
      inline def setTooltip_splitUndefined: Self = StObject.set(x, "tooltip_split", js.undefined)
      
      inline def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  @js.native
  trait SliderPlugin[TJQuery] extends StObject {
    
    /**
      * Creates a slider from the current element.
      */
    def apply(): TJQuery = js.native
    def apply(methodName: String, args: Any*): TJQuery = js.native
    def apply(options: SliderOptions): TJQuery = js.native
  }
  
  object global {
    
    trait JQuery extends StObject {
      
      /**
        * Creates a slider from the current element.
        */
      def bootstrapSlider(): this.type
      def bootstrapSlider(methodName: String, args: Any*): this.type
      def bootstrapSlider(options: SliderOptions): this.type
      @JSName("bootstrapSlider")
      var bootstrapSlider_Original: SliderPlugin[this.type]
      
      def on(event: slide, handler: js.Function1[/* slideEvt */ SliderEvent, `false` | Unit]): this.type
      
      /**
        * Creates a slider from the current element.
        */
      def slider(): this.type
      def slider(methodName: String, args: Any*): this.type
      def slider(options: SliderOptions): this.type
      @JSName("slider")
      var slider_Original: SliderPlugin[this.type]
    }
    object JQuery {
      
      inline def apply(
        bootstrapSlider: SliderPlugin[JQuery],
        on: (slide, js.Function1[/* slideEvt */ SliderEvent, `false` | Unit]) => JQuery,
        slider: SliderPlugin[JQuery]
      ): JQuery = {
        val __obj = js.Dynamic.literal(bootstrapSlider = bootstrapSlider.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), slider = slider.asInstanceOf[js.Any])
        __obj.asInstanceOf[JQuery]
      }
      
      extension [Self <: JQuery](x: Self) {
        
        inline def setBootstrapSlider(value: SliderPlugin[JQuery]): Self = StObject.set(x, "bootstrapSlider", value.asInstanceOf[js.Any])
        
        inline def setOn(value: (slide, js.Function1[/* slideEvt */ SliderEvent, `false` | Unit]) => JQuery): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        
        inline def setSlider(value: SliderPlugin[JQuery]): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      }
    }
  }
}
