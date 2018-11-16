package typings
package chromeLib.chromeNs.fileBrowserHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileHandlerExecuteEventDetails extends js.Object {
  /** Array of Entry instances representing files that are targets of this action (selected in ChromeOS file browser). */
  var entries: js.Array[_]
  /** Optional. The ID of the tab that raised this event. Tab IDs are unique within a browser session.  */
  var tab_id: js.UndefOr[scala.Double] = js.undefined
}

