package typings.baseui

import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.overridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinCodeTypesMod {
  
  trait ChangeEvent extends StObject {
    
    var event: Any
    
    var values: js.Array[String]
  }
  object ChangeEvent {
    
    inline def apply(event: Any, values: js.Array[String]): ChangeEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
    
    extension [Self <: ChangeEvent](x: Self) {
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait PinCodeOverrides extends StObject {
    
    var Input: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object PinCodeOverrides {
    
    inline def apply(): PinCodeOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinCodeOverrides]
    }
    
    extension [Self <: PinCodeOverrides](x: Self) {
      
      inline def setInput(value: Override[Any]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait PinCodeProps extends StObject {
    
    /** Sets aria-describedby attribute for each input element. */
    var `aria-describedby`: js.UndefOr[String | Null] = js.undefined
    
    /** Sets aria-label attribute for each input element. */
    var `aria-label`: js.UndefOr[String | Null] = js.undefined
    
    /** Sets aria-labelledby attribute for each input element. */
    var `aria-labelledby`: js.UndefOr[String | Null] = js.undefined
    
    /** Sets autocomplete attribute for each input element. */
    var autoComplete: js.UndefOr[String | Null] = js.undefined
    
    /** If true, the first input will be focused upon mounting. */
    var autoFocus: Boolean
    
    /** Render the component in a disabled state. */
    var disabled: Boolean
    
    /** Renders the component in an error state. */
    var error: Boolean
    
    /** Sets the base id string that will be applied to the id attribute of each input element. The index of the input will be appended to this base string. Ex: `id="foo"` -> `id="foo-1"`, `id="foo-2",` etc... */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /** If true, when a pin code input receives a valid value, focus will be transferred to the next pin code input (until the end of the inputs). */
    var manageFocus: Boolean
    
    /** Mask for pin code. Default is no mask. Set it true then mask is ".". Also accept string input as customized mask style. */
    var mask: Boolean | String
    
    /** Sets the name attribute of each input element. */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** A handler for when any pin code input changes value. */
    def onChange(a: ChangeEvent): Any
    
    var overrides: PinCodeOverrides
    
    /** Sets the placeholder text for each pin code input element. */
    var placeholder: String
    
    /** Renders the component in a positive state. */
    var positive: Boolean
    
    /** Sets the required attribute of each pin code input element. */
    var required: Boolean
    
    /** Renders the component at a given size. */
    var size: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_
    
    /** An array of values respective to each pin code input. */
    var values: js.Array[String]
  }
  object PinCodeProps {
    
    inline def apply(
      autoFocus: Boolean,
      disabled: Boolean,
      error: Boolean,
      manageFocus: Boolean,
      mask: Boolean | String,
      onChange: ChangeEvent => Any,
      overrides: PinCodeOverrides,
      placeholder: String,
      positive: Boolean,
      required: Boolean,
      size: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_,
      values: js.Array[String]
    ): PinCodeProps = {
      val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], manageFocus = manageFocus.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), overrides = overrides.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinCodeProps]
    }
    
    extension [Self <: PinCodeProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyNull`: Self = StObject.set(x, "aria-describedby", null)
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelNull`: Self = StObject.set(x, "aria-label", null)
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyNull`: Self = StObject.set(x, "aria-labelledby", null)
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteNull: Self = StObject.set(x, "autoComplete", null)
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setManageFocus(value: Boolean): Self = StObject.set(x, "manageFocus", value.asInstanceOf[js.Any])
      
      inline def setMask(value: Boolean | String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: ChangeEvent => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: PinCodeOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSize(value: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait State extends StObject {
    
    var hasFocus: Boolean
  }
  object State {
    
    inline def apply(hasFocus: Boolean): State = {
      val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
    }
  }
  
  type StateChange = change_
  
  type StateReducer = js.Function3[
    /* type */ StateChange, 
    /* nextState */ StatefulPinCodeContainerState, 
    /* currentState */ StatefulPinCodeContainerState, 
    StatefulPinCodeContainerState
  ]
  
  trait StatefulPinCodeContainerProps
    extends StObject
       with PinCodeProps {
    
    def children(a: PinCodeProps): ReactNode
    
    var initialState: StatefulPinCodeContainerState
    
    var stateReducer: StateReducer
  }
  object StatefulPinCodeContainerProps {
    
    inline def apply(
      autoFocus: Boolean,
      children: PinCodeProps => ReactNode,
      disabled: Boolean,
      error: Boolean,
      initialState: StatefulPinCodeContainerState,
      manageFocus: Boolean,
      mask: Boolean | String,
      onChange: ChangeEvent => Any,
      overrides: PinCodeOverrides,
      placeholder: String,
      positive: Boolean,
      required: Boolean,
      size: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_,
      stateReducer: (/* type */ StateChange, /* nextState */ StatefulPinCodeContainerState, /* currentState */ StatefulPinCodeContainerState) => StatefulPinCodeContainerState,
      values: js.Array[String]
    ): StatefulPinCodeContainerProps = {
      val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], manageFocus = manageFocus.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), overrides = overrides.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer), values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPinCodeContainerProps]
    }
    
    extension [Self <: StatefulPinCodeContainerProps](x: Self) {
      
      inline def setChildren(value: PinCodeProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: StatefulPinCodeContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setStateReducer(
        value: (/* type */ StateChange, /* nextState */ StatefulPinCodeContainerState, /* currentState */ StatefulPinCodeContainerState) => StatefulPinCodeContainerState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    }
  }
  
  trait StatefulPinCodeContainerState extends StObject {
    
    var values: js.Array[String]
  }
  object StatefulPinCodeContainerState {
    
    inline def apply(values: js.Array[String]): StatefulPinCodeContainerState = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPinCodeContainerState]
    }
    
    extension [Self <: StatefulPinCodeContainerState](x: Self) {
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait StatefulPinCodeProps
    extends StObject
       with PinCodeProps {
    
    var initialState: js.UndefOr[StatefulPinCodeContainerState] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent, Any]] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulPinCodeProps {
    
    inline def apply(
      autoFocus: Boolean,
      disabled: Boolean,
      error: Boolean,
      manageFocus: Boolean,
      mask: Boolean | String,
      overrides: PinCodeOverrides,
      placeholder: String,
      positive: Boolean,
      required: Boolean,
      size: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_,
      values: js.Array[String]
    ): StatefulPinCodeProps = {
      val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], manageFocus = manageFocus.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPinCodeProps]
    }
    
    extension [Self <: StatefulPinCodeProps](x: Self) {
      
      inline def setInitialState(value: StatefulPinCodeContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* event */ ChangeEvent => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStateReducer(
        value: (/* type */ StateChange, /* nextState */ StatefulPinCodeContainerState, /* currentState */ StatefulPinCodeContainerState) => StatefulPinCodeContainerState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
