package typings.blueprintjsSelect.itemRendererMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemRendererProps extends js.Object {
  /** Click event handler to select this item. */
  var handleClick: MouseEventHandler[HTMLElement] = js.native
  var index: js.UndefOr[Double] = js.native
  /** Modifiers that describe how to render this item, such as `active` or `disabled`. */
  var modifiers: IItemModifiers = js.native
  /** The current query string used to filter the items. */
  var query: String = js.native
}

object IItemRendererProps {
  @scala.inline
  def apply(
    handleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    modifiers: IItemModifiers,
    query: String
  ): IItemRendererProps = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1(handleClick), modifiers = modifiers.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRendererProps]
  }
  @scala.inline
  implicit class IItemRendererPropsOps[Self <: IItemRendererProps] (val x: Self) extends AnyVal {
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
    def setHandleClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("handleClick", js.Any.fromFunction1(value))
    @scala.inline
    def setModifiers(value: IItemModifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

