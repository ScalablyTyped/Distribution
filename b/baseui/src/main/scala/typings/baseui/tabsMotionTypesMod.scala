package typings.baseui

import typings.baseui.anon.ActiveKey
import typings.baseui.anon.sizeIconPropssizecolorIco
import typings.baseui.baseuiStrings.change_
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMotionTypesMod {
  
  /* Inlined { readonly fixed :'fixed',  readonly intrinsic :'intrinsic'}[keyof { readonly fixed :'fixed',  readonly intrinsic :'intrinsic'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.fixed
    - typings.baseui.baseuiStrings.intrinsic
  */
  trait Fill extends StObject
  object Fill {
    
    inline def fixed: typings.baseui.baseuiStrings.fixed = "fixed".asInstanceOf[typings.baseui.baseuiStrings.fixed]
    
    inline def intrinsic: typings.baseui.baseuiStrings.intrinsic = "intrinsic".asInstanceOf[typings.baseui.baseuiStrings.intrinsic]
  }
  
  /* Inlined { readonly vertical :'vertical',  readonly horizontal :'horizontal'}[keyof { readonly vertical :'vertical',  readonly horizontal :'horizontal'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.vertical
    - typings.baseui.baseuiStrings.horizontal
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def horizontal: typings.baseui.baseuiStrings.horizontal = "horizontal".asInstanceOf[typings.baseui.baseuiStrings.horizontal]
    
    inline def vertical: typings.baseui.baseuiStrings.vertical = "vertical".asInstanceOf[typings.baseui.baseuiStrings.vertical]
  }
  
  /* Inlined { readonly change :'change'}[keyof { readonly change :'change'}] */
  type StateChange = change_
  
  trait StatefulTabsAction extends StObject {
    
    var payload: Key
    
    var `type`: StateChange
  }
  object StatefulTabsAction {
    
    inline def apply(payload: Key, `type`: StateChange): StatefulTabsAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulTabsAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulTabsAction] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: Key): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: StateChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatefulTabsProps
    extends StObject
       with TabsProps {
    
    var initialState: js.UndefOr[StatefulTabsState] = js.undefined
    
    var stateReducer: js.UndefOr[StatefulTabsReducer] = js.undefined
  }
  object StatefulTabsProps {
    
    inline def apply(): StatefulTabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulTabsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulTabsProps] (val x: Self) extends AnyVal {
      
      inline def setInitialState(value: StatefulTabsState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setStateReducer(value: (/* state */ StatefulTabsState, /* action */ StatefulTabsAction) => StatefulTabsState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  type StatefulTabsReducer = js.Function2[/* state */ StatefulTabsState, /* action */ StatefulTabsAction, StatefulTabsState]
  
  trait StatefulTabsState extends StObject {
    
    var activeKey: Key
  }
  object StatefulTabsState {
    
    inline def apply(activeKey: Key): StatefulTabsState = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulTabsState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulTabsState] (val x: Self) extends AnyVal {
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabOverrides extends StObject {
    
    var ArtworkContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Tab: js.UndefOr[Override[Any]] = js.undefined
    
    var TabPanel: js.UndefOr[Override[Any]] = js.undefined
  }
  object TabOverrides {
    
    inline def apply(): TabOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabOverrides] (val x: Self) extends AnyVal {
      
      inline def setArtworkContainer(value: Override[Any]): Self = StObject.set(x, "ArtworkContainer", value.asInstanceOf[js.Any])
      
      inline def setArtworkContainerUndefined: Self = StObject.set(x, "ArtworkContainer", js.undefined)
      
      inline def setTab(value: Override[Any]): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
      
      inline def setTabPanel(value: Override[Any]): Self = StObject.set(x, "TabPanel", value.asInstanceOf[js.Any])
      
      inline def setTabPanelUndefined: Self = StObject.set(x, "TabPanel", js.undefined)
      
      inline def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    }
  }
  
  trait TabProps extends StObject {
    
    var artwork: js.UndefOr[ComponentType[sizeIconPropssizecolorIco]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var overrides: js.UndefOr[TabOverrides] = js.undefined
    
    var tabRef: js.UndefOr[Ref[HTMLButtonElement]] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      inline def setArtwork(value: ComponentType[sizeIconPropssizecolorIco]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOverrides(value: TabOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTabRef(value: Ref[HTMLButtonElement]): Self = StObject.set(x, "tabRef", value.asInstanceOf[js.Any])
      
      inline def setTabRefFunction1(value: /* instance */ HTMLButtonElement | Null => Unit): Self = StObject.set(x, "tabRef", js.Any.fromFunction1(value))
      
      inline def setTabRefNull: Self = StObject.set(x, "tabRef", null)
      
      inline def setTabRefUndefined: Self = StObject.set(x, "tabRef", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TabsOverrides extends StObject {
    
    var EndEnhancerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var StyledTabBar: js.UndefOr[Override[Any]] = js.undefined
    
    var TabBorder: js.UndefOr[Override[Any]] = js.undefined
    
    var TabHighlight: js.UndefOr[Override[Any]] = js.undefined
    
    var TabList: js.UndefOr[Override[Any]] = js.undefined
  }
  object TabsOverrides {
    
    inline def apply(): TabsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsOverrides] (val x: Self) extends AnyVal {
      
      inline def setEndEnhancerContainer(value: Override[Any]): Self = StObject.set(x, "EndEnhancerContainer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerContainerUndefined: Self = StObject.set(x, "EndEnhancerContainer", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStyledTabBar(value: Override[Any]): Self = StObject.set(x, "StyledTabBar", value.asInstanceOf[js.Any])
      
      inline def setStyledTabBarUndefined: Self = StObject.set(x, "StyledTabBar", js.undefined)
      
      inline def setTabBorder(value: Override[Any]): Self = StObject.set(x, "TabBorder", value.asInstanceOf[js.Any])
      
      inline def setTabBorderUndefined: Self = StObject.set(x, "TabBorder", js.undefined)
      
      inline def setTabHighlight(value: Override[Any]): Self = StObject.set(x, "TabHighlight", value.asInstanceOf[js.Any])
      
      inline def setTabHighlightUndefined: Self = StObject.set(x, "TabHighlight", js.undefined)
      
      inline def setTabList(value: Override[Any]): Self = StObject.set(x, "TabList", value.asInstanceOf[js.Any])
      
      inline def setTabListUndefined: Self = StObject.set(x, "TabList", js.undefined)
    }
  }
  
  trait TabsProps extends StObject {
    
    var activateOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var activeKey: js.UndefOr[Key] = js.undefined
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[ReactNode] = js.undefined
    
    var fill: js.UndefOr[Fill] = js.undefined
    
    var onChange: js.UndefOr[typings.baseui.tabsMotionTypesMod.onChange] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var overrides: js.UndefOr[TabsOverrides] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    var uid: js.UndefOr[String] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      inline def setActivateOnFocus(value: Boolean): Self = StObject.set(x, "activateOnFocus", value.asInstanceOf[js.Any])
      
      inline def setActivateOnFocusUndefined: Self = StObject.set(x, "activateOnFocus", js.undefined)
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOnChange(value: /* params */ ActiveKey => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverrides(value: TabsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  type onChange = js.Function1[/* params */ ActiveKey, Unit]
}
