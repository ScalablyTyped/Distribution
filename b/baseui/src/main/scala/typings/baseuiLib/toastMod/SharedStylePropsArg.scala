package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStylePropsArg extends js.Object {
  @JSName("$closeable")
  var $closeable: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$color")
  var $color: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$isRendered")
  var $isRendered: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$kind")
  var $kind: js.UndefOr[
    baseuiLib.baseuiLibStrings.info | baseuiLib.baseuiLibStrings.positive | baseuiLib.baseuiLibStrings.warning | baseuiLib.baseuiLibStrings.negative
  ] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  @JSName("$type")
  var $type: js.UndefOr[baseuiLib.baseuiLibStrings.`inline` | baseuiLib.baseuiLibStrings.toast] = js.undefined
}

object SharedStylePropsArg {
  @scala.inline
  def apply(
    $closeable: js.UndefOr[scala.Boolean] = js.undefined,
    $color: java.lang.String = null,
    $isRendered: js.UndefOr[scala.Boolean] = js.undefined,
    $isVisible: js.UndefOr[scala.Boolean] = js.undefined,
    $kind: baseuiLib.baseuiLibStrings.info | baseuiLib.baseuiLibStrings.positive | baseuiLib.baseuiLibStrings.warning | baseuiLib.baseuiLibStrings.negative = null,
    $size: scala.Double | java.lang.String = null,
    $type: baseuiLib.baseuiLibStrings.`inline` | baseuiLib.baseuiLibStrings.toast = null
  ): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($closeable)) __obj.updateDynamic("$closeable")($closeable)
    if ($color != null) __obj.updateDynamic("$color")($color)
    if (!js.isUndefined($isRendered)) __obj.updateDynamic("$isRendered")($isRendered)
    if (!js.isUndefined($isVisible)) __obj.updateDynamic("$isVisible")($isVisible)
    if ($kind != null) __obj.updateDynamic("$kind")($kind.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if ($type != null) __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArg]
  }
}

