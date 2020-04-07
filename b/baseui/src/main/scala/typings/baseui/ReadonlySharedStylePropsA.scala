package typings.baseui

import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/toast.SharedStylePropsArg> */
trait ReadonlySharedStylePropsA extends js.Object {
  @JSName("$closeable")
  val $closeable: js.UndefOr[Boolean] = js.undefined
  @JSName("$isRendered")
  val $isRendered: js.UndefOr[Boolean] = js.undefined
  @JSName("$isVisible")
  val $isVisible: js.UndefOr[Boolean] = js.undefined
  @JSName("$kind")
  val $kind: js.UndefOr[info | positive | warning | negative] = js.undefined
  @JSName("$type")
  val $type: js.UndefOr[`inline` | toast] = js.undefined
}

object ReadonlySharedStylePropsA {
  @scala.inline
  def apply(
    $closeable: js.UndefOr[Boolean] = js.undefined,
    $isRendered: js.UndefOr[Boolean] = js.undefined,
    $isVisible: js.UndefOr[Boolean] = js.undefined,
    $kind: info | positive | warning | negative = null,
    $type: `inline` | toast = null
  ): ReadonlySharedStylePropsA = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($closeable)) __obj.updateDynamic("$closeable")($closeable.asInstanceOf[js.Any])
    if (!js.isUndefined($isRendered)) __obj.updateDynamic("$isRendered")($isRendered.asInstanceOf[js.Any])
    if (!js.isUndefined($isVisible)) __obj.updateDynamic("$isVisible")($isVisible.asInstanceOf[js.Any])
    if ($kind != null) __obj.updateDynamic("$kind")($kind.asInstanceOf[js.Any])
    if ($type != null) __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySharedStylePropsA]
  }
}

