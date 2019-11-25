package typings.bugsnagDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Notify extends js.Object {
  @JSName("notify")
  var notify_FAnon_Notify: String
  var sessions: String
}

object Anon_Notify {
  @scala.inline
  def apply(notify: String, sessions: String): Anon_Notify = {
    val __obj = js.Dynamic.literal(notify = notify.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Notify]
  }
}

