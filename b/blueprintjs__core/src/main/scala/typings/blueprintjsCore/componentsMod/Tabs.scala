package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.PartialTabsProps
import typings.blueprintjsCore.anon.SelectedTabId
import typings.blueprintjsCore.anon.TypeofTab
import typings.blueprintjsCore.tabsMod.TabsProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Tabs")
@js.native
open class Tabs protected ()
  extends typings.blueprintjsCore.tabsMod.Tabs {
  def this(props: TabsProps) = this()
}
/* static members */
object Tabs {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs")
  @js.native
  val ^ : js.Any = js.native
  
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs.Expander")
  @js.native
  def Expander: FC[js.Object] = js.native
  inline def Expander_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expander")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs.Tab")
  @js.native
  def Tab: TypeofTab = js.native
  inline def Tab_=(x: TypeofTab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs.defaultProps")
  @js.native
  def defaultProps: PartialTabsProps = js.native
  inline def defaultProps_=(x: PartialTabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(hasSelectedTabId: TabsProps): SelectedTabId | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasSelectedTabId.asInstanceOf[js.Any]).asInstanceOf[SelectedTabId | Null]
}
