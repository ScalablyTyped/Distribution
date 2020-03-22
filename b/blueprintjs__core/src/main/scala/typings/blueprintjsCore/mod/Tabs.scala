package typings.blueprintjsCore.mod

import typings.blueprintjsCore.AnonSelectedTabId
import typings.blueprintjsCore.PartialITabsProps
import typings.blueprintjsCore.TypeofTab
import typings.blueprintjsCore.tabsMod.ITabsProps
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Tabs")
@js.native
class Tabs ()
  extends typings.blueprintjsCore.componentsMod.Tabs {
  def this(props: ITabsProps) = this()
}

/* static members */
@JSImport("@blueprintjs/core", "Tabs")
@js.native
object Tabs extends js.Object {
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  var Expander: SFC[js.Object] = js.native
  var Tab: TypeofTab = js.native
  var defaultProps: PartialITabsProps = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(hasSelectedTabId: ITabsProps): AnonSelectedTabId = js.native
}

