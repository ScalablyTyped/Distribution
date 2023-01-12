package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupLocaleMod {
  
  object default {
    
    @JSImport("baseui/button-group/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group/locale", "default.ariaLabel")
    @js.native
    def ariaLabel: String = js.native
    inline def ariaLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
  }
  
  trait ButtonGroupLocale extends StObject {
    
    var ariaLabel: String
  }
  object ButtonGroupLocale {
    
    inline def apply(ariaLabel: String): ButtonGroupLocale = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonGroupLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonGroupLocale] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    }
  }
}
