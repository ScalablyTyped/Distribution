package typings.baseui

import typings.baseui.anon.EventItem
import typings.baseui.baseuiStrings.change_
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavigationTypesMod {
  
  trait Exclude extends StObject {
    
    def children(a: NavigationProps): ReactNode
  }
  object Exclude {
    
    inline def apply(children: NavigationProps => ReactNode): Exclude = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Exclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: NavigationProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait Item extends StObject {
    
    /** Renders the item in disabled state */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      Identifier for the navigation item.
      Can be a path value or an action name.
      It's also used in the default `activePredicate` to
      identify a currently active item
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** A list of sub-navigation items */
    var subNav: js.UndefOr[js.Array[Item]] = js.undefined
    
    /** Navigation item's title to render */
    var title: ReactNode
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setSubNav(value: js.Array[Item]): Self = StObject.set(x, "subNav", value.asInstanceOf[js.Any])
      
      inline def setSubNavUndefined: Self = StObject.set(x, "subNav", js.undefined)
      
      inline def setSubNavVarargs(value: Item*): Self = StObject.set(x, "subNav", js.Array(value*))
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait NavItemOverrides extends StObject {
    
    var NavItem: js.UndefOr[Override[Any]] = js.undefined
    
    var NavLink: js.UndefOr[Override[Any]] = js.undefined
  }
  object NavItemOverrides {
    
    inline def apply(): NavItemOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavItemOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavItemOverrides] (val x: Self) extends AnyVal {
      
      inline def setNavItem(value: Override[Any]): Self = StObject.set(x, "NavItem", value.asInstanceOf[js.Any])
      
      inline def setNavItemUndefined: Self = StObject.set(x, "NavItem", js.undefined)
      
      inline def setNavLink(value: Override[Any]): Self = StObject.set(x, "NavLink", value.asInstanceOf[js.Any])
      
      inline def setNavLinkUndefined: Self = StObject.set(x, "NavLink", js.undefined)
    }
  }
  
  trait NavItemProps
    extends StObject
       with SharedProps {
    
    var item: Item
    
    /** Used as a performance optimization if many nav items are rendered. Function provided to
      *  NavItem component's React.memo call.
      */
    var itemMemoizationComparator: js.UndefOr[js.Function2[/* b */ this.type, /* a */ this.type, Boolean]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* a */ EventItem, Any]] = js.undefined
    
    var overrides: NavItemOverrides
  }
  object NavItemProps {
    
    inline def apply(
      $active: Boolean,
      $disabled: Boolean,
      $level: Double,
      $selectable: Boolean,
      item: Item,
      overrides: NavItemOverrides
    ): NavItemProps = {
      val __obj = js.Dynamic.literal($active = $active.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $level = $level.asInstanceOf[js.Any], $selectable = $selectable.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavItemProps] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemMemoizationComparator(value: (NavItemProps, NavItemProps) => Boolean): Self = StObject.set(x, "itemMemoizationComparator", js.Any.fromFunction2(value))
      
      inline def setItemMemoizationComparatorUndefined: Self = StObject.set(x, "itemMemoizationComparator", js.undefined)
      
      inline def setOnSelect(value: /* a */ EventItem => Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOverrides(value: NavItemOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationOverrides extends StObject {
    
    var NavItem: js.UndefOr[Override[Any]] = js.undefined
    
    var NavItemContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var NavLink: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var SubNavContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object NavigationOverrides {
    
    inline def apply(): NavigationOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationOverrides] (val x: Self) extends AnyVal {
      
      inline def setNavItem(value: Override[Any]): Self = StObject.set(x, "NavItem", value.asInstanceOf[js.Any])
      
      inline def setNavItemContainer(value: Override[Any]): Self = StObject.set(x, "NavItemContainer", value.asInstanceOf[js.Any])
      
      inline def setNavItemContainerUndefined: Self = StObject.set(x, "NavItemContainer", js.undefined)
      
      inline def setNavItemUndefined: Self = StObject.set(x, "NavItem", js.undefined)
      
      inline def setNavLink(value: Override[Any]): Self = StObject.set(x, "NavLink", value.asInstanceOf[js.Any])
      
      inline def setNavLinkUndefined: Self = StObject.set(x, "NavLink", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSubNavContainer(value: Override[Any]): Self = StObject.set(x, "SubNavContainer", value.asInstanceOf[js.Any])
      
      inline def setSubNavContainerUndefined: Self = StObject.set(x, "SubNavContainer", js.undefined)
    }
  }
  
  trait NavigationProps extends StObject {
    
    /** Defines the current active itemId. Used for the default calculation of the $active prop */
    var activeItemId: String
    
    /**
      Is called on the nav item render to test if the item is currently selected.
      If returns true the item will be rendered as an active one
      */
    var activePredicate: js.UndefOr[(js.Function2[/* item */ Item, /* activeItemId */ String, Boolean]) | Null] = js.undefined
    
    /** Used as a performance optimization if many nav items are rendered. Function provided to
      *  NavItem component's React.memo call.
      */
    var itemMemoizationComparator: js.UndefOr[js.Function2[/* b */ NavItemProps, /* a */ NavItemProps, Boolean]] = js.undefined
    
    /** List of navigation items */
    var items: js.Array[Item]
    
    /** Optional transform function that is called for each Item */
    var mapItem: js.UndefOr[(js.Function1[/* item */ Item, Item]) | Null] = js.undefined
    
    /** onChange handler that is called when a nav item is selected */
    var onChange: js.UndefOr[js.Function1[/* a */ EventItem, Any]] = js.undefined
    
    /** Overrides for the internal elements and components */
    var overrides: js.UndefOr[NavigationOverrides] = js.undefined
  }
  object NavigationProps {
    
    inline def apply(activeItemId: String, items: js.Array[Item]): NavigationProps = {
      val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationProps] (val x: Self) extends AnyVal {
      
      inline def setActiveItemId(value: String): Self = StObject.set(x, "activeItemId", value.asInstanceOf[js.Any])
      
      inline def setActivePredicate(value: (/* item */ Item, /* activeItemId */ String) => Boolean): Self = StObject.set(x, "activePredicate", js.Any.fromFunction2(value))
      
      inline def setActivePredicateNull: Self = StObject.set(x, "activePredicate", null)
      
      inline def setActivePredicateUndefined: Self = StObject.set(x, "activePredicate", js.undefined)
      
      inline def setItemMemoizationComparator(value: (/* b */ NavItemProps, /* a */ NavItemProps) => Boolean): Self = StObject.set(x, "itemMemoizationComparator", js.Any.fromFunction2(value))
      
      inline def setItemMemoizationComparatorUndefined: Self = StObject.set(x, "itemMemoizationComparator", js.undefined)
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMapItem(value: /* item */ Item => Item): Self = StObject.set(x, "mapItem", js.Any.fromFunction1(value))
      
      inline def setMapItemNull: Self = StObject.set(x, "mapItem", null)
      
      inline def setMapItemUndefined: Self = StObject.set(x, "mapItem", js.undefined)
      
      inline def setOnChange(value: /* a */ EventItem => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: NavigationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait SharedProps extends StObject {
    
    /** Defines if the nav item is currently selected */
    @JSName("$active")
    var $active: Boolean
    
    /** Defines if the nav item is disabled */
    @JSName("$disabled")
    var $disabled: Boolean
    
    /** Defines the nesting level of the rendered nav item */
    @JSName("$level")
    var $level: Double
    
    /** Defines if the nav item is selectable/clickable */
    @JSName("$selectable")
    var $selectable: Boolean
  }
  object SharedProps {
    
    inline def apply($active: Boolean, $disabled: Boolean, $level: Double, $selectable: Boolean): SharedProps = {
      val __obj = js.Dynamic.literal($active = $active.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $level = $level.asInstanceOf[js.Any], $selectable = $selectable.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedProps] (val x: Self) extends AnyVal {
      
      inline def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$level(value: Double): Self = StObject.set(x, "$level", value.asInstanceOf[js.Any])
      
      inline def set$selectable(value: Boolean): Self = StObject.set(x, "$selectable", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var activeItemId: js.UndefOr[String] = js.undefined
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setActiveItemId(value: String): Self = StObject.set(x, "activeItemId", value.asInstanceOf[js.Any])
      
      inline def setActiveItemIdUndefined: Self = StObject.set(x, "activeItemId", js.undefined)
    }
  }
  
  type StateReducer = js.Function3[/* stateType */ StateType, /* nextState */ State, /* currentState */ State, State]
  
  type StateType = change_
  
  trait StatefulContainerProps extends StObject {
    
    def children(a: NavigationProps): ReactNode
    
    /** Initial state of an uncontrolled component. */
    var initialState: js.UndefOr[State] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* a */ EventItem, Any]] = js.undefined
    
    /** A state change handler. Used to override default state transitions. */
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulContainerProps {
    
    inline def apply(children: NavigationProps => ReactNode): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: NavigationProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* a */ EventItem => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  /* Inlined std.Omit<baseui.baseui/side-navigation/types.StatefulContainerProps, keyof baseui.baseui/side-navigation/types.Exclude> */
  trait StatefulNavProps extends StObject {
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* a */ EventItem, Any]] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulNavProps {
    
    inline def apply(): StatefulNavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulNavProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulNavProps] (val x: Self) extends AnyVal {
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* a */ EventItem => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStateReducer(value: (/* stateType */ StateType, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
