package typings.baseui

import typings.baseui.anon.EventItem
import typings.baseui.anon.ItemAny
import typings.baseui.baseuiStrings.change_
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavigationMod {
  
  @JSImport("baseui/side-navigation", "NavItem")
  @js.native
  class NavItem protected ()
    extends Component[NavItemProps, js.Object, js.Any] {
    def this(props: NavItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavItemProps, context: js.Any) = this()
    
    def handleClick(event: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
    
    def handleKeyDown(event: KeyboardEvent[Element]): Unit = js.native
  }
  
  @JSImport("baseui/side-navigation", "Navigation")
  @js.native
  class Navigation protected ()
    extends Component[NavigationProps, js.Object, js.Any] {
    def this(props: NavigationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationProps, context: js.Any) = this()
    
    def activePredicate(item: Item): Boolean = js.native
  }
  
  @js.native
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_ = js.native
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/side-navigation", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/side-navigation", "StyledNavItem")
  @js.native
  val StyledNavItem: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/side-navigation", "StyledNavItemContainer")
  @js.native
  val StyledNavItemContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/side-navigation", "StyledNavLink")
  @js.native
  val StyledNavLink: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/side-navigation", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/side-navigation", "StyledSubNavContainer")
  @js.native
  val StyledSubNavContainer: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait Item extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var itemId: js.UndefOr[String] = js.native
    
    var subNav: js.UndefOr[js.Array[Item]] = js.native
    
    var title: ReactNode = js.native
  }
  object Item {
    
    @scala.inline
    def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setSubNav(value: js.Array[Item]): Self = StObject.set(x, "subNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubNavUndefined: Self = StObject.set(x, "subNav", js.undefined)
      
      @scala.inline
      def setSubNavVarargs(value: Item*): Self = StObject.set(x, "subNav", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait NavItemOverrides extends StObject {
    
    var NavItem: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var NavLink: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object NavItemOverrides {
    
    @scala.inline
    def apply(): NavItemOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavItemOverrides]
    }
    
    @scala.inline
    implicit class NavItemOverridesMutableBuilder[Self <: NavItemOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNavItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "NavItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavItemUndefined: Self = StObject.set(x, "NavItem", js.undefined)
      
      @scala.inline
      def setNavLink(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "NavLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavLinkUndefined: Self = StObject.set(x, "NavLink", js.undefined)
    }
  }
  
  @js.native
  trait NavItemProps extends StObject {
    
    @JSName("$active")
    var $active: js.UndefOr[Boolean] = js.native
    
    @JSName("$level")
    var $level: js.UndefOr[Double] = js.native
    
    @JSName("$selectable")
    var $selectable: js.UndefOr[Boolean] = js.native
    
    var item: Item = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* args */ ItemAny, _]] = js.native
    
    var overrides: js.UndefOr[NavItemOverrides] = js.native
  }
  object NavItemProps {
    
    @scala.inline
    def apply(item: Item): NavItemProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemProps]
    }
    
    @scala.inline
    implicit class NavItemPropsMutableBuilder[Self <: NavItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$activeUndefined: Self = StObject.set(x, "$active", js.undefined)
      
      @scala.inline
      def set$level(value: Double): Self = StObject.set(x, "$level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$levelUndefined: Self = StObject.set(x, "$level", js.undefined)
      
      @scala.inline
      def set$selectable(value: Boolean): Self = StObject.set(x, "$selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$selectableUndefined: Self = StObject.set(x, "$selectable", js.undefined)
      
      @scala.inline
      def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: /* args */ ItemAny => _): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOverrides(value: NavItemOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait NavigationOverrides extends StObject {
    
    var NavItem: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var NavItemContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var NavLink: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var SubNavContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object NavigationOverrides {
    
    @scala.inline
    def apply(): NavigationOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOverrides]
    }
    
    @scala.inline
    implicit class NavigationOverridesMutableBuilder[Self <: NavigationOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNavItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "NavItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavItemContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "NavItemContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavItemContainerUndefined: Self = StObject.set(x, "NavItemContainer", js.undefined)
      
      @scala.inline
      def setNavItemUndefined: Self = StObject.set(x, "NavItem", js.undefined)
      
      @scala.inline
      def setNavLink(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "NavLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavLinkUndefined: Self = StObject.set(x, "NavLink", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setSubNavContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SubNavContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubNavContainerUndefined: Self = StObject.set(x, "SubNavContainer", js.undefined)
    }
  }
  
  @js.native
  trait NavigationProps extends StObject {
    
    var activeItemId: String = js.native
    
    var activePredicate: js.UndefOr[js.Function2[/* item */ js.Any, /* activeItemId */ String, Boolean]] = js.native
    
    var items: js.UndefOr[js.Array[Item]] = js.native
    
    var mapItem: js.UndefOr[js.Function1[/* item */ Item, Item]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ EventItem, _]] = js.native
    
    var overrides: js.UndefOr[NavigationOverrides] = js.native
  }
  object NavigationProps {
    
    @scala.inline
    def apply(activeItemId: String): NavigationProps = {
      val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationProps]
    }
    
    @scala.inline
    implicit class NavigationPropsMutableBuilder[Self <: NavigationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItemId(value: String): Self = StObject.set(x, "activeItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePredicate(value: (/* item */ js.Any, /* activeItemId */ String) => Boolean): Self = StObject.set(x, "activePredicate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActivePredicateUndefined: Self = StObject.set(x, "activePredicate", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMapItem(value: /* item */ Item => Item): Self = StObject.set(x, "mapItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapItemUndefined: Self = StObject.set(x, "mapItem", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ EventItem => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: NavigationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
}
