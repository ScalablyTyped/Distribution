package typings.atBlueprintjsSelect.libEsmCommonItemRendererMod

import typings.react.reactMod.MouseEventHandler
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
    handleClick: MouseEventHandler[HTMLElement],
    modifiers: IItemModifiers,
    query: String,
    index: Int | Double = null
  ): IItemRendererProps = {
    val __obj = js.Dynamic.literal(handleClick = handleClick, modifiers = modifiers, query = query)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRendererProps]
  }
}

