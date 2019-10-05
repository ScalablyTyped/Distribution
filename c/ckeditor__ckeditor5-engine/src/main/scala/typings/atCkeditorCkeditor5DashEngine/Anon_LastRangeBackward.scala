package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.DocumentFragment
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LastRangeBackward extends js.Object {
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  var order: js.UndefOr[js.Array[Double]] = js.undefined
  var rootElement: js.UndefOr[Element | DocumentFragment] = js.undefined
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined
}

object Anon_LastRangeBackward {
  @scala.inline
  def apply(
    lastRangeBackward: js.UndefOr[Boolean] = js.undefined,
    order: js.Array[Double] = null,
    rootElement: Element | DocumentFragment = null,
    sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined
  ): Anon_LastRangeBackward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastRangeBackward)) __obj.updateDynamic("lastRangeBackward")(lastRangeBackward)
    if (order != null) __obj.updateDynamic("order")(order)
    if (rootElement != null) __obj.updateDynamic("rootElement")(rootElement.asInstanceOf[js.Any])
    if (!js.isUndefined(sameSelectionCharacters)) __obj.updateDynamic("sameSelectionCharacters")(sameSelectionCharacters)
    __obj.asInstanceOf[Anon_LastRangeBackward]
  }
}

