package typings.baseui

import typings.baseui.anon.PartialStatefulTabsProps
import typings.baseui.anon.PartialTabsProps
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.div
import typings.baseui.tabsStatefulTabsMod.default
import typings.baseui.tabsTypesMod.SharedStylePropsArg
import typings.baseui.tabsTypesMod.StatefulTabsState
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  object ORIENTATION {
    
    @JSImport("baseui/tabs", "ORIENTATION.horizontal")
    @js.native
    val horizontal: typings.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/tabs", "ORIENTATION.vertical")
    @js.native
    val vertical: typings.baseui.baseuiStrings.vertical = js.native
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/tabs", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
  
  @JSImport("baseui/tabs", "StatefulTabs")
  @js.native
  open class StatefulTabs () extends default
  /* static members */
  object StatefulTabs {
    
    @JSImport("baseui/tabs", "StatefulTabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/tabs", "StatefulTabs.defaultProps")
    @js.native
    def defaultProps: PartialStatefulTabsProps = js.native
    inline def defaultProps_=(x: PartialStatefulTabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/tabs", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/tabs", "StyledTab")
  @js.native
  val StyledTab: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/tabs", "StyledTabBar")
  @js.native
  val StyledTabBar: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/tabs", "StyledTabContent")
  @js.native
  val StyledTabContent: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/tabs", "Tab")
  @js.native
  open class Tab ()
    extends typings.baseui.tabsTabMod.default
  object Tab {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/tabs", "Tab.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/tabs", "Tab.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tabs", "Tab.defaultProps.expanded")
      @js.native
      def expanded: Boolean = js.native
      inline def expanded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expanded")(x.asInstanceOf[js.Any])
      
      inline def onClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClick")().asInstanceOf[Unit]
      
      inline def onKeyDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyDown")().asInstanceOf[Unit]
      
      inline def onSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelect")().asInstanceOf[Unit]
      
      @JSImport("baseui/tabs", "Tab.defaultProps.title")
      @js.native
      def title: String = js.native
      inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/tabs", "Tabs")
  @js.native
  open class Tabs ()
    extends typings.baseui.tabsTabsMod.default
  /* static members */
  object Tabs {
    
    @JSImport("baseui/tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: PartialTabsProps = js.native
    inline def defaultProps_=(x: PartialTabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type State = StatefulTabsState
}
