package typings.baseui.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleProps extends js.Object {
  @JSName("$didImageFailToLoad")
  var $didImageFailToLoad: Boolean
  @JSName("$size")
  var $size: js.UndefOr[String] = js.undefined
}

object StyleProps {
  @scala.inline
  def apply($didImageFailToLoad: Boolean, $size: String = null): StyleProps = {
    val __obj = js.Dynamic.literal($didImageFailToLoad = $didImageFailToLoad.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleProps]
  }
}

