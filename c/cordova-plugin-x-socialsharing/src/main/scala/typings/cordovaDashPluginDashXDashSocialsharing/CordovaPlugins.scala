package typings.cordovaDashPluginDashXDashSocialsharing

import typings.cordovaDashPluginDashXDashSocialsharing.SocialSharingPlugin.SocialSharing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var socialsharing: SocialSharing
}

object CordovaPlugins {
  @scala.inline
  def apply(socialsharing: SocialSharing): CordovaPlugins = {
    val __obj = js.Dynamic.literal(socialsharing = socialsharing)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

