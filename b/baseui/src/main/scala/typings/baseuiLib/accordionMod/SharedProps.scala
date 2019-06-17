package typings
package baseuiLib.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedProps extends js.Object {
  @JSName("$color")
  var $color: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$disabled")
  var $disabled: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$expanded")
  var $expanded: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object SharedProps {
  @scala.inline
  def apply(
    $color: java.lang.String = null,
    $disabled: js.UndefOr[scala.Boolean] = js.undefined,
    $expanded: js.UndefOr[scala.Boolean] = js.undefined,
    $size: java.lang.String | scala.Double = null
  ): SharedProps = {
    val __obj = js.Dynamic.literal()
    if ($color != null) __obj.updateDynamic("$color")($color)
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled)
    if (!js.isUndefined($expanded)) __obj.updateDynamic("$expanded")($expanded)
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
}

