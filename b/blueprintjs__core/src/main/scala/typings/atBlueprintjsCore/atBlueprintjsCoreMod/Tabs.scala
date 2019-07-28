package typings.atBlueprintjsCore.atBlueprintjsCoreMod

import typings.atBlueprintjsCore.TypeofClassTab
import typings.atBlueprintjsCore.libEsmComponentsTabsTabsMod.ITabsProps
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Tabs")
@js.native
class Tabs ()
  extends typings.atBlueprintjsCore.libEsmComponentsMod.Tabs {
  def this(props: ITabsProps) = this()
}

/* static members */
@JSImport("@blueprintjs/core", "Tabs")
@js.native
object Tabs extends js.Object {
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  var Expander: StatelessComponent[js.Object] = js.native
  var Tab: TypeofClassTab = js.native
  var defaultProps: Partial[ITabsProps] = js.native
  var displayName: String = js.native
}

