package typings.baseui

import typings.baseui.inputTypesMod.MaskedInputProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMaskedInputMod {
  
  object default {
    
    inline def apply(param0: MaskedInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/input/masked-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/input/masked-input", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/input/masked-input", "default.defaultProps.maskChar")
      @js.native
      def maskChar: String = js.native
      inline def maskChar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(x.asInstanceOf[js.Any])
    }
  }
}
