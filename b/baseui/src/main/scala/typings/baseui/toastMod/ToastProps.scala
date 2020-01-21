package typings.baseui.toastMod

import typings.baseui.AnonDismiss
import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[(js.Function1[/* args */ AnonDismiss, ReactNode]) | ReactNode] = js.undefined
  var closeable: js.UndefOr[Boolean] = js.undefined
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var kind: js.UndefOr[info | positive | warning | negative] = js.undefined
  var notificationType: js.UndefOr[`inline` | toast] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  var overrides: js.UndefOr[ToastOverrides] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    autoHideDuration: Int | Double = null,
    children: (js.Function1[/* args */ AnonDismiss, ReactNode]) | ReactNode = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    `data-baseweb`: String = null,
    key: Key = null,
    kind: info | positive | warning | negative = null,
    notificationType: `inline` | toast = null,
    onBlur: /* e */ Event_ => _ = null,
    onClose: () => _ = null,
    onFocus: /* e */ Event_ => _ = null,
    onMouseEnter: /* e */ Event_ => _ = null,
    onMouseLeave: /* e */ Event_ => _ = null,
    overrides: ToastOverrides = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
}

