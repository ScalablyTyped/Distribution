package typings.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/menu.StatefulContainerState & {  items :baseui.baseui/menu.ItemsT,   getRequiredItemProps :baseui.baseui/menu.GetRequiredItemProps} */
@js.native
trait RenderProps extends js.Object {
  var activedescendantId: js.UndefOr[String] = js.native
  var getRequiredItemProps: GetRequiredItemProps = js.native
  var highlightedIndex: Double = js.native
  var isFocused: Boolean = js.native
  var items: ItemsT = js.native
}

object RenderProps {
  @scala.inline
  def apply(
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps,
    highlightedIndex: Double,
    isFocused: Boolean,
    items: ItemsT
  ): RenderProps = {
    val __obj = js.Dynamic.literal(getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
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
    def setGetRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): Self = this.set("getRequiredItemProps", js.Any.fromFunction2(value))
    @scala.inline
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: ItemT*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: ItemsT): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivedescendantId(value: String): Self = this.set("activedescendantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivedescendantId: Self = this.set("activedescendantId", js.undefined)
  }
  
}

