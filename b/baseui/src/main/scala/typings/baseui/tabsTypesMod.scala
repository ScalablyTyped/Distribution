package typings.baseui

import typings.baseui.anon.ActiveKey
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTypesMod {
  
  type OnChangeHandler = js.Function1[/* a */ ActiveKey, Any]
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$active")
    var $active: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$orientation")
    var $orientation: js.UndefOr[horizontal | vertical] = js.undefined
  }
  object SharedStylePropsArg {
    
    inline def apply(): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    extension [Self <: SharedStylePropsArg](x: Self) {
      
      inline def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
      
      inline def set$activeUndefined: Self = StObject.set(x, "$active", js.undefined)
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
      
      inline def set$orientation(value: horizontal | vertical): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
      
      inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
    }
  }
  
  type StateChangeType = change_
  
  type StateReducer = js.Function3[
    /* stateChangeType */ StateChangeType, 
    /* nextState */ StatefulTabsState, 
    /* currentState */ StatefulTabsState, 
    StatefulTabsState
  ]
  
  /* Inlined std.Omit<baseui.baseui/tabs/types.TabsProps, 'activeKey'> & {  initialState :baseui.baseui/tabs/types.StatefulTabsState | undefined,   stateReducer :baseui.baseui/tabs/types.StateReducer} */
  trait StatefulTabsProps extends StObject {
    
    var children: js.Array[ReactElement] | ReactElement
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**  Initial state of the component */
    var initialState: js.UndefOr[StatefulTabsState] = js.undefined
    
    var onChange: js.UndefOr[OnChangeHandler] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var overrides: js.UndefOr[TabsOverrides] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    /**  A state change handler. */
    var stateReducer: StateReducer
  }
  object StatefulTabsProps {
    
    inline def apply(
      children: js.Array[ReactElement] | ReactElement,
      stateReducer: (/* stateChangeType */ StateChangeType, /* nextState */ StatefulTabsState, /* currentState */ StatefulTabsState) => StatefulTabsState
    ): StatefulTabsProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer))
      __obj.asInstanceOf[StatefulTabsProps]
    }
    
    extension [Self <: StatefulTabsProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialState(value: StatefulTabsState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* a */ ActiveKey => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverrides(value: TabsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateChangeType */ StateChangeType, /* nextState */ StatefulTabsState, /* currentState */ StatefulTabsState) => StatefulTabsState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    }
  }
  
  trait StatefulTabsState extends StObject {
    
    var activeKey: Key
  }
  object StatefulTabsState {
    
    inline def apply(activeKey: Key): StatefulTabsState = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulTabsState]
    }
    
    extension [Self <: StatefulTabsState](x: Self) {
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabOverrides extends StObject {
    
    var Tab: js.UndefOr[Override[Any]] = js.undefined
  }
  object TabOverrides {
    
    inline def apply(): TabOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabOverrides]
    }
    
    extension [Self <: TabOverrides](x: Self) {
      
      inline def setTab(value: Override[Any]): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    }
  }
  
  trait TabPanelProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Sets the tab to disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**  Unique key for the tab. Defaults to the child index. */
    var key: js.UndefOr[Key] = js.undefined
    
    /** onClick handler for the Tab element */
    var onClick: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
    
    /** onKeyDown handler for the Tab element */
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Any]] = js.undefined
    
    /** onSelect handler for the Tab element */
    var onSelect: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var overrides: js.UndefOr[TabOverrides] = js.undefined
    
    /** Title of the Tab to be shown in the Tab bar */
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object TabPanelProps {
    
    inline def apply(): TabPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelProps]
    }
    
    extension [Self <: TabPanelProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClick(value: /* e */ Event => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnSelect(value: () => Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOverrides(value: TabOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TabProps
    extends StObject
       with TabPanelProps {
    
    @JSName("$orientation")
    var $orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def set$orientation(value: horizontal | vertical): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
      
      inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait TabsOverrides extends StObject {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Tab: js.UndefOr[Override[Any]] = js.undefined
    
    var TabBar: js.UndefOr[Override[Any]] = js.undefined
    
    var TabContent: js.UndefOr[Override[Any]] = js.undefined
  }
  object TabsOverrides {
    
    inline def apply(): TabsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsOverrides]
    }
    
    extension [Self <: TabsOverrides](x: Self) {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTab(value: Override[Any]): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
      
      inline def setTabBar(value: Override[Any]): Self = StObject.set(x, "TabBar", value.asInstanceOf[js.Any])
      
      inline def setTabBarUndefined: Self = StObject.set(x, "TabBar", js.undefined)
      
      inline def setTabContent(value: Override[Any]): Self = StObject.set(x, "TabContent", value.asInstanceOf[js.Any])
      
      inline def setTabContentUndefined: Self = StObject.set(x, "TabContent", js.undefined)
      
      inline def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    }
  }
  
  trait TabsProps extends StObject {
    
    /**  Key of the the tab to be selected. */
    var activeKey: Key
    
    /** An array of Tab components. */
    var children: js.Array[ReactElement] | ReactElement
    
    /** If set to true all its tabs will be disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Change handler that is called every time a new tab is selected */
    var onChange: js.UndefOr[OnChangeHandler] = js.undefined
    
    /** Sets the orientation of the Tab component */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var overrides: js.UndefOr[TabsOverrides] = js.undefined
    
    /** Renders all tab content for SEO purposes regardless of tab active state */
    var renderAll: js.UndefOr[Boolean] = js.undefined
  }
  object TabsProps {
    
    inline def apply(activeKey: Key, children: js.Array[ReactElement] | ReactElement): TabsProps = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* a */ ActiveKey => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverrides(value: TabsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    }
  }
}
