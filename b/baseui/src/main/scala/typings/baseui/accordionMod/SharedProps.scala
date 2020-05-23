package typings.baseui.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedProps extends js.Object {
  @JSName("$color")
  var $color: js.UndefOr[String] = js.undefined
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  @JSName("$expanded")
  var $expanded: js.UndefOr[Boolean] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[String | Double] = js.undefined
}

object SharedProps {
  @scala.inline
  def apply(
    $color: String = null,
    $disabled: js.UndefOr[Boolean] = js.undefined,
    $expanded: js.UndefOr[Boolean] = js.undefined,
    $size: String | Double = null
  ): SharedProps = {
    val __obj = js.Dynamic.literal()
    if ($color != null) __obj.updateDynamic("$color")($color.asInstanceOf[js.Any])
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined($expanded)) __obj.updateDynamic("$expanded")($expanded.get.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
}

