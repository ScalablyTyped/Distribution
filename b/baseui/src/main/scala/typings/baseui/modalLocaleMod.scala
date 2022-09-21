package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalLocaleMod {
  
  object default {
    
    @JSImport("baseui/modal/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/modal/locale", "default.close")
    @js.native
    def close: String = js.native
    inline def close_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
  }
  
  trait ModalLocale extends StObject {
    
    var close: String
  }
  object ModalLocale {
    
    inline def apply(close: String): ModalLocale = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalLocale]
    }
    
    extension [Self <: ModalLocale](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    }
  }
}
