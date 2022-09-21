package typings.baseui

import typings.baseui.radioTypesMod.DefaultStatefulProps
import typings.baseui.radioTypesMod.State
import typings.baseui.radioTypesMod.StatefulContainerProps
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statefulRadiogroupContainerMod {
  
  @JSImport("baseui/radio/stateful-radiogroup-container", JSImport.Default)
  @js.native
  open class default protected () extends StatefulRadioGroupContainer {
    def this(props: StatefulContainerProps) = this()
  }
  object default {
    
    @JSImport("baseui/radio/stateful-radiogroup-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/radio/stateful-radiogroup-container", "default.defaultProps")
    @js.native
    def defaultProps: DefaultStatefulProps = js.native
    inline def defaultProps_=(x: DefaultStatefulProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulRadioGroupContainer extends Component[StatefulContainerProps, State, Any] {
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def stateReducer(`type`: String, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  }
}
