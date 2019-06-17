package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  var autoHideDuration: js.UndefOr[scala.Double] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var closeable: js.UndefOr[scala.Boolean] = js.undefined
  var `data-baseweb`: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var kind: js.UndefOr[
    baseuiLib.baseuiLibStrings.info | baseuiLib.baseuiLibStrings.positive | baseuiLib.baseuiLibStrings.warning | baseuiLib.baseuiLibStrings.negative
  ] = js.undefined
  var notificationType: js.UndefOr[baseuiLib.baseuiLibStrings.`inline` | baseuiLib.baseuiLibStrings.toast] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  var overrides: js.UndefOr[ToastOverrides] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    autoHideDuration: scala.Int | scala.Double = null,
    children: reactLib.reactMod.ReactNode = null,
    closeable: js.UndefOr[scala.Boolean] = js.undefined,
    `data-baseweb`: java.lang.String = null,
    key: reactLib.reactMod.Key = null,
    kind: baseuiLib.baseuiLibStrings.info | baseuiLib.baseuiLibStrings.positive | baseuiLib.baseuiLibStrings.warning | baseuiLib.baseuiLibStrings.negative = null,
    notificationType: baseuiLib.baseuiLibStrings.`inline` | baseuiLib.baseuiLibStrings.toast = null,
    onBlur: /* e */ stdLib.Event => _ = null,
    onClose: () => _ = null,
    onFocus: /* e */ stdLib.Event => _ = null,
    onMouseEnter: /* e */ stdLib.Event => _ = null,
    onMouseLeave: /* e */ stdLib.Event => _ = null,
    overrides: ToastOverrides = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable)
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[ToastProps]
  }
}

