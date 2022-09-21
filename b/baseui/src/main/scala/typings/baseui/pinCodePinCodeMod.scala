package typings.baseui

import typings.baseui.anon.Arialabel
import typings.baseui.anon.HasFocus
import typings.baseui.pinCodeTypesMod.PinCodeProps
import typings.baseui.pinCodeTypesMod.State
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinCodePinCodeMod {
  
  @JSImport("baseui/pin-code/pin-code", JSImport.Default)
  @js.native
  open class default () extends PinCode
  /* static members */
  object default {
    
    @JSImport("baseui/pin-code/pin-code", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pin-code/pin-code", "default.defaultProps")
    @js.native
    def defaultProps: Arialabel = js.native
    inline def defaultProps_=(x: Arialabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PinCode extends Component[PinCodeProps, State, Any] {
    
    var _inputRefs: typings.reactMultiRef.mod.default[Double, HTMLInputElement] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPinCode(): Unit = js.native
    
    def getMaskStyle(i: Double): String = js.native
    
    @JSName("state")
    var state_PinCode: HasFocus = js.native
  }
}
