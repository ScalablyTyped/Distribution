package typings.cordovaPluginXSocialsharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  @JSName("share")
  var share_Original: SocialSharingW3C = js.native
  def share(shareData: SocialSharingW3CData): js.Promise[SocialSharingResult] = js.native
}

