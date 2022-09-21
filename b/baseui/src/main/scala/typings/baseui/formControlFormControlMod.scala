package typings.baseui

import typings.baseui.anon.Caption
import typings.baseui.formControlTypesMod.FormControlProps
import typings.baseui.formControlTypesMod.FormControlState
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlFormControlMod {
  
  @JSImport("baseui/form-control/form-control", JSImport.Default)
  @js.native
  open class default () extends FormControl
  /* static members */
  object default {
    
    @JSImport("baseui/form-control/form-control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/form-control/form-control", "default.defaultProps")
    @js.native
    def defaultProps: Caption = js.native
    inline def defaultProps_=(x: Caption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FormControl extends Component[FormControlProps, FormControlState, Any]
}
