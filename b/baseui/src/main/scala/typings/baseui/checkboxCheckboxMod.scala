package typings.baseui

import typings.baseui.anon.IsActive
import typings.baseui.checkboxTypesMod.CheckboxProps
import typings.baseui.checkboxTypesMod.CheckboxState
import typings.baseui.checkboxTypesMod.DefaultProps
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxMod {
  
  @JSImport("baseui/checkbox/checkbox", JSImport.Default)
  @js.native
  open class default () extends StatelessCheckbox
  object default {
    
    @JSImport("baseui/checkbox/checkbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/checkbox/checkbox", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatelessCheckbox extends Component[CheckboxProps, CheckboxState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MStatelessCheckbox(): Unit = js.native
    
    def onBlur(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onFocus(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseDown(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseEnter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseLeave(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseUp(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    @JSName("state")
    var state_StatelessCheckbox: IsActive = js.native
  }
}
