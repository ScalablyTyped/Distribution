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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("baseui/button-group", "ButtonGroup")
  @js.native
  val ButtonGroup: FC[ButtonGroupProps] = js.native
  
  @js.native
  trait MODE extends StObject {
    
    var checkbox: typings.baseui.baseuiStrings.checkbox = js.native
    
    var radio: typings.baseui.baseuiStrings.radio = js.native
  }
  object MODE {
    
    @JSImport("baseui/button-group", "MODE")
    @js.native
    val ^ : MODE = js.native
    
    @scala.inline
    implicit class MODEMutableBuilder[Self <: MODE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckbox(value: checkbox): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadio(value: radio): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/button-group", "SHAPE")
  @js.native
  val SHAPE: typings.baseui.buttonMod.SHAPE = js.native
  
  @JSImport("baseui/button-group", "SIZE")
  @js.native
  val SIZE: typings.baseui.buttonMod.SIZE = js.native
  
  @js.native
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_ = js.native
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/button-group", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait ButtonGroupOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object ButtonGroupOverrides {
    
    @scala.inline
    def apply(): ButtonGroupOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupOverrides]
    }
    
    @scala.inline
    implicit class ButtonGroupOverridesMutableBuilder[Self <: ButtonGroupOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  @js.native
  trait ButtonGroupProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.native
    
    var children: ReactNode = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.native
    
    var mode: js.UndefOr[checkbox | radio] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* index */ Double, _]
      ] = js.native
    
    var overrides: js.UndefOr[ButtonGroupOverrides] = js.native
    
    var selected: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var shape: js.UndefOr[pill | default_ | square | round | circle] = js.native
    
    var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
  }
  object ButtonGroupProps {
    
    @scala.inline
    def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    @scala.inline
    implicit class ButtonGroupPropsMutableBuilder[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKind(value: primary | secondary | tertiary | minimal): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMode(value: checkbox | radio): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* index */ Double) => _): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverrides(value: ButtonGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSelected(value: Double | js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      @scala.inline
      def setShape(value: pill | default_ | square | round | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: compact | default_ | large_ | mini): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait InitialState extends StObject {
    
    var selected: Double | js.Array[Double] = js.native
  }
  object InitialState {
    
    @scala.inline
    def apply(selected: Double | js.Array[Double]): InitialState = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialState]
    }
    
    @scala.inline
    implicit class InitialStateMutableBuilder[Self <: InitialState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Double | js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value :_*))
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var selected: js.Array[Double] = js.native
  }
  object State {
    
    @scala.inline
    def apply(selected: js.Array[Double]): State = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StatefulButtonGroupProps extends ButtonGroupProps {
    
    var initialState: js.UndefOr[InitialState] = js.native
    
    var stateReducer: js.UndefOr[
        js.Function3[
          /* stateType */ STATE_CHANGE_TYPE, 
          /* nextState */ State, 
          /* currentState */ State, 
          State
        ]
      ] = js.native
  }
  object StatefulButtonGroupProps {
    
    @scala.inline
    def apply(): StatefulButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulButtonGroupProps]
    }
    
    @scala.inline
    implicit class StatefulButtonGroupPropsMutableBuilder[Self <: StatefulButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setStateReducer(
        value: (/* stateType */ STATE_CHANGE_TYPE, /* nextState */ State, /* currentState */ State) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
