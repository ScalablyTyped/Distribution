package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryPathRecursiveRequestedEventOptions extends EntryPathRequestedEventOptions {
  /** Whether the operation is recursive (for directories only). */
  var recursive: scala.Boolean
}

object EntryPathRecursiveRequestedEventOptions {
  @scala.inline
  def apply(
    entryPath: java.lang.String,
    fileSystemId: java.lang.String,
    recursive: scala.Boolean,
    requestId: scala.Double
  ): EntryPathRecursiveRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entryPath")(entryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("recursive")(recursive)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[EntryPathRecursiveRequestedEventOptions]
  }
}

