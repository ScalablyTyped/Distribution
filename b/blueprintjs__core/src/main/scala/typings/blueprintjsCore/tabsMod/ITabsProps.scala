package typings.blueprintjsCore.tabsMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.tabMod.TabId
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabsProps extends IProps {
  /**
    * Whether the selected tab indicator should animate its movement.
    * @default true
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Initial selected tab `id`, for uncontrolled usage.
    * Note that this prop refers only to `<Tab>` children; other types of elements are ignored.
    * @default first tab
    */
  var defaultSelectedTabId: js.UndefOr[TabId] = js.native
  /**
    * Unique identifier for this `Tabs` container. This will be combined with the `id` of each
    * `Tab` child to generate ARIA accessibility attributes. IDs are required and should be
    * unique on the page to support server-side rendering.
    */
  var id: TabId = js.native
  /**
    * If set to `true`, the tab titles will display with larger styling.
    * This will apply large styles only to the tabs at this level, not to nested tabs.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * A callback function that is invoked when a tab in the tab list is clicked.
    */
  var onChange: js.UndefOr[
    js.Function3[
      /* newTabId */ TabId, 
      /* prevTabId */ TabId, 
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  /**
    * Whether inactive tab panels should be removed from the DOM and unmounted in React.
    * This can be a performance enhancement when rendering many complex panels, but requires
    * careful support for unmounting and remounting.
    * @default false
    */
  var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.native
  /**
    * Selected tab `id`, for controlled usage.
    * Providing this prop will put the component in controlled mode.
    * Unknown ids will result in empty selection (no errors).
    */
  var selectedTabId: js.UndefOr[TabId] = js.native
  /**
    * Whether to show tabs stacked vertically on the left side.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object ITabsProps {
  @scala.inline
  def apply(id: TabId): ITabsProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabsProps]
  }
  @scala.inline
  implicit class ITabsPropsOps[Self <: ITabsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: TabId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setDefaultSelectedTabId(value: TabId): Self = this.set("defaultSelectedTabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedTabId: Self = this.set("defaultSelectedTabId", js.undefined)
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* newTabId */ TabId, /* prevTabId */ TabId, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setRenderActiveTabPanelOnly(value: Boolean): Self = this.set("renderActiveTabPanelOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderActiveTabPanelOnly: Self = this.set("renderActiveTabPanelOnly", js.undefined)
    @scala.inline
    def setSelectedTabId(value: TabId): Self = this.set("selectedTabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTabId: Self = this.set("selectedTabId", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

