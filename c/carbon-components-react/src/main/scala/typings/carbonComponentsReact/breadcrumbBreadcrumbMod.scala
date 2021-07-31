package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbBreadcrumbMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb/Breadcrumb", JSImport.Default)
  @js.native
  val default: FC[BreadcrumbProps] = js.native
  
  trait BreadcrumbProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var noTrailingSlash: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbProps {
    
    @scala.inline
    def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    @scala.inline
    implicit class BreadcrumbPropsMutableBuilder[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoTrailingSlash(value: Boolean): Self = StObject.set(x, "noTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTrailingSlashUndefined: Self = StObject.set(x, "noTrailingSlash", js.undefined)
    }
  }
  
  type _To = FC[BreadcrumbProps]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbBreadcrumbMod.foo` */
  override def _to: FC[BreadcrumbProps] = default
}
