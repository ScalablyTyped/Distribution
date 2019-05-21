package typings
package atBlueprintjsSelectLib.libEsmCommonItemRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemRendererProps extends js.Object {
  /** Click event handler to select this item. */
  var handleClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Modifiers that describe how to render this item, such as `active` or `disabled`. */
  var modifiers: IItemModifiers
  /** The current query string used to filter the items. */
  var query: java.lang.String
}

object IItemRendererProps {
  @scala.inline
  def apply(
    handleClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement],
    modifiers: IItemModifiers,
    query: java.lang.String,
    index: scala.Int | scala.Double = null
  ): IItemRendererProps = {
    val __obj = js.Dynamic.literal(handleClick = handleClick, modifiers = modifiers, query = query)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRendererProps]
  }
}

