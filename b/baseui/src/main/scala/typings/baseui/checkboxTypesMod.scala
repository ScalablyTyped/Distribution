package typings.baseui

import typings.baseui.baseuiStrings.default_
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxTypesMod {
  
  trait CheckboxOverrides extends StObject {
    
    var Checkmark: js.UndefOr[Override[Any]] = js.undefined
    
    var Input: js.UndefOr[Override[Any]] = js.undefined
    
    var Label: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Toggle: js.UndefOr[Override[Any]] = js.undefined
    
    var ToggleInner: js.UndefOr[Override[Any]] = js.undefined
    
    var ToggleTrack: js.UndefOr[Override[Any]] = js.undefined
  }
  object CheckboxOverrides {
    
    inline def apply(): CheckboxOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxOverrides]
    }
    
    extension [Self <: CheckboxOverrides](x: Self) {
      
      inline def setCheckmark(value: Override[Any]): Self = StObject.set(x, "Checkmark", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkUndefined: Self = StObject.set(x, "Checkmark", js.undefined)
      
      inline def setInput(value: Override[Any]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setLabel(value: Override[Any]): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setToggle(value: Override[Any]): Self = StObject.set(x, "Toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleInner(value: Override[Any]): Self = StObject.set(x, "ToggleInner", value.asInstanceOf[js.Any])
      
      inline def setToggleInnerUndefined: Self = StObject.set(x, "ToggleInner", js.undefined)
      
      inline def setToggleTrack(value: Override[Any]): Self = StObject.set(x, "ToggleTrack", value.asInstanceOf[js.Any])
      
      inline def setToggleTrackUndefined: Self = StObject.set(x, "ToggleTrack", js.undefined)
      
      inline def setToggleUndefined: Self = StObject.set(x, "Toggle", js.undefined)
    }
  }
  
  trait CheckboxProps extends StObject {
    
    /** Id of element which contains a related caption */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /** Id of element which contains a related error message */
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** Passed to the input element aria-label attribute. */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /** Focus the checkbox on initial render. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Check or uncheck the control. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Renders UI as checkmark or toggle switch. */
    var checkmarkType: js.UndefOr[StyleType] = js.undefined
    
    /** Component or String value for label of checkbox. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Indicates if this checkbox children contain an interactive element (prevents the label from moving focus from the child element to the radio button) */
    var containsInteractiveElement: js.UndefOr[Boolean] = js.undefined
    
    /** Disable the checkbox from being changed. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Renders checkbox in errored state. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Used to get a ref to the input element. Useful for programmatically focusing the input */
    var inputRef: js.UndefOr[RefObject[HTMLInputElement]] = js.undefined
    
    /** Indicates a 'half' state for the checkmark. In this case, `checked` is ignored. */
    var isIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** How to position the label relative to the checkbox itself. */
    var labelPlacement: js.UndefOr[LabelPlacement] = js.undefined
    
    /** Passed to the input element name attribute */
    var name: js.UndefOr[String] = js.undefined
    
    /** handler for blur events on trigger element. */
    var onBlur: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for change events on trigger element. */
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** handler for focus events on trigger element. */
    var onFocus: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for mousedown events on trigger element. */
    var onMouseDown: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for mouseenter events on trigger element. */
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for mouseleave events on trigger element. */
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for mouseup events on trigger element. */
    var onMouseUp: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
    
    /** Marks the checkbox as required. */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /** Text to display in native OS tooltip on long hover. */
    var title: js.UndefOr[String | Null] = js.undefined
    
    /** Passed to the input element type attribute */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Passed to the input element value attribute */
    var value: js.UndefOr[String] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCheckmarkType(value: StyleType): Self = StObject.set(x, "checkmarkType", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkTypeUndefined: Self = StObject.set(x, "checkmarkType", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainsInteractiveElement(value: Boolean): Self = StObject.set(x, "containsInteractiveElement", value.asInstanceOf[js.Any])
      
      inline def setContainsInteractiveElementUndefined: Self = StObject.set(x, "containsInteractiveElement", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseDown(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckboxReducerState extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var isIndeterminate: js.UndefOr[Boolean] = js.undefined
  }
  object CheckboxReducerState {
    
    inline def apply(): CheckboxReducerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxReducerState]
    }
    
    extension [Self <: CheckboxReducerState](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
    }
  }
  
  trait CheckboxState extends StObject {
    
    var isActive: Boolean
    
    var isFocusVisible: Boolean
    
    var isFocused: Boolean
    
    var isHovered: Boolean
  }
  object CheckboxState {
    
    inline def apply(isActive: Boolean, isFocusVisible: Boolean, isFocused: Boolean, isHovered: Boolean): CheckboxState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxState]
    }
    
    extension [Self <: CheckboxState](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultProps extends StObject {
    
    var autoFocus: Boolean
    
    var checked: Boolean
    
    var checkmarkType: StyleType
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var containsInteractiveElement: js.UndefOr[Boolean] = js.undefined
    
    var disabled: Boolean
    
    var error: Boolean
    
    var inputRef: RefObject[HTMLInputElement]
    
    var isIndeterminate: Boolean
    
    def onBlur(e: ChangeEvent[HTMLInputElement]): Any
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Any
    
    def onFocus(e: ChangeEvent[HTMLInputElement]): Any
    
    def onMouseDown(e: ChangeEvent[HTMLInputElement]): Any
    
    def onMouseEnter(e: ChangeEvent[HTMLInputElement]): Any
    
    def onMouseLeave(e: ChangeEvent[HTMLInputElement]): Any
    
    def onMouseUp(e: ChangeEvent[HTMLInputElement]): Any
    
    var overrides: js.UndefOr[Any] = js.undefined
    
    var `type`: String
  }
  object DefaultProps {
    
    inline def apply(
      autoFocus: Boolean,
      checked: Boolean,
      checkmarkType: StyleType,
      disabled: Boolean,
      error: Boolean,
      inputRef: RefObject[HTMLInputElement],
      isIndeterminate: Boolean,
      onBlur: ChangeEvent[HTMLInputElement] => Any,
      onChange: ChangeEvent[HTMLInputElement] => Any,
      onFocus: ChangeEvent[HTMLInputElement] => Any,
      onMouseDown: ChangeEvent[HTMLInputElement] => Any,
      onMouseEnter: ChangeEvent[HTMLInputElement] => Any,
      onMouseLeave: ChangeEvent[HTMLInputElement] => Any,
      onMouseUp: ChangeEvent[HTMLInputElement] => Any,
      `type`: String
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], checkmarkType = checkmarkType.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any], isIndeterminate = isIndeterminate.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onFocus = js.Any.fromFunction1(onFocus), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseUp = js.Any.fromFunction1(onMouseUp))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    extension [Self <: DefaultProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkType(value: StyleType): Self = StObject.set(x, "checkmarkType", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainsInteractiveElement(value: Boolean): Self = StObject.set(x, "containsInteractiveElement", value.asInstanceOf[js.Any])
      
      inline def setContainsInteractiveElementUndefined: Self = StObject.set(x, "containsInteractiveElement", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInputRef(value: RefObject[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnMouseDown(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnter(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeave(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseUp(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultStatefulProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* a */ StatefulContainerChildProps, ReactNode]] = js.undefined
    
    var initialState: CheckboxReducerState
    
    def onBlur(e: ChangeEvent[HTMLInputElement]): Any
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Any
    
    def onFocus(e: ChangeEvent[HTMLInputElement]): Any
    
    def onMouseEnter(e: ChangeEvent[HTMLInputElement]): Any
    
    def onMouseLeave(e: ChangeEvent[HTMLInputElement]): Any
    
    var stateReducer: StateReducer
  }
  object DefaultStatefulProps {
    
    inline def apply(
      initialState: CheckboxReducerState,
      onBlur: ChangeEvent[HTMLInputElement] => Any,
      onChange: ChangeEvent[HTMLInputElement] => Any,
      onFocus: ChangeEvent[HTMLInputElement] => Any,
      onMouseEnter: ChangeEvent[HTMLInputElement] => Any,
      onMouseLeave: ChangeEvent[HTMLInputElement] => Any,
      stateReducer: (/* stateType */ String, /* nextState */ CheckboxReducerState, /* currentState */ CheckboxReducerState, /* event */ ChangeEvent[HTMLInputElement]) => CheckboxReducerState
    ): DefaultStatefulProps = {
      val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onFocus = js.Any.fromFunction1(onFocus), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), stateReducer = js.Any.fromFunction4(stateReducer))
      __obj.asInstanceOf[DefaultStatefulProps]
    }
    
    extension [Self <: DefaultStatefulProps](x: Self) {
      
      inline def setChildren(value: /* a */ StatefulContainerChildProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: CheckboxReducerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnter(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeave(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setStateReducer(
        value: (/* stateType */ String, /* nextState */ CheckboxReducerState, /* currentState */ CheckboxReducerState, /* event */ ChangeEvent[HTMLInputElement]) => CheckboxReducerState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction4(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.top
    - typings.baseui.baseuiStrings.right
    - typings.baseui.baseuiStrings.bottom
    - typings.baseui.baseuiStrings.left
  */
  trait LabelPlacement extends StObject
  object LabelPlacement {
    
    inline def bottom: typings.baseui.baseuiStrings.bottom = "bottom".asInstanceOf[typings.baseui.baseuiStrings.bottom]
    
    inline def left: typings.baseui.baseuiStrings.left = "left".asInstanceOf[typings.baseui.baseuiStrings.left]
    
    inline def right: typings.baseui.baseuiStrings.right = "right".asInstanceOf[typings.baseui.baseuiStrings.right]
    
    inline def top: typings.baseui.baseuiStrings.top = "top".asInstanceOf[typings.baseui.baseuiStrings.top]
  }
  
  trait SharedStyleProps extends StObject {
    
    @JSName("$checked")
    var $checked: Boolean
    
    @JSName("$disabled")
    var $disabled: Boolean
    
    @JSName("$error")
    var $error: Boolean
    
    @JSName("$isActive")
    var $isActive: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isFocused")
    var $isFocused: Boolean
    
    @JSName("$isHovered")
    var $isHovered: Boolean
    
    @JSName("$isIndeterminate")
    var $isIndeterminate: Boolean
    
    @JSName("$labelPlacement")
    var $labelPlacement: LabelPlacement
    
    @JSName("$required")
    var $required: Boolean
    
    @JSName("$value")
    var $value: String
  }
  object SharedStyleProps {
    
    inline def apply(
      $checked: Boolean,
      $disabled: Boolean,
      $error: Boolean,
      $isActive: Boolean,
      $isFocusVisible: Boolean,
      $isFocused: Boolean,
      $isHovered: Boolean,
      $isIndeterminate: Boolean,
      $labelPlacement: LabelPlacement,
      $required: Boolean,
      $value: String
    ): SharedStyleProps = {
      val __obj = js.Dynamic.literal($checked = $checked.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $isHovered = $isHovered.asInstanceOf[js.Any], $isIndeterminate = $isIndeterminate.asInstanceOf[js.Any], $labelPlacement = $labelPlacement.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStyleProps]
    }
    
    extension [Self <: SharedStyleProps](x: Self) {
      
      inline def set$checked(value: Boolean): Self = StObject.set(x, "$checked", value.asInstanceOf[js.Any])
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
      
      inline def set$isActive(value: Boolean): Self = StObject.set(x, "$isActive", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
      
      inline def set$isHovered(value: Boolean): Self = StObject.set(x, "$isHovered", value.asInstanceOf[js.Any])
      
      inline def set$isIndeterminate(value: Boolean): Self = StObject.set(x, "$isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def set$labelPlacement(value: LabelPlacement): Self = StObject.set(x, "$labelPlacement", value.asInstanceOf[js.Any])
      
      inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
      
      inline def set$value(value: String): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
    }
  }
  
  type StateReducer = js.Function4[
    /* stateType */ String, 
    /* nextState */ CheckboxReducerState, 
    /* currentState */ CheckboxReducerState, 
    /* event */ ChangeEvent[HTMLInputElement], 
    CheckboxReducerState
  ]
  
  /* Inlined {  initialState :baseui.baseui/checkbox/types.CheckboxReducerState | undefined} & std.Omit<baseui.baseui/checkbox/types.CheckboxProps, 'value' | keyof baseui.baseui/checkbox/types.DefaultProps> & std.Partial<baseui.baseui/checkbox/types.DefaultProps> */
  trait StatefulCheckboxProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkmarkType: js.UndefOr[StyleType] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var containsInteractiveElement: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the components initial state value */
    var initialState: js.UndefOr[CheckboxReducerState] = js.undefined
    
    var inputRef: js.UndefOr[RefObject[HTMLInputElement]] = js.undefined
    
    var isIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    var labelPlacement: js.UndefOr[LabelPlacement] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var overrides: js.UndefOr[Any] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | Null] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object StatefulCheckboxProps {
    
    inline def apply(): StatefulCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulCheckboxProps]
    }
    
    extension [Self <: StatefulCheckboxProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCheckmarkType(value: StyleType): Self = StObject.set(x, "checkmarkType", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkTypeUndefined: Self = StObject.set(x, "checkmarkType", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainsInteractiveElement(value: Boolean): Self = StObject.set(x, "containsInteractiveElement", value.asInstanceOf[js.Any])
      
      inline def setContainsInteractiveElementUndefined: Self = StObject.set(x, "containsInteractiveElement", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInitialState(value: CheckboxReducerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseDown(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StatefulContainerChildProps
    extends StObject
       with CheckboxReducerState {
    
    /** Focus the checkbox on initial render. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Handler for blur events on trigger element. */
    var onBlur: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for change events on trigger element. */
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for focus events on trigger element. */
    var onFocus: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for mouseenter events on trigger element. */
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for mouseleave events on trigger element. */
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
  }
  object StatefulContainerChildProps {
    
    inline def apply(): StatefulContainerChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulContainerChildProps]
    }
    
    extension [Self <: StatefulContainerChildProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setOnBlur(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseEnter(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait StatefulContainerProps extends StObject {
    
    /** Focus the checkbox on initial render. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Component or String value for label of checkbox. */
    var children: js.UndefOr[js.Function1[/* a */ StatefulContainerChildProps, ReactNode]] = js.undefined
    
    /** Defines the components initial state value */
    var initialState: js.UndefOr[CheckboxReducerState] = js.undefined
    
    /** Handler for blur events on trigger element. */
    var onBlur: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for change events on trigger element. */
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for focus events on trigger element. */
    var onFocus: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for mouseenter events on trigger element. */
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    /** Handler for mouseleave events on trigger element. */
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
    
    /** A state change handler. Used to override default state transitions. */
    var stateReducer: StateReducer
  }
  object StatefulContainerProps {
    
    inline def apply(
      stateReducer: (/* stateType */ String, /* nextState */ CheckboxReducerState, /* currentState */ CheckboxReducerState, /* event */ ChangeEvent[HTMLInputElement]) => CheckboxReducerState
    ): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(stateReducer = js.Any.fromFunction4(stateReducer))
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: /* a */ StatefulContainerChildProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: CheckboxReducerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnBlur(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseEnter(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateType */ String, /* nextState */ CheckboxReducerState, /* currentState */ CheckboxReducerState, /* event */ ChangeEvent[HTMLInputElement]) => CheckboxReducerState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction4(value))
    }
  }
  
  /* Inlined keyof std.Readonly<{ readonly default :'default',  readonly toggle :'toggle',  readonly toggle_round :'toggle'}> */
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.default_
    - typings.baseui.baseuiStrings.toggle
    - typings.baseui.baseuiStrings.toggle_round
  */
  trait StyleType extends StObject
  object StyleType {
    
    inline def default: default_ = "default".asInstanceOf[default_]
    
    inline def toggle: typings.baseui.baseuiStrings.toggle = "toggle".asInstanceOf[typings.baseui.baseuiStrings.toggle]
    
    inline def toggle_round: typings.baseui.baseuiStrings.toggle_round = "toggle_round".asInstanceOf[typings.baseui.baseuiStrings.toggle_round]
  }
}
