package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Notify extends js.Object {
  @JSName("notify")
  var notify_FAnon_Notify: java.lang.String
  var sessions: java.lang.String
}

object Anon_Notify {
  @scala.inline
  def apply(notify: java.lang.String, sessions: java.lang.String): Anon_Notify = {
    val __obj = js.Dynamic.literal(notify = notify, sessions = sessions)
  
    __obj.asInstanceOf[Anon_Notify]
  }
}

