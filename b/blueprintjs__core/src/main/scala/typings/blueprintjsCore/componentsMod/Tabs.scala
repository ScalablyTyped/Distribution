package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.PartialITabsProps
import typings.blueprintjsCore.anon.SelectedTabId
import typings.blueprintjsCore.anon.TypeofTab
import typings.blueprintjsCore.tabsMod.ITabsProps
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components", "Tabs")
@js.native
class Tabs ()
  extends typings.blueprintjsCore.tabsMod.Tabs {
  def this(props: ITabsProps) = this()
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components", "Tabs")
@js.native
object Tabs extends js.Object {
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  var Expander: SFC[js.Object] = js.native
  var Tab: TypeofTab = js.native
  var defaultProps: PartialITabsProps = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(hasSelectedTabId: ITabsProps): SelectedTabId = js.native
}

