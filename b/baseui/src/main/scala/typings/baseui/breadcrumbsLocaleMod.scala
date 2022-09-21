package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsLocaleMod {
  
  object default {
    
    @JSImport("baseui/breadcrumbs/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/breadcrumbs/locale", "default.ariaLabel")
    @js.native
    def ariaLabel: String = js.native
    inline def ariaLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
  }
  
  trait BreadcrumbLocale extends StObject {
    
    var ariaLabel: String
  }
  object BreadcrumbLocale {
    
    inline def apply(ariaLabel: String): BreadcrumbLocale = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbLocale]
    }
    
    extension [Self <: BreadcrumbLocale](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    }
  }
}
