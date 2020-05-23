package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment
import typings.ckeditorCkeditor5Engine.mod.view.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastRangeBackward extends js.Object {
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  var order: js.UndefOr[js.Array[Double]] = js.undefined
  var rootElement: js.UndefOr[Element | DocumentFragment] = js.undefined
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined
}

object LastRangeBackward {
  @scala.inline
  def apply(
    lastRangeBackward: js.UndefOr[Boolean] = js.undefined,
    order: js.Array[Double] = null,
    rootElement: Element | DocumentFragment = null,
    sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined
  ): LastRangeBackward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastRangeBackward)) __obj.updateDynamic("lastRangeBackward")(lastRangeBackward.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (rootElement != null) __obj.updateDynamic("rootElement")(rootElement.asInstanceOf[js.Any])
    if (!js.isUndefined(sameSelectionCharacters)) __obj.updateDynamic("sameSelectionCharacters")(sameSelectionCharacters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastRangeBackward]
  }
}

