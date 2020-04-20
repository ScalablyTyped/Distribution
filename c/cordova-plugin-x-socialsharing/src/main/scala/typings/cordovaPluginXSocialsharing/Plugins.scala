package typings.cordovaPluginXSocialsharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins extends js.Object {
  var socialsharing: SocialSharing
}

object Plugins {
  @scala.inline
  def apply(socialsharing: SocialSharing): Plugins = {
    val __obj = js.Dynamic.literal(socialsharing = socialsharing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
}

