package typings.baseui.menuMod

import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItemProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var isHighlighted: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var resetMenu: js.UndefOr[js.Function0[_]] = js.undefined
}

object RenderItemProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isHighlighted: js.UndefOr[Boolean] = js.undefined,
    ref: Ref[_] = null,
    resetMenu: () => _ = null
  ): RenderItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(isHighlighted)) __obj.updateDynamic("isHighlighted")(isHighlighted.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (resetMenu != null) __obj.updateDynamic("resetMenu")(js.Any.fromFunction0(resetMenu))
    __obj.asInstanceOf[RenderItemProps]
  }
}

