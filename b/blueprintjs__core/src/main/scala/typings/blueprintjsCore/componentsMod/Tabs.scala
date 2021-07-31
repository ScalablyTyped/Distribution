package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.PartialITabsProps
import typings.blueprintjsCore.anon.SelectedTabId
import typings.blueprintjsCore.anon.TypeofTab
import typings.blueprintjsCore.tabsMod.ITabsProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Tabs")
@js.native
class Tabs protected ()
  extends typings.blueprintjsCore.tabsMod.Tabs {
  def this(props: ITabsProps) = this()
}
/* static members */
object Tabs {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs")
  @js.native
  val ^ : js.Any = js.native
  
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs.Expander")
  @js.native
  def Expander: FunctionComponent[js.Object] = js.native
  @scala.inline
  def Expander_=(x: FunctionComponent[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expander")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs.Tab")
  @js.native
  def Tab: TypeofTab = js.native
  @scala.inline
  def Tab_=(x: TypeofTab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs.defaultProps")
  @js.native
  def defaultProps: PartialITabsProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialITabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tabs.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getDerivedStateFromProps(hasSelectedTabId: ITabsProps): SelectedTabId | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasSelectedTabId.asInstanceOf[js.Any]).asInstanceOf[SelectedTabId | Null]
}
