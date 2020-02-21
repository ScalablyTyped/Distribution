package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadge extends js.Object {
  var badge: js.UndefOr[js.Object] = js.undefined
}

object AnonBadge {
  @scala.inline
  def apply(badge: js.Object = null): AnonBadge = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadge]
  }
}

