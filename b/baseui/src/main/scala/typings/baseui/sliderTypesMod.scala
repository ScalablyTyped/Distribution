package typings.baseui

import typings.baseui.baseuiStrings.change_
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderTypesMod {
  
  /* Inlined keyof std.Readonly<{ readonly change :'change',  readonly finalChange :'finalChange'}> */
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.change_
    - typings.baseui.baseuiStrings.finalChange
  */
  trait ChangeAction extends StObject
  object ChangeAction {
    
    inline def change: change_ = "change".asInstanceOf[change_]
    
    inline def finalChange: typings.baseui.baseuiStrings.finalChange = "finalChange".asInstanceOf[typings.baseui.baseuiStrings.finalChange]
  }
  
  trait Params extends StObject {
    
    var value: js.Array[Double]
  }
  object Params {
    
    inline def apply(value: js.Array[Double]): Params = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait SliderOverrides extends StObject {
    
    var InnerThumb: js.UndefOr[Override[Any]] = js.undefined
    
    var InnerTrack: js.UndefOr[Override[Any]] = js.undefined
    
    var Mark: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Thumb: js.UndefOr[Override[Any]] = js.undefined
    
    var ThumbValue: js.UndefOr[Override[Any]] = js.undefined
    
    var Tick: js.UndefOr[Override[Any]] = js.undefined
    
    var TickBar: js.UndefOr[Override[Any]] = js.undefined
    
    var Track: js.UndefOr[Override[Any]] = js.undefined
  }
  object SliderOverrides {
    
    inline def apply(): SliderOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderOverrides]
    }
    
    extension [Self <: SliderOverrides](x: Self) {
      
      inline def setInnerThumb(value: Override[Any]): Self = StObject.set(x, "InnerThumb", value.asInstanceOf[js.Any])
      
      inline def setInnerThumbUndefined: Self = StObject.set(x, "InnerThumb", js.undefined)
      
      inline def setInnerTrack(value: Override[Any]): Self = StObject.set(x, "InnerTrack", value.asInstanceOf[js.Any])
      
      inline def setInnerTrackUndefined: Self = StObject.set(x, "InnerTrack", js.undefined)
      
      inline def setMark(value: Override[Any]): Self = StObject.set(x, "Mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "Mark", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setThumb(value: Override[Any]): Self = StObject.set(x, "Thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbUndefined: Self = StObject.set(x, "Thumb", js.undefined)
      
      inline def setThumbValue(value: Override[Any]): Self = StObject.set(x, "ThumbValue", value.asInstanceOf[js.Any])
      
      inline def setThumbValueUndefined: Self = StObject.set(x, "ThumbValue", js.undefined)
      
      inline def setTick(value: Override[Any]): Self = StObject.set(x, "Tick", value.asInstanceOf[js.Any])
      
      inline def setTickBar(value: Override[Any]): Self = StObject.set(x, "TickBar", value.asInstanceOf[js.Any])
      
      inline def setTickBarUndefined: Self = StObject.set(x, "TickBar", js.undefined)
      
      inline def setTickUndefined: Self = StObject.set(x, "Tick", js.undefined)
      
      inline def setTrack(value: Override[Any]): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "Track", js.undefined)
    }
  }
  
  trait SliderProps extends StObject {
    
    /** Disable control from being changed. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Display a mark at each step. */
    var marks: js.UndefOr[Boolean] = js.undefined
    
    /** The maximum allowed value of the slider. Should not be smaller than min. */
    var max: js.UndefOr[Double] = js.undefined
    
    /** The minimum allowed value of the slider. Should not be bigger than max. */
    var min: js.UndefOr[Double] = js.undefined
    
    /** Handler for events on trigger element, each time thumbs change selection, which is passed in `value`. */
    var onChange: js.UndefOr[js.Function1[/* a */ Params, Any]] = js.undefined
    
    /** Handler for events on trigger element, each time thumbs finish changing selection, which is passed in `value`. */
    var onFinalChange: js.UndefOr[js.Function1[/* a */ Params, Any]] = js.undefined
    
    var overrides: js.UndefOr[SliderOverrides] = js.undefined
    
    /** Always display the selected value/thumb/label. */
    var persistentThumb: js.UndefOr[Boolean] = js.undefined
    
    /** The granularity the slider can step through value. Default step is 1. */
    var step: js.UndefOr[Double] = js.undefined
    
    /** Position of the thumbs. It can be a single point (one thumb) or 2 points array (range thumbs). */
    var value: js.Array[Double]
    
    /** Function to change the numeric value to a user friendly value. Also applied to min/max labels. */
    var valueToLabel: js.UndefOr[js.Function1[/* value */ Double, ReactNode]] = js.undefined
  }
  object SliderProps {
    
    inline def apply(value: js.Array[Double]): SliderProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMarks(value: Boolean): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: /* a */ Params => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFinalChange(value: /* a */ Params => Any): Self = StObject.set(x, "onFinalChange", js.Any.fromFunction1(value))
      
      inline def setOnFinalChangeUndefined: Self = StObject.set(x, "onFinalChange", js.undefined)
      
      inline def setOverrides(value: SliderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPersistentThumb(value: Boolean): Self = StObject.set(x, "persistentThumb", value.asInstanceOf[js.Any])
      
      inline def setPersistentThumbUndefined: Self = StObject.set(x, "persistentThumb", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueToLabel(value: /* value */ Double => ReactNode): Self = StObject.set(x, "valueToLabel", js.Any.fromFunction1(value))
      
      inline def setValueToLabelUndefined: Self = StObject.set(x, "valueToLabel", js.undefined)
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait State extends StObject {
    
    var value: js.Array[Double]
  }
  object State {
    
    inline def apply(value: js.Array[Double]): State = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type StateReducer = js.Function3[/* stateType */ String, /* nextState */ State, /* currentState */ State, State]
  
  trait StatefulContainerProps extends StObject {
    
    def children(a: SliderProps): ReactNode
    
    /** Initial state populated into the component */
    var initialState: js.UndefOr[State] = js.undefined
    
    var max: Double
    
    var min: Double
    
    /** Handler for events on trigger element, each time thumbs change selection, which is passed in `value`. */
    def onChange(a: typings.baseui.anon.Params): Any
    
    /** Handler for events on trigger element, each time thumbs finish changing selection, which is passed in `value`. */
    def onFinalChange(a: typings.baseui.anon.Params): Any
    
    var overrides: js.UndefOr[SliderOverrides] = js.undefined
    
    /** Reducer function to manipulate internal state updates. */
    var stateReducer: StateReducer
    
    var step: Double
  }
  object StatefulContainerProps {
    
    inline def apply(
      children: SliderProps => ReactNode,
      max: Double,
      min: Double,
      onChange: typings.baseui.anon.Params => Any,
      onFinalChange: typings.baseui.anon.Params => Any,
      stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State,
      step: Double
    ): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onFinalChange = js.Any.fromFunction1(onFinalChange), stateReducer = js.Any.fromFunction3(stateReducer), step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setChildren(value: SliderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: typings.baseui.anon.Params => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFinalChange(value: typings.baseui.anon.Params => Any): Self = StObject.set(x, "onFinalChange", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: SliderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  initialState :baseui.baseui/slider/types.State | undefined} & std.Omit<baseui.baseui/slider/types.SliderProps, 'value'> */
  trait StatefulSliderProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Initial state populated into the component */
    var initialState: js.UndefOr[State] = js.undefined
    
    var marks: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* a */ Params, Any]] = js.undefined
    
    var onFinalChange: js.UndefOr[js.Function1[/* a */ Params, Any]] = js.undefined
    
    var overrides: js.UndefOr[SliderOverrides] = js.undefined
    
    var persistentThumb: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var valueToLabel: js.UndefOr[js.Function1[/* value */ Double, ReactNode]] = js.undefined
  }
  object StatefulSliderProps {
    
    inline def apply(): StatefulSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulSliderProps]
    }
    
    extension [Self <: StatefulSliderProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setMarks(value: Boolean): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: /* a */ Params => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFinalChange(value: /* a */ Params => Any): Self = StObject.set(x, "onFinalChange", js.Any.fromFunction1(value))
      
      inline def setOnFinalChangeUndefined: Self = StObject.set(x, "onFinalChange", js.undefined)
      
      inline def setOverrides(value: SliderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPersistentThumb(value: Boolean): Self = StObject.set(x, "persistentThumb", value.asInstanceOf[js.Any])
      
      inline def setPersistentThumbUndefined: Self = StObject.set(x, "persistentThumb", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setValueToLabel(value: /* value */ Double => ReactNode): Self = StObject.set(x, "valueToLabel", js.Any.fromFunction1(value))
      
      inline def setValueToLabelUndefined: Self = StObject.set(x, "valueToLabel", js.undefined)
    }
  }
  
  trait StyleProps extends StObject {
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isDragged")
    var $isDragged: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$marks")
    var $marks: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$max")
    var $max: js.UndefOr[Double] = js.undefined
    
    @JSName("$min")
    var $min: js.UndefOr[Double] = js.undefined
    
    @JSName("$thumbIndex")
    var $thumbIndex: js.UndefOr[Double] = js.undefined
    
    @JSName("$value")
    var $value: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object StyleProps {
    
    inline def apply(): StyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProps]
    }
    
    extension [Self <: StyleProps](x: Self) {
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$isDragged(value: Boolean): Self = StObject.set(x, "$isDragged", value.asInstanceOf[js.Any])
      
      inline def set$isDraggedUndefined: Self = StObject.set(x, "$isDragged", js.undefined)
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
      
      inline def set$marks(value: Boolean): Self = StObject.set(x, "$marks", value.asInstanceOf[js.Any])
      
      inline def set$marksUndefined: Self = StObject.set(x, "$marks", js.undefined)
      
      inline def set$max(value: Double): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
      
      inline def set$maxUndefined: Self = StObject.set(x, "$max", js.undefined)
      
      inline def set$min(value: Double): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
      
      inline def set$minUndefined: Self = StObject.set(x, "$min", js.undefined)
      
      inline def set$thumbIndex(value: Double): Self = StObject.set(x, "$thumbIndex", value.asInstanceOf[js.Any])
      
      inline def set$thumbIndexUndefined: Self = StObject.set(x, "$thumbIndex", js.undefined)
      
      inline def set$value(value: js.Array[Double]): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
      
      inline def set$valueUndefined: Self = StObject.set(x, "$value", js.undefined)
      
      inline def set$valueVarargs(value: Double*): Self = StObject.set(x, "$value", js.Array(value*))
    }
  }
}
