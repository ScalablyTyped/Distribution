package typings.baseui.tabsMod

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Event_
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.undefined
  var onSelect: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[TabOverrides[SharedProps]] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    $orientation: horizontal | vertical = null,
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    key: Key = null,
    onClick: /* e */ Event_ => _ = null,
    onKeyDown: /* e */ KeyboardEvent => _ = null,
    onSelect: () => _ = null,
    overrides: TabOverrides[SharedProps] = null,
    title: ReactNode = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if ($orientation != null) __obj.updateDynamic("$orientation")($orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction0(onSelect))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

