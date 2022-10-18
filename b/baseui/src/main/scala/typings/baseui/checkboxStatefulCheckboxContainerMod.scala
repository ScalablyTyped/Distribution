package typings.baseui

import typings.baseui.checkboxTypesMod.CheckboxReducerState
import typings.baseui.checkboxTypesMod.DefaultStatefulProps
import typings.baseui.checkboxTypesMod.StatefulContainerProps
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxStatefulCheckboxContainerMod {
  
  @JSImport("baseui/checkbox/stateful-checkbox-container", JSImport.Default)
  @js.native
  open class default protected () extends StatefulCheckboxContainer {
    def this(props: StatefulContainerProps) = this()
  }
  object default {
    
    @JSImport("baseui/checkbox/stateful-checkbox-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/checkbox/stateful-checkbox-container", "default.defaultProps")
    @js.native
    def defaultProps: DefaultStatefulProps = js.native
    inline def defaultProps_=(x: DefaultStatefulProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulCheckboxContainer extends Component[StatefulContainerProps, CheckboxReducerState, Any] {
    
    def onBlur(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onFocus(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseEnter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseLeave(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def stateReducer(`type`: String, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  }
}
