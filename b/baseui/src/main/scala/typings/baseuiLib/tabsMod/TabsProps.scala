package typings
package baseuiLib.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeKey: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_ActiveKey, _]] = js.undefined
  var orientation: js.UndefOr[baseuiLib.baseuiLibStrings.horizontal | baseuiLib.baseuiLibStrings.vertical] = js.undefined
  var overrides: js.UndefOr[TabsOverrides[SharedProps with baseuiLib.Anon_Active]] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    activeKey: reactLib.reactMod.Key = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* args */ baseuiLib.Anon_ActiveKey => _ = null,
    orientation: baseuiLib.baseuiLibStrings.horizontal | baseuiLib.baseuiLibStrings.vertical = null,
    overrides: TabsOverrides[SharedProps with baseuiLib.Anon_Active] = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[TabsProps]
  }
}

