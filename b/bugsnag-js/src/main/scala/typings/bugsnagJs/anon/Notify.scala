package typings.bugsnagJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notify extends js.Object {
  @JSName("notify")
  var notify_FNotify: String
  var sessions: String
}

object Notify {
  @scala.inline
  def apply(notify: String, sessions: String): Notify = {
    val __obj = js.Dynamic.literal(notify = notify.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notify]
  }
}

