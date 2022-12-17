package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBreadcrumbBreadcrumbMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb/Breadcrumb", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLElement, BreadcrumbProps] = js.native
  
  trait BreadcrumbProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var noTrailingSlash: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbProps {
    
    inline def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    extension [Self <: BreadcrumbProps](x: Self) {
      
      inline def setNoTrailingSlash(value: Boolean): Self = StObject.set(x, "noTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setNoTrailingSlashUndefined: Self = StObject.set(x, "noTrailingSlash", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLElement, BreadcrumbProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsBreadcrumbBreadcrumbMod.foo` */
  override def _to: ForwardRefReturn[HTMLElement, BreadcrumbProps] = default
}
