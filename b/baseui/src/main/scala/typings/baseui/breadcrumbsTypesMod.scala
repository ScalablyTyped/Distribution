package typings.baseui

import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsTypesMod {
  
  trait BreadcrumbsOverrides extends StObject {
    
    var Icon: js.UndefOr[Override[Any]] = js.undefined
    
    var List: js.UndefOr[Override[Any]] = js.undefined
    
    var ListItem: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Separator: js.UndefOr[Override[Any]] = js.undefined
  }
  object BreadcrumbsOverrides {
    
    inline def apply(): BreadcrumbsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsOverrides]
    }
    
    extension [Self <: BreadcrumbsOverrides](x: Self) {
      
      inline def setIcon(value: Override[Any]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setList(value: Override[Any]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      inline def setListItem(value: Override[Any]): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
      
      inline def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
      
      inline def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSeparator(value: Override[Any]): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "Separator", js.undefined)
    }
  }
  
  trait BreadcrumbsProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var overrides: js.UndefOr[BreadcrumbsOverrides] = js.undefined
    
    /** Whether to show a trailing separator after the last breadcrumb. */
    var showTrailingSeparator: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbsProps {
    
    inline def apply(): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    extension [Self <: BreadcrumbsProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOverrides(value: BreadcrumbsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setShowTrailingSeparator(value: Boolean): Self = StObject.set(x, "showTrailingSeparator", value.asInstanceOf[js.Any])
      
      inline def setShowTrailingSeparatorUndefined: Self = StObject.set(x, "showTrailingSeparator", js.undefined)
    }
  }
}
