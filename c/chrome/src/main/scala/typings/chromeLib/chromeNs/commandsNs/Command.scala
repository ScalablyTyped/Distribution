package typings
package chromeLib.chromeNs.commandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /** Optional. The Extension Command description  */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The name of the Extension Command  */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The shortcut active for this command, or blank if not active.  */
  var shortcut: js.UndefOr[java.lang.String] = js.undefined
}

