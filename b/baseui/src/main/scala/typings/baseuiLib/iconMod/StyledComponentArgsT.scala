package typings
package baseuiLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledComponentArgsT extends js.Object {
  @JSName("$color")
  var $color: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StyledComponentArgsT {
  @scala.inline
  def apply($color: java.lang.String = null, $size: scala.Double | java.lang.String = null): StyledComponentArgsT = {
    val __obj = js.Dynamic.literal()
    if ($color != null) __obj.updateDynamic("$color")($color)
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentArgsT]
  }
}

