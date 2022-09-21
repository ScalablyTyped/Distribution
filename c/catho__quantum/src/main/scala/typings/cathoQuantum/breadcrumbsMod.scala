package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeColors
import typings.cathoQuantum.anon.Label
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("@catho/quantum/Breadcrumbs", JSImport.Default)
  @js.native
  open class default ()
    extends Component[BreadcrumbsProps, js.Object, Any]
  
  type Breadcrumbs = Component[BreadcrumbsProps, js.Object, Any]
  
  trait BreadcrumbsProps extends StObject {
    
    var items: js.Array[Label]
    
    var theme: js.UndefOr[BaseFontSizeColors] = js.undefined
  }
  object BreadcrumbsProps {
    
    inline def apply(items: js.Array[Label]): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    extension [Self <: BreadcrumbsProps](x: Self) {
      
      inline def setItems(value: js.Array[Label]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Label*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTheme(value: BaseFontSizeColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
