package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  object default {
    
    @JSImport("baseui/accordion/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/accordion/locale", "default.collapse")
    @js.native
    def collapse: String = js.native
    inline def collapse_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapse")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/accordion/locale", "default.expand")
    @js.native
    def expand: String = js.native
    inline def expand_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
  }
  
  trait AccordionLocale extends StObject {
    
    var collapse: String
    
    var expand: String
  }
  object AccordionLocale {
    
    inline def apply(collapse: String, expand: String): AccordionLocale = {
      val __obj = js.Dynamic.literal(collapse = collapse.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionLocale]
    }
    
    extension [Self <: AccordionLocale](x: Self) {
      
      inline def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    }
  }
}
