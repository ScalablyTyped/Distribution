package typings.baseui

import typings.baseui.anon.OnCountryChange
import typings.baseui.anon.PartialState
import typings.baseui.phoneInputTypesMod.State
import typings.baseui.phoneInputTypesMod.StateChange
import typings.baseui.phoneInputTypesMod.StatefulPhoneInputContainerProps
import typings.baseui.selectTypesMod.OnChangeParams
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statefulPhoneInputContainerMod {
  
  @JSImport("baseui/phone-input/stateful-phone-input-container", JSImport.Default)
  @js.native
  open class default () extends StatefulPhoneInputContainer
  /* static members */
  object default {
    
    @JSImport("baseui/phone-input/stateful-phone-input-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/phone-input/stateful-phone-input-container", "default.defaultProps")
    @js.native
    def defaultProps: OnCountryChange = js.native
    inline def defaultProps_=(x: OnCountryChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulPhoneInputContainer extends Component[StatefulPhoneInputContainerProps, State, Any] {
    
    def internalSetState(`type`: StateChange, nextState: PartialState): Unit = js.native
    
    def onCountryChange(event: OnChangeParams): Unit = js.native
    
    def onTextChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
  }
}
