package typings.baseui

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.inputMod.BaseInputProps
import typings.baseui.inputMod.State
import typings.baseui.inputMod.StatefulContainerProps
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.HTMLTextAreaElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaMod {
  
  trait ADJOINED extends StObject {
    
    var both: typings.baseui.baseuiStrings.both
    
    var left: typings.baseui.baseuiStrings.left
    
    var none: typings.baseui.baseuiStrings.none
    
    var right: typings.baseui.baseuiStrings.right
  }
  object ADJOINED {
    
    @JSImport("baseui/textarea", "ADJOINED")
    @js.native
    val ^ : ADJOINED = js.native
    
    extension [Self <: ADJOINED](x: Self) {
      
      inline def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait SIZE extends StObject {
    
    var default: default_
    
    var compact: typings.baseui.baseuiStrings.compact
    
    var large: large_
  }
  object SIZE {
    
    @JSImport("baseui/textarea", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    extension [Self <: SIZE](x: Self) {
      
      inline def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/textarea", "STATE_CHANGE_TYPE")
  @js.native
  val STATE_CHANGE_TYPE: typings.baseui.inputMod.STATE_CHANGE_TYPE = js.native
  
  @JSImport("baseui/textarea", "StatefulContainer")
  @js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  
  @JSImport("baseui/textarea", "StatefulTextarea")
  @js.native
  val StatefulTextarea: FC[StatefulTextareaProps] = js.native
  
  @JSImport("baseui/textarea", "StyledTextarea")
  @js.native
  val StyledTextarea: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/textarea", "StyledTextareaContainer")
  @js.native
  val StyledTextareaContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/textarea", "Textarea")
  @js.native
  class Textarea protected ()
    extends Component[TextareaProps, js.Object, js.Any] {
    def this(props: TextareaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextareaProps, context: js.Any) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.baseui.inputMod.StatefulContainerProps because var conflicts: onChange. Inlined children, initialState, stateReducer */ trait StatefulTextareaProps
    extends StObject
       with TextareaProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.undefined
  }
  object StatefulTextareaProps {
    
    inline def apply(): StatefulTextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulTextareaProps]
    }
    
    extension [Self <: StatefulTextareaProps](x: Self) {
      
      inline def setChildren(value: scala.Nothing | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait TextareaProps
    extends StObject
       with BaseInputProps[HTMLTextAreaElement]
  object TextareaProps {
    
    inline def apply(): TextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextareaProps]
    }
  }
}
