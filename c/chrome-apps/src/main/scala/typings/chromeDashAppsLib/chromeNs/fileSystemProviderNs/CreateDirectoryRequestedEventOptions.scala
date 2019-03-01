package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectoryRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: java.lang.String
  /** Whether the operation is recursive (for directories only). */
  var recursive: scala.Boolean
}

object CreateDirectoryRequestedEventOptions {
  @scala.inline
  def apply(
    directoryPath: java.lang.String,
    fileSystemId: java.lang.String,
    recursive: scala.Boolean,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): CreateDirectoryRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directoryPath")(directoryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("recursive")(recursive)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[CreateDirectoryRequestedEventOptions]
  }
}

