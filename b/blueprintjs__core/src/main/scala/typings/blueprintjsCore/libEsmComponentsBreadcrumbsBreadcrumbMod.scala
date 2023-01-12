package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonPropsMod.IActionProps
import typings.blueprintjsCore.libEsmCommonPropsMod.ILinkProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsBreadcrumbsBreadcrumbMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumb", "Breadcrumb")
  @js.native
  val Breadcrumb: FC[BreadcrumbProps] = js.native
  
  type BreadcrumbProps = IBreadcrumbProps
  
  trait IBreadcrumbProps
    extends StObject
       with IActionProps
       with ILinkProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Whether this breadcrumb is the current breadcrumb. */
    var current: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass through value to icon's title attribute. Should be used for breadcrumbs without
      * text or children defined.
      */
    var iconTitle: js.UndefOr[String] = js.undefined
  }
  object IBreadcrumbProps {
    
    inline def apply(): IBreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBreadcrumbProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBreadcrumbProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setIconTitle(value: String): Self = StObject.set(x, "iconTitle", value.asInstanceOf[js.Any])
      
      inline def setIconTitleUndefined: Self = StObject.set(x, "iconTitle", js.undefined)
    }
  }
}
