package typings.baseui

import typings.baseui.anon.InitialState
import typings.baseui.buttonGroupTypesMod.State
import typings.baseui.buttonGroupTypesMod.StatefulContainerProps
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupStatefulContainerMod {
  
  @JSImport("baseui/button-group/stateful-container", JSImport.Default)
  @js.native
  open class default protected () extends StatefulContainer {
    def this(props: StatefulContainerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/button-group/stateful-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group/stateful-container", "default.defaultProps")
    @js.native
    def defaultProps: InitialState = js.native
    inline def defaultProps_=(x: InitialState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulContainer extends Component[StatefulContainerProps, State, Any] {
    
    def changeState(nextState: State): Unit = js.native
    
    def onClick(event: SyntheticEvent[HTMLButtonElement, Event], index: Double): Unit = js.native
  }
}
