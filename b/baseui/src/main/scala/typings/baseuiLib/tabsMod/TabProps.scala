package typings
package baseuiLib.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  @JSName("$orientation")
  var $orientation: js.UndefOr[baseuiLib.baseuiLibStrings.horizontal | baseuiLib.baseuiLibStrings.vertical] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ stdLib.KeyboardEvent, _]] = js.undefined
  var onSelect: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[TabOverrides[SharedProps]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    $orientation: baseuiLib.baseuiLibStrings.horizontal | baseuiLib.baseuiLibStrings.vertical = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    key: reactLib.reactMod.Key = null,
    onClick: /* e */ stdLib.Event => _ = null,
    onKeyDown: /* e */ stdLib.KeyboardEvent => _ = null,
    onSelect: () => _ = null,
    overrides: TabOverrides[SharedProps] = null,
    title: reactLib.reactMod.ReactNode = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if ($orientation != null) __obj.updateDynamic("$orientation")($orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction0(onSelect))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

