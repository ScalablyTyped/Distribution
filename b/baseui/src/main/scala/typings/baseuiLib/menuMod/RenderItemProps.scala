package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItemProps extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isFocused: js.UndefOr[scala.Boolean] = js.undefined
  var isHighlighted: js.UndefOr[scala.Boolean] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
  var resetMenu: js.UndefOr[js.Function0[_]] = js.undefined
}

object RenderItemProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    isFocused: js.UndefOr[scala.Boolean] = js.undefined,
    isHighlighted: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.Ref[_] = null,
    resetMenu: () => _ = null
  ): RenderItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (!js.isUndefined(isHighlighted)) __obj.updateDynamic("isHighlighted")(isHighlighted)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (resetMenu != null) __obj.updateDynamic("resetMenu")(js.Any.fromFunction0(resetMenu))
    __obj.asInstanceOf[RenderItemProps]
  }
}

