package typings.cordovaDashPluginDashXDashSocialsharing.SocialSharingPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareResult extends js.Object {
  var app: js.Any
  var completed: Boolean
}

object ShareResult {
  @scala.inline
  def apply(app: js.Any, completed: Boolean): ShareResult = {
    val __obj = js.Dynamic.literal(app = app, completed = completed)
  
    __obj.asInstanceOf[ShareResult]
  }
}

