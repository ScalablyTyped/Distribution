package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProfileProps extends js.Object {
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[scala.Boolean] = js.undefined
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, reactLib.reactMod.ReactNode]] = js.undefined
  var item: js.Any
  var overrides: js.UndefOr[baseuiLib.Anon_ListItemProfile] = js.undefined
  var resetMenu: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def getProfileItemImg(item: js.Any): java.lang.String | reactLib.reactMod.ComponentType[_]
  def getProfileItemImgText(item: js.Any): java.lang.String
  def getProfileItemLabels(item: js.Any): baseuiLib.Anon_Body
}

object OptionProfileProps {
  @scala.inline
  def apply(
    getProfileItemImg: js.Any => java.lang.String | reactLib.reactMod.ComponentType[_],
    getProfileItemImgText: js.Any => java.lang.String,
    getProfileItemLabels: js.Any => baseuiLib.Anon_Body,
    item: js.Any,
    $isHighlighted: js.UndefOr[scala.Boolean] = js.undefined,
    getChildMenu: /* item */ js.Any => reactLib.reactMod.ReactNode = null,
    overrides: baseuiLib.Anon_ListItemProfile = null,
    resetMenu: () => scala.Unit = null
  ): OptionProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item)
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted)
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (resetMenu != null) __obj.updateDynamic("resetMenu")(js.Any.fromFunction0(resetMenu))
    __obj.asInstanceOf[OptionProfileProps]
  }
}

