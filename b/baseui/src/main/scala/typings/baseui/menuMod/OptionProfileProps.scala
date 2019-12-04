package typings.baseui.menuMod

import typings.baseui.Anon_Body
import typings.baseui.Anon_ListItemProfile
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProfileProps extends js.Object {
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, ReactNode]] = js.undefined
  var item: js.Any
  var overrides: js.UndefOr[Anon_ListItemProfile] = js.undefined
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  def getProfileItemImg(item: js.Any): String | ComponentType[_]
  def getProfileItemImgText(item: js.Any): String
  def getProfileItemLabels(item: js.Any): Anon_Body
}

object OptionProfileProps {
  @scala.inline
  def apply(
    getProfileItemImg: js.Any => String | ComponentType[_],
    getProfileItemImgText: js.Any => String,
    getProfileItemLabels: js.Any => Anon_Body,
    item: js.Any,
    $isHighlighted: js.UndefOr[Boolean] = js.undefined,
    getChildMenu: /* item */ js.Any => ReactNode = null,
    overrides: Anon_ListItemProfile = null,
    resetMenu: () => Unit = null
  ): OptionProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item.asInstanceOf[js.Any])
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted.asInstanceOf[js.Any])
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (resetMenu != null) __obj.updateDynamic("resetMenu")(js.Any.fromFunction0(resetMenu))
    __obj.asInstanceOf[OptionProfileProps]
  }
}

