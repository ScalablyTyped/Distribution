package typings.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/menu.StatefulContainerState & {  items  :baseui.baseui/menu.ItemsT,   getRequiredItemProps  :baseui.baseui/menu.GetRequiredItemProps} */
trait RenderProps extends js.Object {
  var activedescendantId: js.UndefOr[String] = js.undefined
  var getRequiredItemProps: GetRequiredItemProps
  var highlightedIndex: Double
  var isFocused: Boolean
  var items: ItemsT
}

object RenderProps {
  @scala.inline
  def apply(
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps,
    highlightedIndex: Double,
    isFocused: Boolean,
    items: ItemsT,
    activedescendantId: String = null
  ): RenderProps = {
    val __obj = js.Dynamic.literal(getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (activedescendantId != null) __obj.updateDynamic("activedescendantId")(activedescendantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

