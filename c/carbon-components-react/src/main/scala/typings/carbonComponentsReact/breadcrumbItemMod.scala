package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.LiHTMLAttributes
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb/BreadcrumbItem", JSImport.Default)
  @js.native
  val default: FC[BreadcrumbItemProps] = js.native
  
  trait BreadcrumbItemProps
    extends StObject
       with LiHTMLAttributes[HTMLLIElement] {
    
    var href: js.UndefOr[String] = js.undefined
    
    var isCurrentPage: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbItemProps {
    
    inline def apply(): BreadcrumbItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemProps]
    }
    
    extension [Self <: BreadcrumbItemProps](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setIsCurrentPage(value: Boolean): Self = StObject.set(x, "isCurrentPage", value.asInstanceOf[js.Any])
      
      inline def setIsCurrentPageUndefined: Self = StObject.set(x, "isCurrentPage", js.undefined)
    }
  }
  
  type _To = FC[BreadcrumbItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbItemMod.foo` */
  override def _to: FC[BreadcrumbItemProps] = default
}
