package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LastRangeBackward extends js.Object {
  var lastRangeBackward: js.UndefOr[scala.Boolean] = js.undefined
  var order: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var rootElement: js.UndefOr[
    atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment
  ] = js.undefined
  var sameSelectionCharacters: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_LastRangeBackward {
  @scala.inline
  def apply(
    lastRangeBackward: js.UndefOr[scala.Boolean] = js.undefined,
    order: js.Array[scala.Double] = null,
    rootElement: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment = null,
    sameSelectionCharacters: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_LastRangeBackward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastRangeBackward)) __obj.updateDynamic("lastRangeBackward")(lastRangeBackward)
    if (order != null) __obj.updateDynamic("order")(order)
    if (rootElement != null) __obj.updateDynamic("rootElement")(rootElement.asInstanceOf[js.Any])
    if (!js.isUndefined(sameSelectionCharacters)) __obj.updateDynamic("sameSelectionCharacters")(sameSelectionCharacters)
    __obj.asInstanceOf[Anon_LastRangeBackward]
  }
}

