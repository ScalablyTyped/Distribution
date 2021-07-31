package typings.baseui

import typings.baseui.anon.ActiveKey
import typings.baseui.anon.SharedPropsactivebooleanu
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  trait ORIENTATION extends StObject {
    
    var horizontal: typings.baseui.baseuiStrings.horizontal
    
    var vertical: typings.baseui.baseuiStrings.vertical
  }
  object ORIENTATION {
    
    @JSImport("baseui/tabs", "ORIENTATION")
    @js.native
    val ^ : ORIENTATION = js.native
    
    @scala.inline
    implicit class ORIENTATIONMutableBuilder[Self <: ORIENTATION] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/tabs", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/tabs", "StatefulTabs")
  @js.native
  class StatefulTabs protected ()
    extends Component[StatefulTabsProps, State, js.Any] {
    def this(props: StatefulTabsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatefulTabsProps, context: js.Any) = this()
    
    def getInitialKey(): js.Any = js.native
    
    @JSName("internalSetState")
    def internalSetState_change(`type`: change_, changes: State): Unit = js.native
    
    def onTabChange(newState: State): Unit = js.native
  }
  
  @JSImport("baseui/tabs", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs", "StyledTab")
  @js.native
  val StyledTab: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs", "StyledTabBar")
  @js.native
  val StyledTabBar: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs", "StyledTabContent")
  @js.native
  val StyledTabContent: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs", "Tab")
  @js.native
  class Tab protected ()
    extends Component[TabProps, js.Object, js.Any] {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: js.Any) = this()
    
    def getSharedProps(): SharedProps = js.native
    
    def onClick(e: Event): Unit = js.native
    
    def onKeyDown(e: KeyboardEvent): Unit = js.native
  }
  
  @JSImport("baseui/tabs", "Tabs")
  @js.native
  val Tabs: FC[TabsProps] = js.native
  
  trait SharedProps extends StObject {
    
    @JSName("$active")
    var $active: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$orientation")
    var $orientation: js.UndefOr[horizontal | vertical] = js.undefined
  }
  object SharedProps {
    
    @scala.inline
    def apply(): SharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedProps]
    }
    
    @scala.inline
    implicit class SharedPropsMutableBuilder[Self <: SharedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$activeUndefined: Self = StObject.set(x, "$active", js.undefined)
      
      @scala.inline
      def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      @scala.inline
      def set$orientation(value: horizontal | vertical): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var activeKey: Key
  }
  object State {
    
    @scala.inline
    def apply(activeKey: Key): State = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    }
  }
  
  type StateReducer = js.Function3[change_, /* nextState */ State, /* currentState */ State, State]
  
  trait StatefulTabsProps
    extends StObject
       with TabsProps {
    
    @JSName("activeKey")
    var activeKey_StatefulTabsProps: js.UndefOr[scala.Nothing] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulTabsProps {
    
    @scala.inline
    def apply(): StatefulTabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulTabsProps]
    }
    
    @scala.inline
    implicit class StatefulTabsPropsMutableBuilder[Self <: StatefulTabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait TabOverrides[T] extends StObject {
    
    var Tab: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
  }
  object TabOverrides {
    
    @scala.inline
    def apply[T](): TabOverrides[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabOverrides[T]]
    }
    
    @scala.inline
    implicit class TabOverridesMutableBuilder[Self <: TabOverrides[?], T] (val x: Self & TabOverrides[T]) extends AnyVal {
      
      @scala.inline
      def setTab(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    }
  }
  
  trait TabProps extends StObject {
    
    @JSName("$orientation")
    var $orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ Event, js.Any]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, js.Any]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var overrides: js.UndefOr[TabOverrides[SharedProps]] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object TabProps {
    
    @scala.inline
    def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$orientation(value: horizontal | vertical): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ Event => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ KeyboardEvent => js.Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnSelect(value: () => js.Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOverrides(value: TabOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TabsOverrides[T] extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var Tab: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var TabBar: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var TabContent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
  }
  object TabsOverrides {
    
    @scala.inline
    def apply[T](): TabsOverrides[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsOverrides[T]]
    }
    
    @scala.inline
    implicit class TabsOverridesMutableBuilder[Self <: TabsOverrides[?], T] (val x: Self & TabsOverrides[T]) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setTab(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBar(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "TabBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarUndefined: Self = StObject.set(x, "TabBar", js.undefined)
      
      @scala.inline
      def setTabContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "TabContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabContentUndefined: Self = StObject.set(x, "TabContent", js.undefined)
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    }
  }
  
  trait TabsProps extends StObject {
    
    var activeKey: js.UndefOr[Key] = js.undefined
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* args */ ActiveKey, js.Any]] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var overrides: js.UndefOr[TabsOverrides[SharedPropsactivebooleanu]] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
  }
  object TabsProps {
    
    @scala.inline
    def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ ActiveKey => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOverrides(value: TabsOverrides[SharedPropsactivebooleanu]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    }
  }
}
