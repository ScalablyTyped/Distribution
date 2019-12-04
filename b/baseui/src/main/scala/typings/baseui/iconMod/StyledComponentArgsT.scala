package typings.baseui.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledComponentArgsT extends js.Object {
  @JSName("$color")
  var $color: js.UndefOr[String] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[Double | String] = js.undefined
}

object StyledComponentArgsT {
  @scala.inline
  def apply($color: String = null, $size: Double | String = null): StyledComponentArgsT = {
    val __obj = js.Dynamic.literal()
    if ($color != null) __obj.updateDynamic("$color")($color.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentArgsT]
  }
}

