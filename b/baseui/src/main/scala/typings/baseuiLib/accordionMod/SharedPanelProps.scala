package typings
package baseuiLib.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedPanelProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_ExpandedBoolean, _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ stdLib.KeyboardEvent, _]] = js.undefined
  var overrides: js.UndefOr[PanelOverrides[SharedProps]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object SharedPanelProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    onChange: /* args */ baseuiLib.Anon_ExpandedBoolean => _ = null,
    onClick: /* e */ stdLib.Event => _ = null,
    onKeyDown: /* e */ stdLib.KeyboardEvent => _ = null,
    overrides: PanelOverrides[SharedProps] = null,
    title: reactLib.reactMod.ReactNode = null
  ): SharedPanelProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPanelProps]
  }
}

