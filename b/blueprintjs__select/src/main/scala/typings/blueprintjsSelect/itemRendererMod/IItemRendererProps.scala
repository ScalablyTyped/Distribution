package typings.blueprintjsSelect.itemRendererMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemRendererProps extends js.Object {
  /** Click event handler to select this item. */
  var handleClick: MouseEventHandler[HTMLElement]
  var index: js.UndefOr[Double] = js.undefined
  /** Modifiers that describe how to render this item, such as `active` or `disabled`. */
  var modifiers: IItemModifiers
  /** The current query string used to filter the items. */
  var query: String
}

object IItemRendererProps {
  @scala.inline
  def apply(
    handleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    modifiers: IItemModifiers,
    query: String,
    index: js.UndefOr[Double] = js.undefined
  ): IItemRendererProps = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1(handleClick), modifiers = modifiers.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRendererProps]
  }
}

