package typings
package baseuiLib.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleProps extends js.Object {
  @JSName("$didImageFailToLoad")
  var $didImageFailToLoad: scala.Boolean
  @JSName("$size")
  var $size: js.UndefOr[java.lang.String] = js.undefined
}

object StyleProps {
  @scala.inline
  def apply($didImageFailToLoad: scala.Boolean, $size: java.lang.String = null): StyleProps = {
    val __obj = js.Dynamic.literal($didImageFailToLoad = $didImageFailToLoad)
    if ($size != null) __obj.updateDynamic("$size")($size)
    __obj.asInstanceOf[StyleProps]
  }
}

