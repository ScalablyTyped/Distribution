package typings.baseui

import typings.baseui.baseuiStrings.CHANGE
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.toggle
import typings.baseui.baseuiStrings.toggle_round
import typings.baseui.baseuiStrings.top
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("baseui/checkbox", "Checkbox")
  @js.native
  class Checkbox protected ()
    extends Component[CheckboxProps, CheckboxState, js.Any] {
    def this(props: CheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxProps, context: js.Any) = this()
    
    def onBlur(event: FocusEvent[HTMLInputElement]): Unit = js.native
    
    def onFocus(event: FocusEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseDown(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
    
    def onMouseEnter(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
    
    def onMouseLeave(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
    
    def onMouseUp(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
  }
  
  trait LABEL_PLACEMENT extends StObject {
    
    var bottom: typings.baseui.baseuiStrings.bottom
    
    var left: typings.baseui.baseuiStrings.left
    
    var right: typings.baseui.baseuiStrings.right
    
    var top: typings.baseui.baseuiStrings.top
  }
  object LABEL_PLACEMENT {
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT")
    @js.native
    val ^ : LABEL_PLACEMENT = js.native
    
    extension [Self <: LABEL_PLACEMENT](x: Self) {
      
      inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait STATE_TYPE extends StObject {
    
    var change: CHANGE
  }
  object STATE_TYPE {
    
    @JSImport("baseui/checkbox", "STATE_TYPE")
    @js.native
    val ^ : STATE_TYPE = js.native
    
    extension [Self <: STATE_TYPE](x: Self) {
      
      inline def setChange(value: CHANGE): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  trait STYLE_TYPE extends StObject {
    
    var default: default_
    
    var toggle: typings.baseui.baseuiStrings.toggle
    
    var toggle_round: typings.baseui.baseuiStrings.toggle_round
  }
  object STYLE_TYPE {
    
    @JSImport("baseui/checkbox", "STYLE_TYPE")
    @js.native
    val ^ : STYLE_TYPE = js.native
    
    extension [Self <: STYLE_TYPE](x: Self) {
      
      inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: toggle): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggle_round(value: toggle_round): Self = StObject.set(x, "toggle_round", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/checkbox", "StatefulCheckbox")
  @js.native
  val StatefulCheckbox: FC[StatefulCheckboxProps] = js.native
  
  @JSImport("baseui/checkbox", "StatefulContainer")
  @js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledCheckmark")
  @js.native
  val StyledCheckmark: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledInput")
  @js.native
  val StyledInput: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggle")
  @js.native
  val StyledToggle: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggleInner")
  @js.native
  val StyledToggleInner: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggleTrack")
  @js.native
  val StyledToggleTrack: StyletronComponent[js.Any] = js.native
  
  trait CheckboxOverrides extends StObject {
    
    var Checkmark: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Input: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Label: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Toggle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var ToggleInner: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var ToggleTrack: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object CheckboxOverrides {
    
    inline def apply(): CheckboxOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxOverrides]
    }
    
    extension [Self <: CheckboxOverrides](x: Self) {
      
      inline def setCheckmark(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Checkmark", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkUndefined: Self = StObject.set(x, "Checkmark", js.undefined)
      
      inline def setInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setToggle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleInner(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ToggleInner", value.asInstanceOf[js.Any])
      
      inline def setToggleInnerUndefined: Self = StObject.set(x, "ToggleInner", js.undefined)
      
      inline def setToggleTrack(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ToggleTrack", value.asInstanceOf[js.Any])
      
      inline def setToggleTrackUndefined: Self = StObject.set(x, "ToggleTrack", js.undefined)
      
      inline def setToggleUndefined: Self = StObject.set(x, "Toggle", js.undefined)
    }
  }
  
  trait CheckboxProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkmarkType: js.UndefOr[default_ | toggle | toggle_round] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    var isError: js.UndefOr[Boolean] = js.undefined
    
    var isIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    var labelPlacement: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
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
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCheckmarkType(value: default_ | toggle | toggle_round): Self = StObject.set(x, "checkmarkType", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkTypeUndefined: Self = StObject.set(x, "checkmarkType", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      inline def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
      
      inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
      
      inline def setLabelPlacement(value: top | right | bottom | left): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckboxState extends StObject {
    
    var isActive: Boolean
    
    var isFocused: Boolean
    
    var isHovered: Boolean
  }
  object CheckboxState {
    
    inline def apply(isActive: Boolean, isFocused: Boolean, isHovered: Boolean): CheckboxState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxState]
    }
    
    extension [Self <: CheckboxState](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
    }
  }
  
  type StateReducer = js.Function4[
    /* stateType */ String, 
    /* nextState */ CheckboxState, 
    /* currentState */ CheckboxState, 
    /* event */ SyntheticEvent[HTMLInputElement, Event], 
    CheckboxState
  ]
  
  trait StatefulCheckboxProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var checkmarkType: js.UndefOr[default_ | toggle | toggle_round] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var initialState: js.UndefOr[typings.baseui.checkboxMod.initialState] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    var isError: js.UndefOr[Boolean] = js.undefined
    
    var isIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    var labelPlacement: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
  }
  object StatefulCheckboxProps {
    
    inline def apply(): StatefulCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulCheckboxProps]
    }
    
    extension [Self <: StatefulCheckboxProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCheckmarkType(value: default_ | toggle | toggle_round): Self = StObject.set(x, "checkmarkType", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkTypeUndefined: Self = StObject.set(x, "checkmarkType", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInitialState(value: initialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      inline def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
      
      inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
      
      inline def setLabelPlacement(value: top | right | bottom | left): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait StatefulContainerProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var initialState: js.UndefOr[CheckboxState] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulContainerProps {
    
    inline def apply(): StatefulContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: CheckboxState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateType */ String, /* nextState */ CheckboxState, /* currentState */ CheckboxState, /* event */ SyntheticEvent[HTMLInputElement, Event]) => CheckboxState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction4(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait initialState extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var isIndeterminate: js.UndefOr[Boolean] = js.undefined
  }
  object initialState {
    
    inline def apply(): initialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[initialState]
    }
    
    extension [Self <: initialState](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
    }
  }
}
