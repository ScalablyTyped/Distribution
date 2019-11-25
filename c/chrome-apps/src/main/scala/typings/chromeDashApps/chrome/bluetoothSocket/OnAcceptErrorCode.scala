package typings.chromeDashApps.chrome.bluetoothSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.system_error
  - typings.chromeDashApps.chromeDashAppsStrings.not_listening
*/
trait OnAcceptErrorCode extends js.Object

object OnAcceptErrorCode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def not_listening: typings.chromeDashApps.chromeDashAppsStrings.not_listening = this.cast("not_listening")
  @scala.inline
  def system_error: typings.chromeDashApps.chromeDashAppsStrings.system_error = this.cast("system_error")
}

