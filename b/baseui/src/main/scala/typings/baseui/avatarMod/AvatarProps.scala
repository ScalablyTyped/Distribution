package typings.baseui.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var name: String
  var overrides: js.UndefOr[AvatarOverrides[StyleProps]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    name: String,
    overrides: AvatarOverrides[StyleProps] = null,
    size: String = null,
    src: String = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
}

