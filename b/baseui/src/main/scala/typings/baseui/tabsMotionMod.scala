package typings.baseui

import typings.baseui.anon.ActiveKey
import typings.react.mod.FC
import typings.react.mod.Key
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMotionMod {
  
  @JSImport("baseui/tabs-motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FILL extends StObject
  @JSImport("baseui/tabs-motion", "FILL")
  @js.native
  object FILL extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FILL & String] = js.native
    
    @js.native
    sealed trait fixed
      extends StObject
         with FILL
    /* "fixed" */ val fixed: typings.baseui.tabsMotionMod.FILL.fixed & String = js.native
    
    @js.native
    sealed trait intrinsic
      extends StObject
         with FILL
    /* "intrinsic" */ val intrinsic: typings.baseui.tabsMotionMod.FILL.intrinsic & String = js.native
  }
  
  @js.native
  sealed trait ORIENTATION extends StObject
  @JSImport("baseui/tabs-motion", "ORIENTATION")
  @js.native
  object ORIENTATION extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ORIENTATION & String] = js.native
    
    @js.native
    sealed trait horizontal
      extends StObject
         with ORIENTATION
    /* "horizontal" */ val horizontal: typings.baseui.tabsMotionMod.ORIENTATION.horizontal & String = js.native
    
    @js.native
    sealed trait vertical
      extends StObject
         with ORIENTATION
    /* "vertical" */ val vertical: typings.baseui.tabsMotionMod.ORIENTATION.vertical & String = js.native
  }
  
  @js.native
  sealed trait STATE_CHANGE_TYPE extends StObject
  @JSImport("baseui/tabs-motion", "STATE_CHANGE_TYPE")
  @js.native
  object STATE_CHANGE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[STATE_CHANGE_TYPE & String] = js.native
    
    @js.native
    sealed trait change
      extends StObject
         with STATE_CHANGE_TYPE
    /* "change" */ val change: typings.baseui.tabsMotionMod.STATE_CHANGE_TYPE.change & String = js.native
  }
  
  @JSImport("baseui/tabs-motion", "StatefulTabs")
  @js.native
  val StatefulTabs: FC[StatefulTabsProps] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledArtworkContainer")
  @js.native
  val StyledArtworkContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTab")
  @js.native
  val StyledTab: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabBorder")
  @js.native
  val StyledTabBorder: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabHighlight")
  @js.native
  val StyledTabHighlight: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabList")
  @js.native
  val StyledTabList: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabPanel")
  @js.native
  val StyledTabPanel: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tabs-motion", "Tab")
  @js.native
  val Tab: FC[TabProps] = js.native
  
  @JSImport("baseui/tabs-motion", "Tabs")
  @js.native
  val Tabs: FC[TabsProps] = js.native
  
  @scala.inline
  def getTabId(uid: String, key: Key): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabId")(uid.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getTabPanelId(uid: String, key: Key): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabPanelId")(uid.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isFixed(fill: FILL): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixed")(fill.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isHorizontal(orientation: ORIENTATION): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontal")(orientation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIntrinsic(fill: FILL): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntrinsic")(fill.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isRTL(direction: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")(direction.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isVertical(orientation: ORIENTATION): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(orientation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Action extends StObject {
    
    var payload: Key
    
    var `type`: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.STATE_CHANGE_TYPE[keyof baseui.baseui/tabs-motion.STATE_CHANGE_TYPE] */ js.Any
  }
  object Action {
    
    @scala.inline
    def apply(
      payload: Key,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.STATE_CHANGE_TYPE[keyof baseui.baseui/tabs-motion.STATE_CHANGE_TYPE] */ js.Any
    ): Action = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Key): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.STATE_CHANGE_TYPE[keyof baseui.baseui/tabs-motion.STATE_CHANGE_TYPE] */ js.Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // stateful-tabs
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
  
  type StateReducer = js.Function2[/* state */ State, /* action */ Action, State]
  
  trait StatefulTabsProps
    extends StObject
       with TabsProps {
    
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
      def setStateReducer(value: (/* state */ State, /* action */ Action) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  // tab
  trait TabOverrides extends StObject {
    
    var ArtworkContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
      ] = js.undefined
    
    var Tab: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $fill :FILL | undefined,   $orientation :ORIENTATION | undefined,   $focusVisible :boolean | undefined}> */ js.Any
      ] = js.undefined
    
    var TabPanel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $pad :boolean | undefined}> */ js.Any
      ] = js.undefined
  }
  object TabOverrides {
    
    @scala.inline
    def apply(): TabOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabOverrides]
    }
    
    @scala.inline
    implicit class TabOverridesMutableBuilder[Self <: TabOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtworkContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
      ): Self = StObject.set(x, "ArtworkContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkContainerUndefined: Self = StObject.set(x, "ArtworkContainer", js.undefined)
      
      @scala.inline
      def setTab(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $fill :FILL | undefined,   $orientation :ORIENTATION | undefined,   $focusVisible :boolean | undefined}> */ js.Any
      ): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPanel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $pad :boolean | undefined}> */ js.Any
      ): Self = StObject.set(x, "TabPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPanelUndefined: Self = StObject.set(x, "TabPanel", js.undefined)
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    }
  }
  
  trait TabProps extends StObject {
    
    var artwork: js.UndefOr[ReactNode] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var overrides: js.UndefOr[TabOverrides] = js.undefined
    
    var tabRef: js.UndefOr[MutableRefObject[js.UndefOr[HTMLButtonElement]]] = js.undefined
    
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
      def setArtwork(value: ReactNode): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOverrides(value: TabOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setTabRef(value: MutableRefObject[js.UndefOr[HTMLButtonElement]]): Self = StObject.set(x, "tabRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabRefUndefined: Self = StObject.set(x, "tabRef", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  // tabs
  trait TabsOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
      ] = js.undefined
    
    var TabBorder: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
      ] = js.undefined
    
    var TabHighlight: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined,   $length :number | undefined,   $distance :number | undefined,   $animate :boolean | undefined}> */ js.Any
      ] = js.undefined
    
    var TabList: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $fill :FILL | undefined,   $orientation :ORIENTATION | undefined}> */ js.Any
      ] = js.undefined
  }
  object TabsOverrides {
    
    @scala.inline
    def apply(): TabsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsOverrides]
    }
    
    @scala.inline
    implicit class TabsOverridesMutableBuilder[Self <: TabsOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setTabBorder(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
      ): Self = StObject.set(x, "TabBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBorderUndefined: Self = StObject.set(x, "TabBorder", js.undefined)
      
      @scala.inline
      def setTabHighlight(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined,   $length :number | undefined,   $distance :number | undefined,   $animate :boolean | undefined}> */ js.Any
      ): Self = StObject.set(x, "TabHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabHighlightUndefined: Self = StObject.set(x, "TabHighlight", js.undefined)
      
      @scala.inline
      def setTabList(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $fill :FILL | undefined,   $orientation :ORIENTATION | undefined}> */ js.Any
      ): Self = StObject.set(x, "TabList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabListUndefined: Self = StObject.set(x, "TabList", js.undefined)
    }
  }
  
  trait TabsProps extends StObject {
    
    var activateOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var activeKey: js.UndefOr[Key] = js.undefined
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.FILL[keyof baseui.baseui/tabs-motion.FILL] */ js.Any
      ] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* params */ ActiveKey, Unit]] = js.undefined
    
    var orientation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.ORIENTATION[keyof baseui.baseui/tabs-motion.ORIENTATION] */ js.Any
      ] = js.undefined
    
    var overrides: js.UndefOr[TabsOverrides] = js.undefined
    
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
      def setActivateOnFocus(value: Boolean): Self = StObject.set(x, "activateOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivateOnFocusUndefined: Self = StObject.set(x, "activateOnFocus", js.undefined)
      
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
      def setFill(
        value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.FILL[keyof baseui.baseui/tabs-motion.FILL] */ js.Any
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* params */ ActiveKey => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOrientation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.ORIENTATION[keyof baseui.baseui/tabs-motion.ORIENTATION] */ js.Any
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOverrides(value: TabsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    }
  }
}
