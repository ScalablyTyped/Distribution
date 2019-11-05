package typings.cordovaDashPluginDashXDashSocialsharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialSharingResult extends js.Object {
  var app: js.UndefOr[String] = js.undefined
  var completed: Boolean
}

object SocialSharingResult {
  @scala.inline
  def apply(completed: Boolean, app: String = null): SocialSharingResult = {
    val __obj = js.Dynamic.literal(completed = completed)
    if (app != null) __obj.updateDynamic("app")(app)
    __obj.asInstanceOf[SocialSharingResult]
  }
}

