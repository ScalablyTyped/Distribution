package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastLocaleMod {
  
  object default {
    
    @JSImport("baseui/toast/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/toast/locale", "default.close")
    @js.native
    def close: String = js.native
    inline def close_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
  }
  
  trait ToastLocale extends StObject {
    
    var close: String
  }
  object ToastLocale {
    
    inline def apply(close: String): ToastLocale = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastLocale]
    }
    
    extension [Self <: ToastLocale](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    }
  }
}
