package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerLocaleMod {
  
  object default {
    
    @JSImport("baseui/drawer/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/drawer/locale", "default.close")
    @js.native
    def close: String = js.native
    inline def close_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
  }
  
  trait DrawerLocale extends StObject {
    
    var close: String
  }
  object DrawerLocale {
    
    inline def apply(close: String): DrawerLocale = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerLocale] (val x: Self) extends AnyVal {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    }
  }
}
