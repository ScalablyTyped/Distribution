package typings.baseui

import typings.baseui.anon.ActiveKeyString
import typings.baseui.anon.PartialTabsProps
import typings.baseui.tabsTypesMod.SharedStylePropsArg
import typings.baseui.tabsTypesMod.TabsProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsMod {
  
  @JSImport("baseui/tabs/tabs", JSImport.Default)
  @js.native
  open class default () extends Tabs
  /* static members */
  object default {
    
    @JSImport("baseui/tabs/tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/tabs/tabs", "default.defaultProps")
    @js.native
    def defaultProps: PartialTabsProps = js.native
    inline def defaultProps_=(x: PartialTabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tabs
    extends Component[TabsProps, js.Object, Any] {
    
    def getPanels(): Any = js.native
    
    def getSharedProps(): SharedStylePropsArg = js.native
    
    def getTabs(): Any = js.native
    
    def onChange(hasActiveKey: ActiveKeyString): Unit = js.native
  }
}
