package typings.cordovaPluginBadge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadge extends js.Object {
  var badge: CordovaPluginBadge
}

object AnonBadge {
  @scala.inline
  def apply(badge: CordovaPluginBadge): AnonBadge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBadge]
  }
}

