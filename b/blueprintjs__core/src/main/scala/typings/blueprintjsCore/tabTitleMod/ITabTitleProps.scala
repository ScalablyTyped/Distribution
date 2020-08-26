package typings.blueprintjsCore.tabTitleMod

import typings.blueprintjsCore.tabMod.ITabProps
import typings.blueprintjsCore.tabMod.TabId
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabTitleProps extends ITabProps {
  /** ID of the parent `Tabs` to which this tab belongs. Used to generate ID for ARIA attributes. */
  var parentId: TabId = js.native
  /** Whether the tab is currently selected. */
  var selected: Boolean = js.native
  /** Handler invoked when this tab is clicked. */
  def onClick(id: TabId, event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
}

object ITabTitleProps {
  @scala.inline
  def apply(
    id: TabId,
    onClick: (TabId, MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
    parentId: TabId,
    selected: Boolean
  ): ITabTitleProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), parentId = parentId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabTitleProps]
  }
  @scala.inline
  implicit class ITabTitlePropsOps[Self <: ITabTitleProps] (val x: Self) extends AnyVal {
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
    def setOnClick(value: (TabId, MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def setParentId(value: TabId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

