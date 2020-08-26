package typings.baseui.accordionMod

import typings.baseui.anon.ExpandedBoolean
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/accordion.SharedPanelProps & {  expanded :boolean | undefined} */
@js.native
trait PanelProps extends js.Object {
  var children: ReactNode = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Key] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, _]] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
  var overrides: js.UndefOr[PanelOverrides[SharedProps]] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var renderPanelContent: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object PanelProps {
  @scala.inline
  def apply(): PanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelProps]
  }
  @scala.inline
  implicit class PanelPropsOps[Self <: PanelProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOnChange(value: /* args */ ExpandedBoolean => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ Event => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* e */ KeyboardEvent => _): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOverrides(value: PanelOverrides[SharedProps]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
    @scala.inline
    def setRenderPanelContent(value: Boolean): Self = this.set("renderPanelContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderPanelContent: Self = this.set("renderPanelContent", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

