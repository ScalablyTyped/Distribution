package typings.baseui

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.top
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioTypesMod {
  
  /* keyof baseui.anon.Horizontal */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.vertical
    - typings.baseui.baseuiStrings.horizontal
  */
  trait Align extends StObject
  
  /* Inlined std.Partial<baseui.baseui/radio/types.RadioGroupProps> */
  trait DefaultProps extends StObject {
    
    var align: js.UndefOr[Align] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var labelPlacement: js.UndefOr[LabelPlacement] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var overrides: js.UndefOr[RadioGroupOverrides] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object DefaultProps {
    
    inline def apply(): DefaultProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultProps]
    }
    
    extension [Self <: DefaultProps](x: Self) {
      
      inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
      
      inline def setOnMouseEnter(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOverrides(value: RadioGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DefaultStatefulProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* props */ RadioGroupProps, ReactNode]] = js.undefined
    
    var initialState: State
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Any
    
    var stateReducer: StateReducer
  }
  object DefaultStatefulProps {
    
    inline def apply(
      initialState: State,
      onChange: ChangeEvent[HTMLInputElement] => Any,
      stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ ChangeEvent[HTMLInputElement]) => State
    ): DefaultStatefulProps = {
      val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), stateReducer = js.Any.fromFunction4(stateReducer))
      __obj.asInstanceOf[DefaultStatefulProps]
    }
    
    extension [Self <: DefaultStatefulProps](x: Self) {
      
      inline def setChildren(value: /* props */ RadioGroupProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setStateReducer(
        value: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ ChangeEvent[HTMLInputElement]) => State
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
  
  trait RadioGroupOverrides extends StObject {
    
    var RadioGroupRoot: js.UndefOr[Override[Any]] = js.undefined
  }
  object RadioGroupOverrides {
    
    inline def apply(): RadioGroupOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupOverrides]
    }
    
    extension [Self <: RadioGroupOverrides](x: Self) {
      
      inline def setRadioGroupRoot(value: Override[Any]): Self = StObject.set(x, "RadioGroupRoot", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupRootUndefined: Self = StObject.set(x, "RadioGroupRoot", js.undefined)
    }
  }
  
  trait RadioGroupProps extends StObject {
    
    /** How to position radio buttons in the group. */
    var align: js.UndefOr[Align] = js.undefined
    
    /** Id of element which contains a related caption */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /** Id of element which contains a related error message */
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    /**
      * Used to define a string that labels the radio group. Use this prop if the label is not
      * visible on screen. If the label is visible, use the 'aria-labeledby' prop instead.
      */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /**
      * Establishes a relationship between the radio group and its label. Screen readers use this
      * attribute to catalog the object on a page so that users can navigate between them.
      */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /** Set to be focused (active) on selected\checked radio. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** As `children` in React native approach represents radio buttons inside of Radio Group. Can use `Radio` from this package. */
    var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    /** Disabled all radio group from being changed. To disable some of radios provide disabled flag in each of them. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Sets radio group into error state. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Unique id for RadioGroup, help ARIA to identify element */
    var id: js.UndefOr[String] = js.undefined
    
    /** How to position the label relative to the radio itself. */
    var labelPlacement: js.UndefOr[LabelPlacement] = js.undefined
    
    /** String value for the name of RadioGroup, it is used to group buttons. If missed default is random ID string. */
    var name: js.UndefOr[String] = js.undefined
    
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
    
    var overrides: js.UndefOr[RadioGroupOverrides] = js.undefined
    
    /** Set if the control is required to be checked. */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /** The value of radio button, which is preselected. */
    var value: js.UndefOr[String] = js.undefined
  }
  object RadioGroupProps {
    
    inline def apply(): RadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    extension [Self <: RadioGroupProps](x: Self) {
      
      inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
      
      inline def setOnMouseEnter(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOverrides(value: RadioGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioOverrides extends StObject {
    
    var Description: js.UndefOr[Override[Any]] = js.undefined
    
    var Input: js.UndefOr[Override[Any]] = js.undefined
    
    var Label: js.UndefOr[Override[Any]] = js.undefined
    
    var RadioMarkInner: js.UndefOr[Override[Any]] = js.undefined
    
    var RadioMarkOuter: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object RadioOverrides {
    
    inline def apply(): RadioOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioOverrides]
    }
    
    extension [Self <: RadioOverrides](x: Self) {
      
      inline def setDescription(value: Override[Any]): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setInput(value: Override[Any]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setLabel(value: Override[Any]): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      inline def setRadioMarkInner(value: Override[Any]): Self = StObject.set(x, "RadioMarkInner", value.asInstanceOf[js.Any])
      
      inline def setRadioMarkInnerUndefined: Self = StObject.set(x, "RadioMarkInner", js.undefined)
      
      inline def setRadioMarkOuter(value: Override[Any]): Self = StObject.set(x, "RadioMarkOuter", value.asInstanceOf[js.Any])
      
      inline def setRadioMarkOuterUndefined: Self = StObject.set(x, "RadioMarkOuter", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait RadioProps extends StObject {
    
    /** How the radio will be displayed along with its description. Controls spacing */
    var align: js.UndefOr[Align] = js.undefined
    
    /** Focus the radio on initial render. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Check or uncheck the control. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Label of radio. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Indicates if this radio children contain an interactive element (prevents the label from moving focus from the child element to the radio button) */
    var containsInteractiveElement: js.UndefOr[Boolean] = js.undefined
    
    /** Add more detail about a radio element. */
    var description: js.UndefOr[String] = js.undefined
    
    /** Disable the checkbox from being changed. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Renders checkbox in errored state. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Used to get a ref to the input element. Useful for programmatically focusing the input */
    var inputRef: js.UndefOr[RefObject[HTMLInputElement]] = js.undefined
    
    /** Is parent RadioGroup focused by keyboard? */
    var isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Is radio focused / active? */
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    /** How to position the label relative to the checkbox itself. */
    var labelPlacement: js.UndefOr[top | right | bottom | left] = js.undefined
    
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
    
    var overrides: js.UndefOr[RadioOverrides] = js.undefined
    
    /** Marks the checkbox as required. */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /** Passed to the input element, typically managed by RadioGroup */
    var tabIndex: js.UndefOr[String] = js.undefined
    
    /** Passed to the input element value attribute */
    var value: js.UndefOr[String] = js.undefined
  }
  object RadioProps {
    
    inline def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
    
    extension [Self <: RadioProps](x: Self) {
      
      inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainsInteractiveElement(value: Boolean): Self = StObject.set(x, "containsInteractiveElement", value.asInstanceOf[js.Any])
      
      inline def setContainsInteractiveElementUndefined: Self = StObject.set(x, "containsInteractiveElement", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInputRef(value: RefObject[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisibleUndefined: Self = StObject.set(x, "isFocusVisible", js.undefined)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setLabelPlacement(value: top | right | bottom | left): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
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
      
      inline def setOverrides(value: RadioOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioState extends StObject {
    
    var isActive: Boolean
    
    var isHovered: Boolean
  }
  object RadioState {
    
    inline def apply(isActive: Boolean, isHovered: Boolean): RadioState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioState]
    }
    
    extension [Self <: RadioState](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type StateReducer = js.Function4[
    /* stateType */ String, 
    /* nextState */ State, 
    /* currentState */ State, 
    /* event */ ChangeEvent[HTMLInputElement], 
    State
  ]
  
  trait StatefulContainerProps extends StObject {
    
    /** Set to be focused (active) on selected\checked radio. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Should return `RadioGroup` instance with standard or customized inner elements. */
    var children: js.UndefOr[js.Function1[/* props */ RadioGroupProps, ReactNode]] = js.undefined
    
    /** Initial state populated into the component */
    var initialState: js.UndefOr[State] = js.undefined
    
    /** Handler for change events on trigger element. */
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var overrides: js.UndefOr[RadioGroupOverrides] = js.undefined
    
    /** Reducer function to manipulate internal state updates. */
    var stateReducer: StateReducer
  }
  object StatefulContainerProps {
    
    inline def apply(
      stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ ChangeEvent[HTMLInputElement]) => State
    ): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(stateReducer = js.Any.fromFunction4(stateReducer))
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: /* props */ RadioGroupProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: RadioGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ ChangeEvent[HTMLInputElement]) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction4(value))
    }
  }
  
  trait StatefulRadioGroupProps extends StObject {
    
    /** Set to be focused (active) on selected\checked radio. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** A list of `Radio` components. */
    var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    /** Initial state populated into the component */
    var initialState: js.UndefOr[State] = js.undefined
    
    /** Handler for change events on trigger element. */
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var overrides: js.UndefOr[RadioGroupOverrides] = js.undefined
  }
  object StatefulRadioGroupProps {
    
    inline def apply(): StatefulRadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulRadioGroupProps]
    }
    
    extension [Self <: StatefulRadioGroupProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: RadioGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait StatelessState extends StObject {
    
    var focusedRadioIndex: Double
    
    var isFocusVisible: Boolean
  }
  object StatelessState {
    
    inline def apply(focusedRadioIndex: Double, isFocusVisible: Boolean): StatelessState = {
      val __obj = js.Dynamic.literal(focusedRadioIndex = focusedRadioIndex.asInstanceOf[js.Any], isFocusVisible = isFocusVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatelessState]
    }
    
    extension [Self <: StatelessState](x: Self) {
      
      inline def setFocusedRadioIndex(value: Double): Self = StObject.set(x, "focusedRadioIndex", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleProps extends StObject {
    
    @JSName("$align")
    var $align: js.UndefOr[String] = js.undefined
    
    @JSName("$checked")
    var $checked: Boolean
    
    @JSName("$disabled")
    var $disabled: Boolean
    
    @JSName("$error")
    var $error: Boolean
    
    @JSName("$hasDescription")
    var $hasDescription: Boolean
    
    @JSName("$isActive")
    var $isActive: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isFocused")
    var $isFocused: Boolean
    
    @JSName("$isHovered")
    var $isHovered: Boolean
    
    @JSName("$labelPlacement")
    var $labelPlacement: LabelPlacement
    
    @JSName("$required")
    var $required: Boolean
    
    @JSName("$value")
    var $value: String
  }
  object StyleProps {
    
    inline def apply(
      $checked: Boolean,
      $disabled: Boolean,
      $error: Boolean,
      $hasDescription: Boolean,
      $isActive: Boolean,
      $isFocusVisible: Boolean,
      $isFocused: Boolean,
      $isHovered: Boolean,
      $labelPlacement: LabelPlacement,
      $required: Boolean,
      $value: String
    ): StyleProps = {
      val __obj = js.Dynamic.literal($checked = $checked.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $hasDescription = $hasDescription.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $isHovered = $isHovered.asInstanceOf[js.Any], $labelPlacement = $labelPlacement.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleProps]
    }
    
    extension [Self <: StyleProps](x: Self) {
      
      inline def set$align(value: String): Self = StObject.set(x, "$align", value.asInstanceOf[js.Any])
      
      inline def set$alignUndefined: Self = StObject.set(x, "$align", js.undefined)
      
      inline def set$checked(value: Boolean): Self = StObject.set(x, "$checked", value.asInstanceOf[js.Any])
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
      
      inline def set$hasDescription(value: Boolean): Self = StObject.set(x, "$hasDescription", value.asInstanceOf[js.Any])
      
      inline def set$isActive(value: Boolean): Self = StObject.set(x, "$isActive", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
      
      inline def set$isHovered(value: Boolean): Self = StObject.set(x, "$isHovered", value.asInstanceOf[js.Any])
      
      inline def set$labelPlacement(value: LabelPlacement): Self = StObject.set(x, "$labelPlacement", value.asInstanceOf[js.Any])
      
      inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
      
      inline def set$value(value: String): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
    }
  }
}
