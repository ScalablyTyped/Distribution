package typings.baseui

import typings.baseui.anon.FocusedRadioIndex
import typings.baseui.radioTypesMod.DefaultProps
import typings.baseui.radioTypesMod.RadioGroupProps
import typings.baseui.radioTypesMod.StatelessState
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadiogroupMod {
  
  @JSImport("baseui/radio/radiogroup", JSImport.Default)
  @js.native
  open class default () extends StatelessRadioGroup
  object default {
    
    @JSImport("baseui/radio/radiogroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/radio/radiogroup", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatelessRadioGroup extends Component[RadioGroupProps, StatelessState, Any] {
    
    def handleBlur(event: ChangeEvent[HTMLInputElement], index: Double): Unit = js.native
    
    def handleFocus(event: ChangeEvent[HTMLInputElement], index: Double): Unit = js.native
    
    @JSName("state")
    var state_StatelessRadioGroup: FocusedRadioIndex = js.native
  }
}
