package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileWatchersInfo extends js.Object {
  /** The path of the entry being observed. */
  var entryPath: java.lang.String
  /** Optional. Tag used by the last notification for the watcher.  */
  var lastTag: js.UndefOr[java.lang.String] = js.undefined
  /** Whether watching should include all child entries recursively. It can be true for directories only. */
  var recursive: scala.Boolean
}

