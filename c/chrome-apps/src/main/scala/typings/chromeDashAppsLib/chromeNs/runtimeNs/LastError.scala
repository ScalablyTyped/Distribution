package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastError extends js.Object {
  /** Details about the error which occurred.  */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object LastError {
  @scala.inline
  def apply(message: java.lang.String = null): LastError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[LastError]
  }
}

