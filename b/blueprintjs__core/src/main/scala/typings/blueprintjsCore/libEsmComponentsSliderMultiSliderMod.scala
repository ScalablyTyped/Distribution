package typings.blueprintjsCore

import typings.blueprintjsCore.anon.IsHandleTooltip
import typings.blueprintjsCore.anon.LabelPrecision
import typings.blueprintjsCore.libEsmCommonIntentMod.Intent
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.IHandleProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSliderMultiSliderMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
  @js.native
  open class MultiSlider protected ()
    extends AbstractPureComponent2[MultiSliderProps, ISliderState, js.Object] {
    def this(props: MultiSliderProps) = this()
    def this(props: MultiSliderProps, context: Any) = this()
    
    /* private */ var addHandleRef: Any = js.native
    
    /* private */ var canHandleTrackEvent: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MMultiSlider(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMultiSlider(prevProps: MultiSliderProps, prevState: ISliderState): Unit = js.native
    
    /* private */ var findFirstLockedHandleIndex: Any = js.native
    
    /* private */ var formatLabel: Any = js.native
    
    /* private */ var getHandlerForIndex: Any = js.native
    
    /* private */ var getLabelValues: Any = js.native
    
    /* private */ var getNewHandleValues: Any = js.native
    
    /* private */ var getOffsetRatio: Any = js.native
    
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MMultiSlider(prevProps: MultiSliderProps): Null = js.native
    
    /* private */ var getTrackIntent: Any = js.native
    
    /* private */ var handleChange: Any = js.native
    
    /* private */ var handleElements: Any = js.native
    
    /* private */ var handleRelease: Any = js.native
    
    /* private */ var maybeHandleTrackClick: Any = js.native
    
    /* private */ var maybeHandleTrackTouch: Any = js.native
    
    /* private */ var nearestHandleForValue: Any = js.native
    
    /* private */ var renderHandles: Any = js.native
    
    /* private */ var renderLabels: Any = js.native
    
    /* private */ var renderTrackFill: Any = js.native
    
    /* private */ var renderTracks: Any = js.native
    
    /* private */ var trackElement: Any = js.native
    
    /* private */ var updateTickSize: Any = js.native
  }
  /* static members */
  object MultiSlider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.Handle")
    @js.native
    def Handle: FC[IHandleProps] = js.native
    inline def Handle_=(x: FC[IHandleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Handle")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.defaultProps")
    @js.native
    def defaultProps: MultiSliderProps = js.native
    inline def defaultProps_=(x: MultiSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.defaultSliderProps")
    @js.native
    def defaultSliderProps: ISliderBaseProps = js.native
    inline def defaultSliderProps_=(x: ISliderBaseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSliderProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: MultiSliderProps): LabelPrecision = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any]).asInstanceOf[LabelPrecision]
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider.getLabelPrecision")
    @js.native
    def getLabelPrecision: Any = js.native
    inline def getLabelPrecision_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLabelPrecision")(x.asInstanceOf[js.Any])
  }
  
  trait IMultiSliderProps
    extends StObject
       with ISliderBaseProps {
    
    /** Default intent of a track segment, used only if no handle specifies `intentBefore/After`. */
    var defaultTrackIntent: js.UndefOr[Intent] = js.undefined
    
    /** Callback invoked when a handle value changes. Receives handle values in sorted order. */
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
    
    /** Callback invoked when a handle is released. Receives handle values in sorted order. */
    var onRelease: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
  }
  object IMultiSliderProps {
    
    inline def apply(): IMultiSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMultiSliderProps]
    }
    
    extension [Self <: IMultiSliderProps](x: Self) {
      
      inline def setDefaultTrackIntent(value: Intent): Self = StObject.set(x, "defaultTrackIntent", value.asInstanceOf[js.Any])
      
      inline def setDefaultTrackIntentUndefined: Self = StObject.set(x, "defaultTrackIntent", js.undefined)
      
      inline def setOnChange(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnRelease(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    }
  }
  
  trait ISliderBaseProps
    extends StObject
       with IProps
       with IIntentProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Whether the slider is non-interactive.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of decimal places to use when rendering label value. Default value is the number of
      * decimals used in the `stepSize` prop. This prop has _no effect_ if you supply a custom
      * `labelRenderer` callback.
      *
      * @default inferred from stepSize
      */
    var labelPrecision: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback to render a single label. Useful for formatting numbers as currency or percentages.
      * If `true`, labels will use number value formatted to `labelPrecision` decimal places.
      * If `false`, labels will not be shown.
      *
      * The callback is provided a numeric value and optional rendering options, which include:
      * - isHandleTooltip: whether this label is being rendered within a handle tooltip
      *
      * @default true
      */
    var labelRenderer: js.UndefOr[
        Boolean | (js.Function2[/* value */ Double, /* opts */ js.UndefOr[IsHandleTooltip], String | Element])
      ] = js.undefined
    
    /**
      * Increment between successive labels. Must be greater than zero.
      *
      * @default inferred (if labelStepSize is undefined)
      */
    var labelStepSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of specific values for the label placement. This prop is mutually exclusive with
      * `labelStepSize`.
      */
    var labelValues: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Maximum value of the slider.
      *
      * @default 10
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum value of the slider.
      *
      * @default 0
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether a solid bar should be rendered on the track between current and initial values,
      * or between handles for `RangeSlider`.
      *
      * @default true
      */
    var showTrackFill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Increment between successive values; amount by which the handle moves. Must be greater than zero.
      *
      * @default 1
      */
    var stepSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to show the slider in a vertical orientation.
      *
      * @default false
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ISliderBaseProps {
    
    inline def apply(): ISliderBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderBaseProps]
    }
    
    extension [Self <: ISliderBaseProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabelPrecision(value: Double): Self = StObject.set(x, "labelPrecision", value.asInstanceOf[js.Any])
      
      inline def setLabelPrecisionUndefined: Self = StObject.set(x, "labelPrecision", js.undefined)
      
      inline def setLabelRenderer(
        value: Boolean | (js.Function2[/* value */ Double, /* opts */ js.UndefOr[IsHandleTooltip], String | Element])
      ): Self = StObject.set(x, "labelRenderer", value.asInstanceOf[js.Any])
      
      inline def setLabelRendererFunction2(value: (/* value */ Double, /* opts */ js.UndefOr[IsHandleTooltip]) => String | Element): Self = StObject.set(x, "labelRenderer", js.Any.fromFunction2(value))
      
      inline def setLabelRendererUndefined: Self = StObject.set(x, "labelRenderer", js.undefined)
      
      inline def setLabelStepSize(value: Double): Self = StObject.set(x, "labelStepSize", value.asInstanceOf[js.Any])
      
      inline def setLabelStepSizeUndefined: Self = StObject.set(x, "labelStepSize", js.undefined)
      
      inline def setLabelValues(value: js.Array[Double]): Self = StObject.set(x, "labelValues", value.asInstanceOf[js.Any])
      
      inline def setLabelValuesUndefined: Self = StObject.set(x, "labelValues", js.undefined)
      
      inline def setLabelValuesVarargs(value: Double*): Self = StObject.set(x, "labelValues", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setShowTrackFill(value: Boolean): Self = StObject.set(x, "showTrackFill", value.asInstanceOf[js.Any])
      
      inline def setShowTrackFillUndefined: Self = StObject.set(x, "showTrackFill", js.undefined)
      
      inline def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
      
      inline def setStepSizeUndefined: Self = StObject.set(x, "stepSize", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait ISliderState extends StObject {
    
    var labelPrecision: Double
    
    /** the client size, in pixels, of one tick */
    var tickSize: Double
    
    /** the size of one tick as a ratio of the component's client size */
    var tickSizeRatio: Double
  }
  object ISliderState {
    
    inline def apply(labelPrecision: Double, tickSize: Double, tickSizeRatio: Double): ISliderState = {
      val __obj = js.Dynamic.literal(labelPrecision = labelPrecision.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickSizeRatio = tickSizeRatio.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISliderState]
    }
    
    extension [Self <: ISliderState](x: Self) {
      
      inline def setLabelPrecision(value: Double): Self = StObject.set(x, "labelPrecision", value.asInstanceOf[js.Any])
      
      inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeRatio(value: Double): Self = StObject.set(x, "tickSizeRatio", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiSliderProps = IMultiSliderProps
}
