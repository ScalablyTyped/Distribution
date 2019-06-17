package typings
package baseuiLib.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var name: java.lang.String
  var overrides: js.UndefOr[AvatarOverrides[StyleProps]] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    overrides: AvatarOverrides[StyleProps] = null,
    size: java.lang.String = null,
    src: java.lang.String = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (size != null) __obj.updateDynamic("size")(size)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[AvatarProps]
  }
}

