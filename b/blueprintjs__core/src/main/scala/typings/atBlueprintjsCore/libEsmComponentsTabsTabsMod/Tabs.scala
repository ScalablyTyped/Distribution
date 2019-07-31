package typings.atBlueprintjsCore.libEsmComponentsTabsTabsMod

import typings.atBlueprintjsCore.TypeofClassTab
import typings.atBlueprintjsCore.libEsmCommonAbstractPureComponentMod.AbstractPureComponent
import typings.react.reactMod.FunctionComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs")
@js.native
class Tabs () extends AbstractPureComponent[ITabsProps, ITabsState] {
  def this(props: ITabsProps) = this()
  var getInitialSelectedTabId: js.Any = js.native
  var getKeyCodeDirection: js.Any = js.native
  /** Filters children to only `<Tab>`s */
  var getTabChildren: js.Any = js.native
  var getTabChildrenProps: js.Any = js.native
  /** Queries root HTML element for all tabs with optional filter selector */
  var getTabElements: js.Any = js.native
  var handleKeyDown: js.Any = js.native
  var handleKeyPress: js.Any = js.native
  var handleTabClick: js.Any = js.native
  /**
    * Calculate the new height, width, and position of the tab indicator.
    * Store the CSS values so the transition animation can start.
    */
  var moveSelectionIndicator: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderTabPanel: js.Any = js.native
  var renderTabTitle: js.Any = js.native
  var tablistElement: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(prevProps: ITabsProps, prevState: ITabsState): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabs(hasSelectedTabId: ITabsProps): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  var Expander: FunctionComponent[js.Object] = js.native
  var Tab: TypeofClassTab = js.native
  var defaultProps: Partial[ITabsProps] = js.native
  var displayName: String = js.native
}

