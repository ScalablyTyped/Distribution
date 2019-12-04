package typings.baseui.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarState extends js.Object {
  var noImageAvailable: Boolean
}

object AvatarState {
  @scala.inline
  def apply(noImageAvailable: Boolean): AvatarState = {
    val __obj = js.Dynamic.literal(noImageAvailable = noImageAvailable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AvatarState]
  }
}

