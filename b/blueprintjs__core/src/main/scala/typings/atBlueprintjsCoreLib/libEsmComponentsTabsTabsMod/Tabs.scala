package typings
package atBlueprintjsCoreLib.libEsmComponentsTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs")
@js.native
class Tabs ()
  extends atBlueprintjsCoreLib.libEsmCommonAbstractPureComponentMod.AbstractPureComponent[ITabsProps, ITabsState] {
  def this(props: ITabsProps) = this()
  var handleKeyDown: js.Any = js.native
  var handleKeyPress: js.Any = js.native
  var handleTabClick: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderTabPanel: js.Any = js.native
  var renderTabTitle: js.Any = js.native
  var tablistElement: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(prevProps: ITabsProps, prevState: ITabsState): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabs(hasSelectedTabId: ITabsProps): scala.Unit = js.native
  /* private */ def getInitialSelectedTabId(): js.Any = js.native
  /* private */ def getKeyCodeDirection(e: js.Any): js.Any = js.native
  /** Filters children to only `<Tab>`s */
  /* private */ def getTabChildren(): js.Any = js.native
  /* private */ def getTabChildren(props: js.Any): js.Any = js.native
  /* private */ def getTabChildrenProps(): js.Any = js.native
  /* private */ def getTabChildrenProps(props: js.Any): js.Any = js.native
  /** Queries root HTML element for all tabs with optional filter selector */
  /* private */ def getTabElements(): js.Any = js.native
  /* private */ def getTabElements(subselector: js.Any): js.Any = js.native
  /**
    * Calculate the new height, width, and position of the tab indicator.
    * Store the CSS values so the transition animation can start.
    */
  /* private */ def moveSelectionIndicator(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  @JSName("Expander")
  var Expander_Original: reactLib.reactMod.ReactNs.StatelessComponent[js.Object] = js.native
  var Tab: atBlueprintjsCoreLib.Anon_DefaultPropsDisplayNameITabProps = js.native
  var defaultProps: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsTabsTabsMod.ITabsProps] = js.native
  var displayName: java.lang.String = js.native
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  def Expander(props: js.Object with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  def Expander(props: js.Object with reactLib.Anon_Children, context: js.Any): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
}

