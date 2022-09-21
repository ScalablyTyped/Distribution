package typings.baseui

import typings.baseui.inputTypesMod.State
import typings.baseui.inputTypesMod.StateReducer
import typings.baseui.inputTypesMod.StateType
import typings.baseui.inputTypesMod.StatefulContainerProps
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputStatefulContainerMod {
  
  @JSImport("baseui/input/stateful-container", JSImport.Default)
  @js.native
  open class default[T /* <: HTMLInputElement | HTMLTextAreaElement */] () extends StatefulContainer[T]
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/input/stateful-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Unit]
      
      @JSImport("baseui/input/stateful-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatefulContainer[T /* <: HTMLInputElement | HTMLTextAreaElement */] extends Component[StatefulContainerProps[T], State, Any] {
    
    def internalSetState(`type`: StateType, nextState: State): Unit = js.native
    
    def onChange(e: ChangeEvent[T]): Unit = js.native
  }
}
