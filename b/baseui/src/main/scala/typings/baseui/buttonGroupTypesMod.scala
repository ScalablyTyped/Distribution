package typings.baseui

import typings.baseui.anon.`0`
import typings.baseui.anon.onClickClickHandlerselect
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.checkbox
import typings.baseui.baseuiStrings.circle
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.pill
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.radio
import typings.baseui.baseuiStrings.round_
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.square
import typings.baseui.baseuiStrings.tertiary
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupTypesMod {
  
  trait ButtonGroupOverrides extends StObject {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object ButtonGroupOverrides {
    
    inline def apply(): ButtonGroupOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonGroupOverrides] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ButtonGroupProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** Accessible label. */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /** Set of more than one `Button` components */
    var children: js.Array[ReactNode]
    
    /** Defines if the button group is disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the `kind` of the buttons in the group */
    var kind: js.UndefOr[primary | secondary | tertiary] = js.undefined
    
    /**
      * Use the `mode` prop to render toggleable Buttons:
      * the value `radio` will cause Buttons to behave like radio buttons,
      * the value `checkbox` will cause Buttons to behave like checkboxes.
      */
    var mode: js.UndefOr[radio | checkbox] = js.undefined
    
    /**
      * Called with click events from children. If a child button has its
      * own click handler, the local handler will be called first, then
      * this handler will trigger.
      */
    var onClick: js.UndefOr[ClickHandler] = js.undefined
    
    var overrides: js.UndefOr[ButtonGroupOverrides] = js.undefined
    
    /**
      * Index or array of indices of the selected Button(s).
      * Primarily for use with controlled components with a `mode` prop defined.
      */
    var selected: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /** Defines the shape of the buttons in the button group. */
    var shape: js.UndefOr[pill | default_ | square | round_ | circle] = js.undefined
    
    /** Defines the size of the buttons in the button group. */
    var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
  }
  object ButtonGroupProps {
    
    inline def apply(children: js.Array[ReactNode]): ButtonGroupProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKind(value: primary | secondary | tertiary): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMode(value: radio | checkbox): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnClick(value: (/* event */ SyntheticEvent[HTMLButtonElement, Event], /* index */ Double) => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverrides(value: ButtonGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSelected(value: Double | js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setShape(value: pill | default_ | square | round_ | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type ClickHandler = js.Function2[/* event */ SyntheticEvent[HTMLButtonElement, Event], /* index */ Double, Any]
  
  trait State extends StObject {
    
    var selected: js.Array[Double]
  }
  object State {
    
    inline def apply(selected: js.Array[Double]): State = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setSelected(value: js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value*))
    }
  }
  
  type StateReducer = js.Function3[change_, /* nextState */ State, /* currentState */ State, State]
  
  /* Inlined std.Omit<{  initialState :{  selected :number | std.Array<number>} | undefined,   stateReducer :baseui.baseui/button-group/types.StateReducer | undefined} & baseui.baseui/button-group/types.ButtonGroupProps, 'selected'> */
  trait StatefulButtonGroupProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var children: js.Array[ReactNode]
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialState: js.UndefOr[`0`] = js.undefined
    
    var kind: js.UndefOr[primary | secondary | tertiary] = js.undefined
    
    var mode: js.UndefOr[radio | checkbox] = js.undefined
    
    var onClick: js.UndefOr[ClickHandler] = js.undefined
    
    var overrides: js.UndefOr[ButtonGroupOverrides] = js.undefined
    
    var shape: js.UndefOr[pill | default_ | square | round_ | circle] = js.undefined
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulButtonGroupProps {
    
    inline def apply(children: js.Array[ReactNode]): StatefulButtonGroupProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulButtonGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulButtonGroupProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialState(value: `0`): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setKind(value: primary | secondary | tertiary): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMode(value: radio | checkbox): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnClick(value: (/* event */ SyntheticEvent[HTMLButtonElement, Event], /* index */ Double) => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverrides(value: ButtonGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setShape(value: pill | default_ | square | round_ | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  /* Inlined {children (props : {  onClick :baseui.baseui/button-group/types.ClickHandler,   selected :number | std.Array<number>} & std.Omit<baseui.baseui/button-group/types.ButtonGroupProps, 'children'>): react.react.ReactNode} & std.Omit<baseui.baseui/button-group/types.StatefulButtonGroupProps, 'children'> */
  trait StatefulContainerProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    def children(props: onClickClickHandlerselect): ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialState: js.UndefOr[`0`] = js.undefined
    
    var kind: js.UndefOr[primary | secondary | tertiary] = js.undefined
    
    var mode: js.UndefOr[radio | checkbox] = js.undefined
    
    var onClick: js.UndefOr[ClickHandler] = js.undefined
    
    var overrides: js.UndefOr[ButtonGroupOverrides] = js.undefined
    
    var shape: js.UndefOr[pill | default_ | square | round_ | circle] = js.undefined
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulContainerProps {
    
    inline def apply(children: onClickClickHandlerselect => ReactNode): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: onClickClickHandlerselect => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialState(value: `0`): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setKind(value: primary | secondary | tertiary): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMode(value: radio | checkbox): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnClick(value: (/* event */ SyntheticEvent[HTMLButtonElement, Event], /* index */ Double) => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverrides(value: ButtonGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setShape(value: pill | default_ | square | round_ | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
