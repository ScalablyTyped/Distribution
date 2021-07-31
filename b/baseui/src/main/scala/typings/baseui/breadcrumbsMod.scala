package typings.baseui

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("baseui/breadcrumbs", "Breadcrumbs")
  @js.native
  val Breadcrumbs: FC[BreadcrumbsProps] = js.native
  
  @JSImport("baseui/breadcrumbs", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/breadcrumbs", "StyledSeparator")
  @js.native
  val StyledSeparator: StyletronComponent[js.Any] = js.native
  
  trait BreadcrumbsOverrides extends StObject {
    
    var Icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var List: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var ListItem: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Separator: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object BreadcrumbsOverrides {
    
    @scala.inline
    def apply(): BreadcrumbsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsOverrides]
    }
    
    @scala.inline
    implicit class BreadcrumbsOverridesMutableBuilder[Self <: BreadcrumbsOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      @scala.inline
      def setList(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setSeparator(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "Separator", js.undefined)
    }
  }
  
  trait BreadcrumbsProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var overrides: js.UndefOr[BreadcrumbsOverrides] = js.undefined
    
    var showTrailingSeparator: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbsProps {
    
    @scala.inline
    def apply(): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    @scala.inline
    implicit class BreadcrumbsPropsMutableBuilder[Self <: BreadcrumbsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOverrides(value: BreadcrumbsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setShowTrailingSeparator(value: Boolean): Self = StObject.set(x, "showTrailingSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTrailingSeparatorUndefined: Self = StObject.set(x, "showTrailingSeparator", js.undefined)
    }
  }
}
