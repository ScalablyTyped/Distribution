package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryPathRecursiveRequestedEventOptions extends DirectoryPathRequestedEventOptions {
  /** Whether the operation is recursive (for directories only). */
  var recursive: scala.Boolean
}

object DirectoryPathRecursiveRequestedEventOptions {
  @scala.inline
  def apply(
    directoryPath: java.lang.String,
    fileSystemId: java.lang.String,
    recursive: scala.Boolean,
    requestId: scala.Double
  ): DirectoryPathRecursiveRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directoryPath")(directoryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("recursive")(recursive)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[DirectoryPathRecursiveRequestedEventOptions]
  }
}

