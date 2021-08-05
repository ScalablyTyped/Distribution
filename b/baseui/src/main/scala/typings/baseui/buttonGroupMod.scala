package typings.baseui

import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.checkbox
import typings.baseui.baseuiStrings.circle
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.minimal
import typings.baseui.baseuiStrings.pill
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.radio
import typings.baseui.baseuiStrings.round
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.square
import typings.baseui.baseuiStrings.tertiary
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("baseui/button-group", "ButtonGroup")
  @js.native
  val ButtonGroup: FC[ButtonGroupProps] = js.native
  
  trait MODE extends StObject {
    
    var checkbox: typings.baseui.baseuiStrings.checkbox
    
    var radio: typings.baseui.baseuiStrings.radio
  }
  object MODE {
    
    @JSImport("baseui/button-group", "MODE")
    @js.native
    val ^ : MODE = js.native
    
    extension [Self <: MODE](x: Self) {
      
      inline def setCheckbox(value: checkbox): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setRadio(value: radio): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/button-group", "SHAPE")
  @js.native
  val SHAPE: typings.baseui.buttonMod.SHAPE = js.native
  
  @JSImport("baseui/button-group", "SIZE")
  @js.native
  val SIZE: typings.baseui.buttonMod.SIZE = js.native
  
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/button-group", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    extension [Self <: STATE_CHANGE_TYPE](x: Self) {
      
      inline def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/button-group", "StatefulButtonGroup")
  @js.native
  val StatefulButtonGroup: FC[StatefulButtonGroupProps] = js.native
  
  @JSImport("baseui/button-group", "StatefulContainer")
  @js.native
  class StatefulContainer protected ()
    extends Component[StatefulButtonGroupProps, State, js.Any] {
    def this(props: StatefulButtonGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatefulButtonGroupProps, context: js.Any) = this()
    
    def changeState(nextState: State): Unit = js.native
    
    def onClick(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], index: Double): Unit = js.native
  }
  
  @JSImport("baseui/button-group", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  trait ButtonGroupOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object ButtonGroupOverrides {
    
    inline def apply(): ButtonGroupOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupOverrides]
    }
    
    extension [Self <: ButtonGroupOverrides](x: Self) {
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ButtonGroupProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.undefined
    
    var mode: js.UndefOr[checkbox | radio] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
          /* index */ Double, 
          js.Any
        ]
      ] = js.undefined
    
    var overrides: js.UndefOr[ButtonGroupOverrides] = js.undefined
    
    var selected: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var shape: js.UndefOr[pill | default_ | square | round | circle] = js.undefined
    
    var size: js.UndefOr[compact | default_ | large_ | mini] = js.undefined
  }
  object ButtonGroupProps {
    
    inline def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    extension [Self <: ButtonGroupProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKind(value: primary | secondary | tertiary | minimal): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMode(value: checkbox | radio): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnClick(value: (/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* index */ Double) => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverrides(value: ButtonGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSelected(value: Double | js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      inline def setShape(value: pill | default_ | square | round | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: compact | default_ | large_ | mini): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait InitialState extends StObject {
    
    var selected: Double | js.Array[Double]
  }
  object InitialState {
    
    inline def apply(selected: Double | js.Array[Double]): InitialState = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialState]
    }
    
    extension [Self <: InitialState](x: Self) {
      
      inline def setSelected(value: Double | js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value :_*))
    }
  }
  
  trait State extends StObject {
    
    var selected: js.Array[Double]
  }
  object State {
    
    inline def apply(selected: js.Array[Double]): State = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setSelected(value: js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value :_*))
    }
  }
  
  trait StatefulButtonGroupProps
    extends StObject
       with ButtonGroupProps {
    
    var initialState: js.UndefOr[InitialState] = js.undefined
    
    var stateReducer: js.UndefOr[
        js.Function3[
          /* stateType */ STATE_CHANGE_TYPE, 
          /* nextState */ State, 
          /* currentState */ State, 
          State
        ]
      ] = js.undefined
  }
  object StatefulButtonGroupProps {
    
    inline def apply(): StatefulButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulButtonGroupProps]
    }
    
    extension [Self <: StatefulButtonGroupProps](x: Self) {
      
      inline def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateType */ STATE_CHANGE_TYPE, /* nextState */ State, /* currentState */ State) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
