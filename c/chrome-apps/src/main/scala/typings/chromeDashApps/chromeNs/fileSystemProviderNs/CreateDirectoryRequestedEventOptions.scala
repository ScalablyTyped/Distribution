package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions
import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectoryRequestedEventOptions extends RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: String
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean
}

object CreateDirectoryRequestedEventOptions {
  @scala.inline
  def apply(directoryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): CreateDirectoryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath, fileSystemId = fileSystemId, recursive = recursive, requestId = requestId)
  
    __obj.asInstanceOf[CreateDirectoryRequestedEventOptions]
  }
}

