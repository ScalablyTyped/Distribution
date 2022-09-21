package typings.baseui

import typings.baseui.baseuiStrings.any
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.end_
import typings.baseui.baseuiStrings.start
import typings.baseui.overridesMod.Override
import typings.csstype.mod.Property.Resize
import typings.react.mod.ChangeEvent
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesMod {
  
  /* keyof baseui.anon.Both */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.none
    - typings.baseui.baseuiStrings.left
    - typings.baseui.baseuiStrings.right
    - typings.baseui.baseuiStrings.both
  */
  trait Adjoined extends StObject
  
  trait BaseInputOverrides extends StObject {
    
    var After: js.UndefOr[Override[Any]] = js.undefined
    
    var Before: js.UndefOr[Override[Any]] = js.undefined
    
    var ClearIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var ClearIconContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Input: js.UndefOr[Override[Any]] = js.undefined
    
    var InputContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var MaskToggleButton: js.UndefOr[Override[Any]] = js.undefined
    
    var MaskToggleHideIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var MaskToggleShowIcon: js.UndefOr[Override[Any]] = js.undefined
  }
  object BaseInputOverrides {
    
    inline def apply(): BaseInputOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseInputOverrides]
    }
    
    extension [Self <: BaseInputOverrides](x: Self) {
      
      inline def setAfter(value: Override[Any]): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
      
      inline def setBefore(value: Override[Any]): Self = StObject.set(x, "Before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "Before", js.undefined)
      
      inline def setClearIcon(value: Override[Any]): Self = StObject.set(x, "ClearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconContainer(value: Override[Any]): Self = StObject.set(x, "ClearIconContainer", value.asInstanceOf[js.Any])
      
      inline def setClearIconContainerUndefined: Self = StObject.set(x, "ClearIconContainer", js.undefined)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "ClearIcon", js.undefined)
      
      inline def setInput(value: Override[Any]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputContainer(value: Override[Any]): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
      
      inline def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setMaskToggleButton(value: Override[Any]): Self = StObject.set(x, "MaskToggleButton", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleButtonUndefined: Self = StObject.set(x, "MaskToggleButton", js.undefined)
      
      inline def setMaskToggleHideIcon(value: Override[Any]): Self = StObject.set(x, "MaskToggleHideIcon", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleHideIconUndefined: Self = StObject.set(x, "MaskToggleHideIcon", js.undefined)
      
      inline def setMaskToggleShowIcon(value: Override[Any]): Self = StObject.set(x, "MaskToggleShowIcon", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleShowIconUndefined: Self = StObject.set(x, "MaskToggleShowIcon", js.undefined)
    }
  }
  
  trait BaseInputProps[T] extends StObject {
    
    /** Defines styles for inputs that are grouped with other controls. */
    var adjoined: js.UndefOr[Adjoined] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    /** Sets aria-describedby attribute. */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /** Id of element which contains a related error message */
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    /** Sets aria-haspopup attribute. */
    var `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    /** Sets aria-label attribute. */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** Sets aria-labelledby attribute. */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /** Determines if browser should provide value suggestions. */
    var autoComplete: js.UndefOr[String] = js.undefined
    
    /** If true the input will be focused on the first mount. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** If undefined or true, clears the input when the Escape button is pressed with the input focused. True by default. */
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    /** If true, adds a clear value icon button to the end of the input container. */
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    /** Renders component in 'disabled' state. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Renders component in 'error' state. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Id attribute value to be added to the input element and as a label's for attribute value. */
    var id: js.UndefOr[String] = js.undefined
    
    /** A  hint as to the type of data that might be entered by the user while editing the element or its contents. */
    var inputMode: js.UndefOr[String] = js.undefined
    
    /** A ref to access an input element. */
    var inputRef: js.UndefOr[RefObject[T]] = js.undefined
    
    /** max value when used as input type=number */
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /** min value when used as input type=number */
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[T, Element], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[T], Unit]] = js.undefined
    
    var onClear: js.UndefOr[js.Function1[/* e */ SyntheticEvent[T, Event], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[T, Element], Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[T], Unit]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function1[/* e */ KeyboardEvent[T], Unit]] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent[T], Unit]] = js.undefined
    
    var overrides: js.UndefOr[BaseInputOverrides] = js.undefined
    
    /** A regex that is used to validate the value of the input on form submission. The Input component must be wrapped in a form element */
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Renders component in 'positive' state. */
    var positive: js.UndefOr[Boolean] = js.undefined
    
    /** Renders component in 'readOnly' state. */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Renders component in 'required' state. */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Resize] = js.undefined
    
    /** Input role attribute. */
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    /** Renders component in provided size. */
    var size: js.UndefOr[Size] = js.undefined
    
    /** step value when used as input type=number */
    var step: js.UndefOr[Double | any] = js.undefined
    
    /** Input type attribute. */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Input value attribute. */
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object BaseInputProps {
    
    inline def apply[T](): BaseInputProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseInputProps[T]]
    }
    
    extension [Self <: BaseInputProps[?], T](x: Self & BaseInputProps[T]) {
      
      inline def setAdjoined(value: Adjoined): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: RefObject[T]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[T, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: /* e */ SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[T, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: BaseInputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStep(value: Double | any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined baseui.baseui/input/types.InputProps & baseui.baseui/input/types.StatefulContainerProps<std.HTMLInputElement | std.HTMLTextAreaElement> */
  trait FullStProps extends StObject {
    
    /** Defines styles for inputs that are grouped with other controls. */
    var adjoined: js.UndefOr[Adjoined] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    /** Sets aria-describedby attribute. */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /** Id of element which contains a related error message */
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    /** Sets aria-haspopup attribute. */
    var `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    /** Sets aria-label attribute. */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** Sets aria-labelledby attribute. */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /** Determines if browser should provide value suggestions. */
    var autoComplete: js.UndefOr[String] = js.undefined
    
    /** If true the input will be focused on the first mount. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    def children(props: StatefulContainerChildrenProps[HTMLInputElement | HTMLTextAreaElement]): ReactNode
    
    /** If undefined or true, clears the input when the Escape button is pressed with the input focused. True by default. */
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    /** If true, adds a clear value icon button to the end of the input container. */
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    /** Renders component in 'disabled' state. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** An input helper rendered after and attached to the input field. */
    var endEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    /** Renders component in 'error' state. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Id attribute value to be added to the input element and as a label's for attribute value. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Initial state of an uncontrolled input component. */
    var initialState: js.UndefOr[State] = js.undefined
    
    /** A  hint as to the type of data that might be entered by the user while editing the element or its contents. */
    var inputMode: js.UndefOr[String] = js.undefined
    
    /** A ref to access an input element. */
    var inputRef: js.UndefOr[RefObject[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    /** max value when used as input type=number */
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /** min value when used as input type=number */
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    /** Handler for the `blur` event. */
    var onBlur: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]] = js.undefined
    
    var onClear: js.UndefOr[
        js.Function1[/* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event], Unit]
      ] = js.undefined
    
    /** Handler for the `focus` event. */
    var onFocus: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var overrides: js.UndefOr[InputOverrides] = js.undefined
    
    /** A regex that is used to validate the value of the input on form submission. The Input component must be wrapped in a form element */
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Renders component in 'positive' state. */
    var positive: js.UndefOr[Boolean] = js.undefined
    
    /** Renders component in 'readOnly' state. */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Renders component in 'required' state. */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Resize] = js.undefined
    
    /** Input role attribute. */
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    /** Renders component in provided size. */
    var size: js.UndefOr[Size] = js.undefined
    
    /** An input helper rendered before and attached to the input field. */
    var startEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    /** A state change handler. Used to override default state transitions. */
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
    
    /** step value when used as input type=number */
    var step: js.UndefOr[Double | any] = js.undefined
    
    /** Input type attribute. */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Input value attribute. */
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object FullStProps {
    
    inline def apply(children: StatefulContainerChildrenProps[HTMLInputElement | HTMLTextAreaElement] => ReactNode): FullStProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[FullStProps]
    }
    
    extension [Self <: FullStProps](x: Self) {
      
      inline def setAdjoined(value: Adjoined): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: StatefulContainerChildrenProps[HTMLInputElement | HTMLTextAreaElement] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: /* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: InputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      inline def setStep(value: Double | any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait InputOverrides
    extends StObject
       with BaseInputOverrides {
    
    var EndEnhancer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var StartEnhancer: js.UndefOr[Override[Any]] = js.undefined
  }
  object InputOverrides {
    
    inline def apply(): InputOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputOverrides]
    }
    
    extension [Self <: InputOverrides](x: Self) {
      
      inline def setEndEnhancer(value: Override[Any]): Self = StObject.set(x, "EndEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "EndEnhancer", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStartEnhancer(value: Override[Any]): Self = StObject.set(x, "StartEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "StartEnhancer", js.undefined)
    }
  }
  
  trait InputProps
    extends StObject
       with BaseInputProps[HTMLInputElement | HTMLTextAreaElement] {
    
    /** An input helper rendered after and attached to the input field. */
    var endEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    @JSName("overrides")
    var overrides_InputProps: js.UndefOr[InputOverrides] = js.undefined
    
    /** An input helper rendered before and attached to the input field. */
    var startEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setEndEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setOverrides(value: InputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStartEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
    }
  }
  
  trait InternalState extends StObject {
    
    /** Tracks if focus should be visible on the clear button. */
    var isFocusVisibleForClear: js.UndefOr[Boolean] = js.undefined
    
    /** Tracks if focus should be visible on the mask toggle button. */
    var isFocusVisibleForMaskToggle: js.UndefOr[Boolean] = js.undefined
    
    /** Renders UI in 'focus' state */
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    /** Renders input in 'masked' state if type equals "password" */
    var isMasked: js.UndefOr[Boolean] = js.undefined
  }
  object InternalState {
    
    inline def apply(): InternalState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalState]
    }
    
    extension [Self <: InternalState](x: Self) {
      
      inline def setIsFocusVisibleForClear(value: Boolean): Self = StObject.set(x, "isFocusVisibleForClear", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisibleForClearUndefined: Self = StObject.set(x, "isFocusVisibleForClear", js.undefined)
      
      inline def setIsFocusVisibleForMaskToggle(value: Boolean): Self = StObject.set(x, "isFocusVisibleForMaskToggle", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisibleForMaskToggleUndefined: Self = StObject.set(x, "isFocusVisibleForMaskToggle", js.undefined)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setIsMasked(value: Boolean): Self = StObject.set(x, "isMasked", value.asInstanceOf[js.Any])
      
      inline def setIsMaskedUndefined: Self = StObject.set(x, "isMasked", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  mask :string | undefined,   maskChar :string | undefined} & baseui.baseui/input/types.InputProps> */
  trait MaskedInputProps extends StObject {
    
    var adjoined: js.UndefOr[Adjoined] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[RefObject[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var maskChar: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]] = js.undefined
    
    var onClear: js.UndefOr[
        js.Function1[/* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event], Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var overrides: js.UndefOr[InputOverrides] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Resize] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var startEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var step: js.UndefOr[Double | any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object MaskedInputProps {
    
    inline def apply(): MaskedInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    extension [Self <: MaskedInputProps](x: Self) {
      
      inline def setAdjoined(value: Adjoined): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
      
      inline def setMaskCharUndefined: Self = StObject.set(x, "maskChar", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: /* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: InputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setStep(value: Double | any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SharedProps extends StObject {
    
    /** Defines styles for inputs that are grouped with other controls. */
    @JSName("$adjoined")
    var $adjoined: Adjoined
    
    /** Renders UI in 'disabled' state */
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Renders UI in 'error' state */
    @JSName("$error")
    var $error: js.UndefOr[Boolean] = js.undefined
    
    /** Defines if has a clearable or MaskToggleButton at the end */
    @JSName("$hasIconTrailing")
    var $hasIconTrailing: js.UndefOr[Boolean] = js.undefined
    
    /** Renders UI in 'focus' state */
    @JSName("$isFocused")
    var $isFocused: js.UndefOr[Boolean] = js.undefined
    
    /** Renders UI in 'readOnly' state */
    @JSName("$isReadOnly")
    var $isReadOnly: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$position")
    var $position: js.UndefOr[start | end_] = js.undefined
    
    /** Renders UI in 'positive' state */
    @JSName("$positive")
    var $positive: js.UndefOr[Boolean] = js.undefined
    
    /** Renders UI in 'required' state */
    @JSName("$required")
    var $required: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$resize")
    var $resize: js.UndefOr[Resize] = js.undefined
    
    /** Renders UI in provided size. */
    @JSName("$size")
    var $size: Size
  }
  object SharedProps {
    
    inline def apply($adjoined: Adjoined, $size: Size): SharedProps = {
      val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedProps]
    }
    
    extension [Self <: SharedProps](x: Self) {
      
      inline def set$adjoined(value: Adjoined): Self = StObject.set(x, "$adjoined", value.asInstanceOf[js.Any])
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
      
      inline def set$errorUndefined: Self = StObject.set(x, "$error", js.undefined)
      
      inline def set$hasIconTrailing(value: Boolean): Self = StObject.set(x, "$hasIconTrailing", value.asInstanceOf[js.Any])
      
      inline def set$hasIconTrailingUndefined: Self = StObject.set(x, "$hasIconTrailing", js.undefined)
      
      inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
      
      inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
      
      inline def set$isReadOnly(value: Boolean): Self = StObject.set(x, "$isReadOnly", value.asInstanceOf[js.Any])
      
      inline def set$isReadOnlyUndefined: Self = StObject.set(x, "$isReadOnly", js.undefined)
      
      inline def set$position(value: start | end_): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
      
      inline def set$positionUndefined: Self = StObject.set(x, "$position", js.undefined)
      
      inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
      
      inline def set$positiveUndefined: Self = StObject.set(x, "$positive", js.undefined)
      
      inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
      
      inline def set$requiredUndefined: Self = StObject.set(x, "$required", js.undefined)
      
      inline def set$resize(value: Resize): Self = StObject.set(x, "$resize", value.asInstanceOf[js.Any])
      
      inline def set$resizeUndefined: Self = StObject.set(x, "$resize", js.undefined)
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.Compact */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.mini
    - typings.baseui.baseuiStrings.default_
    - typings.baseui.baseuiStrings.compact
    - typings.baseui.baseuiStrings.large_
  */
  trait Size extends StObject
  
  /* Inlined std.Omit<baseui.baseui/input/types.FullStProps, 'overrides' | 'children'> */
  trait StInputPropsDiff extends StObject {
    
    var adjoined: js.UndefOr[Adjoined] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[RefObject[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]] = js.undefined
    
    var onClear: js.UndefOr[
        js.Function1[/* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event], Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Resize] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var startEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
    
    var step: js.UndefOr[Double | any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object StInputPropsDiff {
    
    inline def apply(): StInputPropsDiff = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StInputPropsDiff]
    }
    
    extension [Self <: StInputPropsDiff](x: Self) {
      
      inline def setAdjoined(value: Adjoined): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: /* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      inline def setStep(value: Double | any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type StateReducer = js.Function3[/* stateType */ StateType, /* nextState */ State, /* currentState */ State, State]
  
  type StateType = change_
  
  /* Inlined {onChange (e : react.react.ChangeEvent<T>): void,   clearable :boolean | undefined} & baseui.baseui/input/types.StatefulInputProps */
  @js.native
  trait StatefulContainerChildrenProps[T] extends StObject {
    
    var adjoined: js.UndefOr[Adjoined] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-autocomplete`: js.UndefOr[String] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-haspopup`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var clearOnEscape: js.UndefOr[Boolean] = js.native
    
    /** If true, adds a clear value icon button to the end of the input container. */
    var clearable: js.UndefOr[Boolean] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var endEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var inputMode: js.UndefOr[String] = js.native
    
    var inputRef: js.UndefOr[RefObject[HTMLInputElement | HTMLTextAreaElement]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]] = js.native
    def onChange(e: ChangeEvent[T]): Unit = js.native
    
    var onClear: js.UndefOr[
        js.Function1[/* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event], Unit]
      ] = js.native
    
    var onFocus: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.native
    
    var onKeyDown: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.native
    
    var onKeyPress: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.native
    
    var onKeyUp: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.native
    
    var overrides: js.UndefOr[InputOverrides] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var positive: js.UndefOr[Boolean] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resize: js.UndefOr[Resize] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Size] = js.native
    
    var startEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
    
    var step: js.UndefOr[Double | any] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  
  /* Inlined {children (props : baseui.baseui/input/types.StatefulContainerChildrenProps<T>): react.react.ReactNode,   initialState :baseui.baseui/input/types.State | undefined,   stateReducer :baseui.baseui/input/types.StateReducer | undefined,   onChange :(e : react.react.ChangeEvent<T>): void | undefined,   clearable :boolean | undefined,   overrides :baseui.baseui/input/types.InputOverrides | undefined} & std.Omit<baseui.baseui/input/types.InputProps, 'overrides' | 'children'> */
  trait StatefulContainerProps[T] extends StObject {
    
    var adjoined: js.UndefOr[Adjoined] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    def children(props: StatefulContainerChildrenProps[T]): ReactNode
    
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    /** If true, adds a clear value icon button to the end of the input container. */
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    /** Initial state of an uncontrolled input component. */
    var initialState: js.UndefOr[State] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[RefObject[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onChange: (js.UndefOr[js.Function1[/* e */ ChangeEvent[T], Unit]]) & (js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]])
    
    var onClear: js.UndefOr[
        js.Function1[/* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event], Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var overrides: js.UndefOr[InputOverrides] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Resize] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var startEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    /** A state change handler. Used to override default state transitions. */
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
    
    var step: js.UndefOr[Double | any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object StatefulContainerProps {
    
    inline def apply[T](
      children: StatefulContainerChildrenProps[T] => ReactNode,
      onChange: (js.UndefOr[js.Function1[/* e */ ChangeEvent[T], Unit]]) & (js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]])
    ): StatefulContainerProps[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps[T]]
    }
    
    extension [Self <: StatefulContainerProps[?], T](x: Self & StatefulContainerProps[T]) {
      
      inline def setAdjoined(value: Adjoined): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: StatefulContainerChildrenProps[T] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(
        value: (js.UndefOr[js.Function1[/* e */ ChangeEvent[T], Unit]]) & (js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]])
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnClear(value: /* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: InputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      inline def setStep(value: Double | any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined {  overrides :baseui.baseui/input/types.InputOverrides | undefined} & baseui.baseui/input/types.StInputPropsDiff */
  trait StatefulInputProps extends StObject {
    
    var adjoined: js.UndefOr[Adjoined] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[RefObject[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]] = js.undefined
    
    var onClear: js.UndefOr[
        js.Function1[/* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event], Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function1[/* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element], Unit]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.Function1[/* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    var overrides: js.UndefOr[InputOverrides] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Resize] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var startEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
    
    var step: js.UndefOr[Double | any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object StatefulInputProps {
    
    inline def apply(): StatefulInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulInputProps]
    }
    
    extension [Self <: StatefulInputProps](x: Self) {
      
      inline def setAdjoined(value: Adjoined): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      inline def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: /* e */ SyntheticEvent[HTMLInputElement | HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverrides(value: InputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: ReactNode | (js.Function1[/* props */ SharedProps, ReactNode])): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerFunction1(value: /* props */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      inline def setStep(value: Double | any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
