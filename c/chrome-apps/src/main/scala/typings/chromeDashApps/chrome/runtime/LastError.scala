package typings.chromeDashApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastError extends js.Object {
  /** Details about the error which occurred.  */
  var message: js.UndefOr[String] = js.undefined
}

object LastError {
  @scala.inline
  def apply(message: String = null): LastError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[LastError]
  }
}

/** This will be defined during an API method callback if there was an error */
@JSGlobal("chrome.runtime.lastError")
@js.native
object lastError
  extends TopLevel[js.UndefOr[LastError]]

