package typings
package baseuiLib.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarOverrides[T] extends js.Object {
  var Avatar: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var Initials: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[T]] = js.undefined
}

object AvatarOverrides {
  @scala.inline
  def apply[T](
    Avatar: baseuiLib.Override[T] = null,
    Initials: baseuiLib.Override[T] = null,
    Root: baseuiLib.Override[T] = null
  ): AvatarOverrides[T] = {
    val __obj = js.Dynamic.literal()
    if (Avatar != null) __obj.updateDynamic("Avatar")(Avatar.asInstanceOf[js.Any])
    if (Initials != null) __obj.updateDynamic("Initials")(Initials.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarOverrides[T]]
  }
}

