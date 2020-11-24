package typings.cordovaPluginXSocialsharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends js.Object {
  
  def share(shareData: SocialSharingW3CData): js.Promise[SocialSharingResult] = js.native
  @JSName("share")
  var share_Original: SocialSharingW3C = js.native
}
