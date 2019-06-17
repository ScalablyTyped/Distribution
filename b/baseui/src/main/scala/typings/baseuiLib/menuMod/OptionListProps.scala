package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionListProps extends js.Object {
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[scala.Boolean] = js.undefined
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, reactLib.reactMod.ReactNode]] = js.undefined
  var item: js.Any
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, _]] = js.undefined
  var overrides: js.UndefOr[baseuiLib.Anon_ListItem] = js.undefined
  var resetMenu: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var size: js.UndefOr[baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact] = js.undefined
  def getItemLabel(item: js.Any): reactLib.reactMod.ReactNode
}

object OptionListProps {
  @scala.inline
  def apply(
    getItemLabel: js.Any => reactLib.reactMod.ReactNode,
    item: js.Any,
    $isFocused: js.UndefOr[scala.Boolean] = js.undefined,
    $isHighlighted: js.UndefOr[scala.Boolean] = js.undefined,
    getChildMenu: /* item */ js.Any => reactLib.reactMod.ReactNode = null,
    onMouseEnter: /* event */ stdLib.MouseEvent => _ = null,
    overrides: baseuiLib.Anon_ListItem = null,
    resetMenu: () => scala.Unit = null,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact = null
  ): OptionListProps = {
    val __obj = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item)
    if (!js.isUndefined($isFocused)) __obj.updateDynamic("$isFocused")($isFocused)
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted)
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (resetMenu != null) __obj.updateDynamic("resetMenu")(js.Any.fromFunction0(resetMenu))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionListProps]
  }
}

