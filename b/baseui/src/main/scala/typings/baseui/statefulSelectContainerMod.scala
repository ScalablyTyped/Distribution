package typings.baseui

import typings.baseui.anon.ValueArray
import typings.baseui.anon.ValueValue
import typings.baseui.selectTypesMod.OnChangeParams
import typings.baseui.selectTypesMod.State
import typings.baseui.selectTypesMod.StateReducer
import typings.baseui.selectTypesMod.StatefulContainerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statefulSelectContainerMod {
  
  @JSImport("baseui/select/stateful-select-container", JSImport.Default)
  @js.native
  open class default () extends StatefulSelectContainer
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/select/stateful-select-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/select/stateful-select-container", "default.defaultProps.initialState")
      @js.native
      def initialState: ValueArray = js.native
      inline def initialState_=(x: ValueArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/select/stateful-select-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatefulSelectContainer extends Component[StatefulContainerProps, State, Any] {
    
    def internalSetState(params: OnChangeParams): Unit = js.native
    
    def onChange(params: OnChangeParams): Unit = js.native
    
    @JSName("state")
    var state_StatefulSelectContainer: ValueValue = js.native
  }
}
