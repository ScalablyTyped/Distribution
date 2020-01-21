package typings.bugsnagJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotify extends js.Object {
  @JSName("notify")
  var notify_FAnonNotify: String
  var sessions: String
}

object AnonNotify {
  @scala.inline
  def apply(notify: String, sessions: String): AnonNotify = {
    val __obj = js.Dynamic.literal(notify = notify.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNotify]
  }
}

