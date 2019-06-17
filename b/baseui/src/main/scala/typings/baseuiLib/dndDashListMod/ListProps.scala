package typings
package baseuiLib.dndDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends js.Object {
  var items: js.UndefOr[js.Array[reactLib.reactMod.ReactNode]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_NewIndexOldIndex, _]] = js.undefined
  var overrides: js.UndefOr[ListOverrides] = js.undefined
  var removable: js.UndefOr[scala.Boolean] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    items: js.Array[reactLib.reactMod.ReactNode] = null,
    onChange: /* args */ baseuiLib.Anon_NewIndexOldIndex => _ = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[scala.Boolean] = js.undefined
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable)
    __obj.asInstanceOf[ListProps]
  }
}

