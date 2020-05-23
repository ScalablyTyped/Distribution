package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/accordion.SharedProps & {  $expanded ? :never} */
trait SharedPropsexpandednever extends js.Object {
  @JSName("$color")
  var $color: js.UndefOr[String] = js.undefined
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  @JSName("$expanded")
  var $expanded: js.UndefOr[Boolean] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[String | Double] = js.undefined
}

object SharedPropsexpandednever {
  @scala.inline
  def apply(
    $color: String = null,
    $disabled: js.UndefOr[Boolean] = js.undefined,
    $expanded: js.UndefOr[Boolean] = js.undefined,
    $size: String | Double = null
  ): SharedPropsexpandednever = {
    val __obj = js.Dynamic.literal()
    if ($color != null) __obj.updateDynamic("$color")($color.asInstanceOf[js.Any])
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined($expanded)) __obj.updateDynamic("$expanded")($expanded.get.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPropsexpandednever]
  }
}

