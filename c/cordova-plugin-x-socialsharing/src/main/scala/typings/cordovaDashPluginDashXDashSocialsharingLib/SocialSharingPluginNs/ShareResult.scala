package typings
package cordovaDashPluginDashXDashSocialsharingLib.SocialSharingPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareResult extends js.Object {
  var app: js.Any
  var completed: scala.Boolean
}

object ShareResult {
  @scala.inline
  def apply(app: js.Any, completed: scala.Boolean): ShareResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("completed")(completed)
    __obj.asInstanceOf[ShareResult]
  }
}

