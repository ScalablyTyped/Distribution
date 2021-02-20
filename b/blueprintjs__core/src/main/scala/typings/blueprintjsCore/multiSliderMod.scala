package typings.blueprintjsCore

import typings.blueprintjsCore.anon.LabelPrecision
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSliderMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
  @js.native
  class MultiSlider protected ()
    extends AbstractPureComponent2[IMultiSliderProps, ISliderState, js.Object] {
    def this(props: IMultiSliderProps) = this()
    def this(props: IMultiSliderProps, context: js.Any) = this()
    
    var addHandleRef: js.Any = js.native
    
    var canHandleTrackEvent: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MMultiSlider(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMultiSlider(prevProps: IMultiSliderProps, prevState: ISliderState): Unit = js.native
    
    var findFirstLockedHandleIndex: js.Any = js.native
    
    var formatLabel: js.Any = js.native
    
    var getHandlerForIndex: js.Any = js.native
    
    var getLabelValues: js.Any = js.native
    
    var getNewHandleValues: js.Any = js.native
    
    var getOffsetRatio: js.Any = js.native
    
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MMultiSlider(prevProps: IMultiSliderProps): Null = js.native
    
    var getTrackIntent: js.Any = js.native
    
    var handleChange: js.Any = js.native
    
    var handleElements: js.Any = js.native
    
    var handleRelease: js.Any = js.native
    
    var maybeHandleTrackClick: js.Any = js.native
    
    var maybeHandleTrackTouch: js.Any = js.native
    
    var nearestHandleForValue: js.Any = js.native
    
    var renderHandles: js.Any = js.native
    
    var renderLabels: js.Any = js.native
    
    var renderTrackFill: js.Any = js.native
    
    var renderTracks: js.Any = js.native
    
    var trackElement: js.Any = js.native
    
    var updateTickSize: js.Any = js.native
  }
  /* static members */
  object MultiSlider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.Handle")
    @js.native
    def Handle: FunctionComponent[IHandleProps] = js.native
    @scala.inline
    def Handle_=(x: FunctionComponent[IHandleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Handle")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.defaultProps")
    @js.native
    def defaultProps: IMultiSliderProps = js.native
    @scala.inline
    def defaultProps_=(x: IMultiSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.defaultSliderProps")
    @js.native
    def defaultSliderProps: ISliderBaseProps = js.native
    @scala.inline
    def defaultSliderProps_=(x: ISliderBaseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSliderProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: IMultiSliderProps): LabelPrecision = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.getLabelPrecision")
    @js.native
    def getLabelPrecision: js.Any = js.native
    @scala.inline
    def getLabelPrecision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLabelPrecision")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IMultiSliderProps extends ISliderBaseProps {
    
    /** Default intent of a track segment, used only if no handle specifies `intentBefore/After`. */
    var defaultTrackIntent: js.UndefOr[Intent] = js.native
    
    /** Callback invoked when a handle value changes. Receives handle values in sorted order. */
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
    
    /** Callback invoked when a handle is released. Receives handle values in sorted order. */
    var onRelease: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  }
  object IMultiSliderProps {
    
    @scala.inline
    def apply(): IMultiSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMultiSliderProps]
    }
    
    @scala.inline
    implicit class IMultiSliderPropsMutableBuilder[Self <: IMultiSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultTrackIntent(value: Intent): Self = StObject.set(x, "defaultTrackIntent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTrackIntentUndefined: Self = StObject.set(x, "defaultTrackIntent", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnRelease(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    }
  }
  
  @js.native
  trait ISliderBaseProps
    extends IProps
       with IIntentProps {
    
    /**
      * Whether the slider is non-interactive.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Number of decimal places to use when rendering label value. Default value is the number of
      * decimals used in the `stepSize` prop. This prop has _no effect_ if you supply a custom
      * `labelRenderer` callback.
      * @default inferred from stepSize
      */
    var labelPrecision: js.UndefOr[Double] = js.native
    
    /**
      * Callback to render a single label. Useful for formatting numbers as currency or percentages.
      * If `true`, labels will use number value formatted to `labelPrecision` decimal places.
      * If `false`, labels will not be shown.
      * @default true
      */
    var labelRenderer: js.UndefOr[Boolean | (js.Function1[/* value */ Double, String | Element])] = js.native
    
    /**
      * Increment between successive labels. Must be greater than zero.
      * @default inferred (if labelStepSize is undefined)
      */
    var labelStepSize: js.UndefOr[Double] = js.native
    
    /**
      * Array of specific values for the label placement. This prop is mutually exclusive with
      * `labelStepSize`.
      */
    var labelValues: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Maximum value of the slider.
      * @default 10
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Minimum value of the slider.
      * @default 0
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Whether a solid bar should be rendered on the track between current and initial values,
      * or between handles for `RangeSlider`.
      * @default true
      */
    var showTrackFill: js.UndefOr[Boolean] = js.native
    
    /**
      * Increment between successive values; amount by which the handle moves. Must be greater than zero.
      * @default 1
      */
    var stepSize: js.UndefOr[Double] = js.native
    
    /**
      * Whether to show the slider in a vertical orientation.
      * @default false
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object ISliderBaseProps {
    
    @scala.inline
    def apply(): ISliderBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderBaseProps]
    }
    
    @scala.inline
    implicit class ISliderBasePropsMutableBuilder[Self <: ISliderBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabelPrecision(value: Double): Self = StObject.set(x, "labelPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPrecisionUndefined: Self = StObject.set(x, "labelPrecision", js.undefined)
      
      @scala.inline
      def setLabelRenderer(value: Boolean | (js.Function1[/* value */ Double, String | Element])): Self = StObject.set(x, "labelRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelRendererFunction1(value: /* value */ Double => String | Element): Self = StObject.set(x, "labelRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLabelRendererUndefined: Self = StObject.set(x, "labelRenderer", js.undefined)
      
      @scala.inline
      def setLabelStepSize(value: Double): Self = StObject.set(x, "labelStepSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStepSizeUndefined: Self = StObject.set(x, "labelStepSize", js.undefined)
      
      @scala.inline
      def setLabelValues(value: js.Array[Double]): Self = StObject.set(x, "labelValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelValuesUndefined: Self = StObject.set(x, "labelValues", js.undefined)
      
      @scala.inline
      def setLabelValuesVarargs(value: Double*): Self = StObject.set(x, "labelValues", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setShowTrackFill(value: Boolean): Self = StObject.set(x, "showTrackFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTrackFillUndefined: Self = StObject.set(x, "showTrackFill", js.undefined)
      
      @scala.inline
      def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepSizeUndefined: Self = StObject.set(x, "stepSize", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait ISliderState extends StObject {
    
    var labelPrecision: Double = js.native
    
    /** the client size, in pixels, of one tick */
    var tickSize: Double = js.native
    
    /** the size of one tick as a ratio of the component's client size */
    var tickSizeRatio: Double = js.native
  }
  object ISliderState {
    
    @scala.inline
    def apply(labelPrecision: Double, tickSize: Double, tickSizeRatio: Double): ISliderState = {
      val __obj = js.Dynamic.literal(labelPrecision = labelPrecision.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickSizeRatio = tickSizeRatio.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISliderState]
    }
    
    @scala.inline
    implicit class ISliderStateMutableBuilder[Self <: ISliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelPrecision(value: Double): Self = StObject.set(x, "labelPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeRatio(value: Double): Self = StObject.set(x, "tickSizeRatio", value.asInstanceOf[js.Any])
    }
  }
}
